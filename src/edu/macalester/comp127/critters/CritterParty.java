package edu.macalester.comp127.critters;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.reflections.Reflections;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Point;

/**
 * @author Paul Cantrell
 */
public class CritterParty {
    private static final int CRITTER_COUNT = 60;
    private static final boolean CAPTIONS_ENABLED = false;

    private final Random rand = new Random();
    private List<Class<? extends Critter>> critterClasses;
    private List<Critter> critters;
    private CanvasWindow canvas;

    @SuppressWarnings("InfiniteLoopStatement")
    public CritterParty() {
        canvas = new CanvasWindow("Critters", 2500, 1680);
        loadCritterClasses();
        critters = new ArrayList<>();
        for (int n = 0; n < 60; n++)
            addNewCritter();

        canvas.onClick(event -> {
            for (Critter critter : critters) {
                critter.setGoal(event.getPosition());
            }
        });

        canvas.animate(this::moveCritters);
    }

    private Critter addNewCritter() {
        Critter critter = createRandomCritter();

        GraphicsObject g = critter.getGraphics();
        Point point = randLocationFor(critter);
        g.setPosition(point.getX(), point.getY());
        chooseNewGoal(critter);
        critter.setSpeed(rand.nextDouble() * 20 + 10);

        canvas.add(critter.getGraphics());
        critters.add(critter);
        return critter;
    }

    private Critter createRandomCritter() {
        Class<? extends Critter> critterClass = critterClasses.get(rand.nextInt(critterClasses.size()));
        try {
            Critter critter = critterClass.getConstructor().newInstance();
            if (CAPTIONS_ENABLED) {
                GraphicsText caption = new GraphicsText(critterClass.getSimpleName());
                caption.setFont("Avenir Next", FontStyle.PLAIN, 11);
                critter.getGraphics().add(caption);
                caption.setCenter(
                    critter.getGraphics().getCenter().getX(),
                    critter.getGraphics().getHeight());
            }
            return critter;
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate " + critterClass, e);
        }
    }

    private void moveCritters(double dt) {
        for (Critter critter : critters) {
            critter.moveTowardsGoal(dt);

            // Near our goal? Just time to go somewhere else? Pick a new direction!
            double distToGoal = Math.hypot(
                critter.getGoal().getX() - critter.getGraphics().getX(),
                critter.getGoal().getY() - critter.getGraphics().getY());
            if (distToGoal < critter.getSize() || rand.nextDouble() < dt / 10)
                chooseNewGoal(critter);
        }

        // Critters exit off the top
        critters.removeIf(critter -> critter.getGraphics().getBoundsInParent().getMaxY() < 0);

        // New critters march in from the bottom
        while (critters.size() < CRITTER_COUNT) {
            GraphicsGroup newCritterGraphics = addNewCritter().getGraphics();
            newCritterGraphics.setY(canvas.getHeight() + newCritterGraphics.getHeight());
        }
    }

    /**
     * Finds all subclasses of Critter in this package.
     */
    private void loadCritterClasses() {
        Reflections reflections = new Reflections(getClass().getPackage().getName());
        critterClasses = new ArrayList<>(
            reflections.getSubTypesOf(Critter.class));
    }

    /**
     * Sends the critter off in a new direction.
     */
    private void chooseNewGoal(Critter critter) {
        critter.setGoal(randLocationInRange(critter.getGraphics()));
    }

    /**
     * Picks a random location that will approximately fit the given graphics object within the window.
     */
    private Point randLocationFor(Critter critter) {
        GraphicsObject g = critter.getGraphics();
        Rectangle2D bounds = g.getBounds();
        return new Point(
            rand.nextDouble() * (canvas.getWidth() - (bounds.getWidth() + critter.getxOffset())),
            rand.nextDouble() * (canvas.getHeight() - (bounds.getHeight() + critter.getyOffset()))
        );
    }

    private Point randLocationInRange(GraphicsObject g) {
        double maxRange = 500.0;
        Rectangle2D bounds = g.getBounds();
        edu.macalester.graphics.Point p0 = g.getPosition();
        double dx = rand.nextDouble() * (2.0 * maxRange) - maxRange;
        double dy = rand.nextDouble() * (2.0 * maxRange) - maxRange;
        double forwardProgess = -bounds.getHeight() * 2 - 10;  // critters tend upward, off the top edge of the screen
        return new Point(0, forwardProgess).add(
            Point.max(
                Point.ORIGIN,
                Point.min(
                    new Point(canvas.getWidth() - bounds.getWidth(), canvas.getHeight() - bounds.getHeight()),
                    new Point(p0.getX() + dx, p0.getY() + dy))));
    }

    public static void main(String[] args) {
        new CritterParty();
    }
}
