package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;

import java.awt.*;
import java.awt.geom.Point2D;

public class Ant_MM extends Critter {


    private final Color FILL_COLOR = new Color(115, 0, 3);

    @Override
    protected void buildGraphics() {

        xOffset = 60;
        yOffset = 110;

        createLeg(-80, -50, -20, -60);
        createLeg(-80, -15, -20, -25);
        createLeg(-95, 25, -22.5, 5);

        createRLegs(-20, -40, 33, -57);
        createRLegs(-20, -5, 33, -22);
        createRLegs(-22.5, 20, 33, 5);

        createSegments(-20, -20, 50, 60);
        createSegments(-20, -70, 50, 60);
        createSegments(-20, -120, 50, 60);

        addEye(createEye(), -13, -100);
        addEye(createEye(), 23, -100);

        createAntenna(-5, -110, -30, -130);
        createAntenna(15, -110, 40, -130);








    }

    private void createSegments(double x, double y, double width, double height) {
        Ellipse segment = new Ellipse(x, y, width, height);
        segment.setFillColor(FILL_COLOR);
        segment.setFilled(true);
        getGraphics().add(segment);
    }


    private void createLeg(double x1, double y1, double x2, double y2) {
        GraphicsGroup legGroup = new GraphicsGroup(0, 0);

        Line leg = new Line(0, 0, x2, y2);
        leg.setStrokeColor(Color.BLACK);
        leg.setStrokeWidth(5);
        legGroup.add(leg);

        double[] vectorFromLine = {x2 - x1, y2 - y1};

        double hypotenuse = Math.sqrt(Math.pow(vectorFromLine[0], 2) +
                Math.pow(vectorFromLine[1], 2)); // from magnitude of vector

        System.out.println(vectorFromLine[0] + " " +  hypotenuse);
        double deltaX = 2 * Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(x2 - x1, 2));
        System.out.println(deltaX);


        Line leg1 = new Line(x2, y2, x1 + deltaX, y1);
        leg1.setStrokeColor(Color.BLACK);
        leg1.setStrokeWidth(5);
        legGroup.add(leg1);

        addLeg(new Leg(legGroup, 5));
    }

    private void createRLegs(double x1, double y1, double x2, double y2) {
        GraphicsGroup legGroup = new GraphicsGroup(0, 0);

        Line leg = new Line(0, 0, x2, y2);
        leg.setStrokeColor(Color.BLACK);
        leg.setStrokeWidth(5);
        legGroup.add(leg);

        double[] vectorFromLine = {x2 - x1, y2 - y1};

        double hypotenuse = Math.sqrt(Math.pow(vectorFromLine[0], 2) +
                Math.pow(vectorFromLine[1], 2)); // from magnitude of vector

        System.out.println(vectorFromLine[0] + " " +  hypotenuse);
        double deltaX = 2 * Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(x2 - x1, 2));
        System.out.println(deltaX);


        Line leg1 = new Line(x2, y2, x2 + deltaX, y1);
        leg1.setStrokeColor(Color.BLACK);
        leg1.setStrokeWidth(5);
        legGroup.add(leg1);

        addLeg(new Leg(legGroup, 5));
    }

    private Eye createEye() {
        return new Eye(10, .75, .25, Color.GREEN);
    }

    private void createAntenna(double x1, double y1, double x2, double y2) {

        Line antenna0 = new Line(x1, y1, x2, y2);
        antenna0.setStrokeColor(Color.BLACK);
        antenna0.setStrokeWidth(2);
        getGraphics().add(antenna0);

        Point2D.Double quarterPoint = new Point2D.Double(3 * (x1 + x2)/4, 3 * (y1 + y2)/4);


        double deltaY = y2 - quarterPoint.getY();

        Line antenna1 = new Line(x2, y2, quarterPoint.getX(), y2 - deltaY);
        antenna1.setStrokeColor(Color.BLACK);
        antenna1.setStrokeWidth(2);
        getGraphics().add(antenna1);

    }

}
