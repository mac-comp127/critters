package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class SonPhanCritter extends Critter {
    private static final Color strokeColor = new Color(255, 0, 15);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = strokeColor;

    @Override
    public void moveTowardsGoal(double dt) {
        double dx = getGoal().getX() - getGraphics().getX(),
                dy = getGoal().getY() - getGraphics().getY(),
                dist = Math.hypot(dx, dy);
        moveBy(
                dx * 10*getSpeed() / dist,
                dy * 10*getSpeed() / dist,
                dt);
    }
    @Override
    protected void buildGraphics() {
        createLeg(-30, 10, -40, 30);
        createLeg(-30, -10, -44, 10);
        createLeg(-30, -30, -40, -10);
        createLeg(30, 10, 40, 30);
        createLeg(34, -10, 44, 10);
        createLeg(30, -30, 40, -10);

        Image head = null;
        try {
            head = new Image(-23, -20, Paths.get(getClass().getResource("/4.png").toURI()).toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        getGraphics().add(head);

        Eye leftEye = new Eye(7, 0.22, 0.18, Color.RED);
        Eye rightEye = new Eye(7, 0.22, 0.18, Color.RED);
        addEye(leftEye, 15 - 22, 2 - 20);
        addEye(rightEye, 40 - 22, 2 - 20);

        Rectangle antenna1  = new Rectangle(10, 10, 5, 40);
        antenna1.setStrokeColor(strokeColor);
        antenna1.setFilled(true);
        antenna1.setFillColor(fillColor);
        addLeg(new Leg(antenna1, 5));   // this leg will be animated when running CritterProgram

        Rectangle antenna2  = new Rectangle(-15, 10, 5, 40);
        antenna2.setStrokeColor(strokeColor);
        antenna2.setFilled(true);
        antenna2.setFillColor(fillColor);
        addLeg(new Leg(antenna2, 5));   // this leg will be animated when running CritterProgram

    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GraphicsGroup legGroup = new GraphicsGroup(0, 0);
        Color color = new Color(0, 0, 0);
        Line legLine0 = new Line(0, -2, x0, y0 - 1);
        legLine0.setStrokeColor(color);
        legGroup.add(legLine0);

        Line legLine1 = new Line(x0, y0 - 1, x1, y1);
        legLine1.setStrokeColor(color);
        legGroup.add(legLine1);

        Line legLine2 = new Line(x1, y1, x0, y0 + 1);
        legLine2.setStrokeColor(color);
        legGroup.add(legLine2);

        Line legLine3 = new Line(x0, y0 + 1, 0, 5);
        legLine3.setStrokeColor(color);
        legGroup.add(legLine3);


        addLeg(new Leg(legGroup, 6));
    }


}
