package edu.macalester.comp127.critters;

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;

/**
 * The base class for all critters.
 * Actual critters must implement buildGraphics and call addLeg and addEye.
 *
 * @author Paul Cantrell
 */
@SuppressWarnings("WeakerAccess")
public abstract class Critter {
    private final GraphicsGroup graphics;
    private double speed;
    private List<Eye> eyes;
    private List<Leg> legs;
    private Point goal;

    // Some critters are drawn so that the upper left corner x, y, of its shape
    // might be negative. If so, these should be changed in the subclass to show that.
    // See BoxBot and RoundBug for examples.
    protected double xOffset = 0.0;
    protected double yOffset = 0.0;

    public Critter() {
        eyes = new ArrayList<>();
        legs = new ArrayList<>();
        graphics = new GraphicsGroup(0, 0);
        buildGraphics();
    }

    /**
     * @return the underlying graphics component.
     */
    public GraphicsGroup getGraphics() {
        return graphics;
    }

    /**
     * @return the amount to offset the initial location of the graphic
     * in the x direction when using setLocation.
     */
    public double getxOffset() {
        return xOffset;
    }

    /**
     * @return the amount to offset the initial location of the graphic
     * in the y direction when using setLocation.
     */
    public double getyOffset() {
        return yOffset;
    }

    /**
     * Concrete classes must override this and use it to draw the shape.
     */
    protected abstract void buildGraphics();

    public double getSize() {
        return Math.hypot(getGraphics().getWidth(), getGraphics().getHeight());
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Point getGoal() {
        return goal;
    }

    public void setGoal(Point goal) {
        this.goal = goal;
    }

    public void moveTowardsGoal(double dt) {
        double dx = goal.getX() - getGraphics().getX(),
               dy = goal.getY() - getGraphics().getY(),
               dist = Math.hypot(dx, dy);
        moveBy(
            dx * getSpeed() / dist,
            dy * getSpeed() / dist,
            dt);
    }

    public void moveBy(double dx, double dy, double dt) {
        graphics.moveBy(dx * dt, dy * dt);

        for (Eye eye : eyes)
            eye.lookInDirectionOf(dx, dy, dt);

        for (Leg leg : legs)
            leg.bodyMovedBy(dx * dt, dy * dt);
    }

    /**
     * Adds a leg to the critter.
     */
    protected void addLeg(Leg leg) {
        getGraphics().add(leg.getGraphics());
        legs.add(leg);
        leg.setAnchored(legs.size() % 2 == 0);
    }

    /**
     * Adds an eye to the critter.
     */
    protected void addEye(Eye eye, double x, double y) {
        eye.getGraphics().setPosition(x, y);
        getGraphics().add(eye.getGraphics());
        eyes.add(eye);
    }
}
