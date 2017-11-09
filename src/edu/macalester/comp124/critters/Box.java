package edu.macalester.comp124.critters;

import comp124graphics.Rectangle;

import java.awt.Color;

public class Box extends Critter {


    private static final Color
            strokeColor = new Color(255,0,0),
            fillColor   = new Color(0,120,135);

    @Override
    protected void buildGraphics() {

        xOffset = 20.0;
        yOffset = 50.0;

        Rectangle face  = new Rectangle(-10, -35, 60, 40);
        face.setFilled(true);
        face.setFillColor(fillColor);
        face.setStrokeColor(fillColor);
        getGraphics().add(face);

        Rectangle body  = new Rectangle(-20, 10, 80, 75);
        body.setFilled(true);
        body.setFillColor(Color.GRAY);
        body.setStrokeColor(fillColor);
        getGraphics().add(body);

        Rectangle leftLeg  = new Rectangle(-7, 90, 15, 40);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));

        Rectangle rightLeg = new Rectangle(35, 90, 15, 40);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));

        Rectangle mouth  = new Rectangle(12, -10, 15, 10);
        mouth.setFilled(true);
        mouth.setFillColor(Color.RED);
        mouth.setStrokeColor(strokeColor);
        getGraphics().add(mouth);

        Eye leftEye = new Eye(10, 0.3, 0.18, Color.BLUE);
        Eye rightEye = new Eye(10, 0.3, 0.18, Color.ORANGE);
        addEye(leftEye, 10, -26);
        addEye(rightEye, 30, -26);
    }

}
