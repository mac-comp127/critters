package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;
import comp124graphics.Rectangle;

import java.awt.*;

public class ToothMonster extends Critter{
    protected void buildGraphics() {

        Ellipse head = new Ellipse(30, 30, 50, 30);
        head.setFillColor(new Color(100, 150, 150));
        head.setFilled(true);
        getGraphics().add(head);

        createMouth(45, 50, 65, 50);

        Eye leftEye = new Eye(10, .75, .20, Color.RED);
        Eye rightEye = new Eye(10, .75, .20, Color.GREEN);
        addEye(leftEye, 70, 40);
        addEye(rightEye, 40, 40);

        createLeg(45, 50);
        createLeg(55, 50);

    }

    private void createMouth(double x1, double y1, double x2, double y2) {
        Line mouth = new Line(x1, y1, x2, y2);
        mouth.setStrokeColor(Color.BLACK);
        getGraphics().add(mouth);
    }

    private void createLeg(double x1, double y1) {
        comp124graphics.Rectangle leftTooth = new Rectangle(x1, y1, 10, 15);
        leftTooth.setStrokeColor(Color.BLACK);
        leftTooth.setFilled(true);
        leftTooth.setFillColor(Color.WHITE);
        addLeg(new Leg(leftTooth, 2));
    }





}
