package edu.macalester.comp127.critters;

import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;

import java.awt.Color;

/**
 * @author Paul Cantrell
 */
@SuppressWarnings("WeakerAccess")
public class Eye {
    private final GraphicsObject graphics;
    private final GraphicsObject pupil;
    private final Point pupilRestPosition;
    private final double radius;

    /**
     * Creates a white eye with a black pupil, a white ocular highlight, and a colored iris.
     *
     * @param r             Eye radius
     * @param pupilSize     Proportion of the pupil radius to the eye radius
     * @param highlightSize Proportion of the highlight radius to the eye radius
     * @param iris          Color of the iris
     */
    public Eye(double r, double pupilSize, double highlightSize, Color iris) {
        // Create the iris
        Ellipse white = new Ellipse(-r, -r, r * 2, r * 2);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        white.setStrokeWidth(Math.min(1, r * 0.15));

        // Create the pupil.
        GraphicsGroup pupil = new GraphicsGroup(0, 0);

        double pupilR = r * pupilSize;
        Ellipse pupilMain = new Ellipse(-pupilR, -pupilR, pupilR * 2, pupilR * 2);
        pupilMain.setFilled(true);
        pupilMain.setFillColor(Color.BLACK);
        pupilMain.setStrokeColor(iris);
        pupil.add(pupilMain);

        // Create the eye "highlight"
        double highlightR = r * highlightSize;
        Ellipse highlight = new Ellipse(0, -highlightR * 2, highlightR * 2, highlightR * 2);
        highlight.setStrokeColor(new Color(0, 0, 0, 0));
        highlight.setFilled(true);
        highlight.setFillColor(new Color(255, 255, 255, 200));
        pupil.add(highlight);

        GraphicsGroup group = new GraphicsGroup(0, 0);
        group.add(white);
        group.add(pupil);

        this.graphics = group;
        this.pupil = pupil;
        pupilRestPosition = pupil.getPosition();
        this.radius = r - pupilR - 2;
    }

    /**
     * Creates a new eye with custom graphics. The given pupil object with move on the edge of a circle
     * centered about its current location.
     */
    public Eye(GraphicsGroup group, GraphicsObject pupil, double radius) {
        this.graphics = group;
        this.pupil = pupil;
        pupilRestPosition = pupil.getPosition();
        this.radius = radius;
    }

    public GraphicsObject getGraphics() {
        return graphics;
    }

    /**
     * Causes the eyes to move in the direction of the given vector.
     * The dt parameter is necessary because the eyes do not move instantaneously.
     */
    public void lookInDirectionOf(double dx, double dy, double dt) {
        double dist = Math.hypot(dx, dy);
        dx /= dist;
        dy /= dist;
        Point loc = pupil.getPosition();
        pupil.setPosition(
            this.blend(loc.getX(), pupilRestPosition.getX() + radius * dx, Math.pow(0.05, dt)),
            this.blend(loc.getY(), pupilRestPosition.getY() + radius * dy, Math.pow(0.05, dt)));
    }

    private double blend(double a, double b, double w) {
        return a * w + b * (1 - w);
    }
}
