package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Rectangle;

import java.awt.Color;

public class Frosty extends Critter {

    private static final Color
        strokeColor = new Color(40, 40, 60),
        fillColor = new Color(235, 235, 235),
        stickColor = new Color(153, 76, 0),
        carrotColor = new Color(255, 128, 0);

    @Override
    protected void buildGraphics() {
        xOffset = 20;
        yOffset = 56;

        Rectangle leftLeg  = new Rectangle(-16, 20, 5, 25);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(stickColor);
        addLeg(new Leg(leftLeg, 2));

        Rectangle rightLeg = new Rectangle(16, 20, 5, 25);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(stickColor);
        addLeg(new Leg(rightLeg, 2));


        Rectangle leftArm = new Rectangle(-40, 0, 25, 5);
        leftArm.setStrokeColor(strokeColor);
        leftArm.setFilled(true);
        leftArm.setFillColor(stickColor);
        getGraphics().add(leftArm);

        Rectangle rightArm = new Rectangle(20, 0, 25, 5);
        rightArm.setStrokeColor(strokeColor);
        rightArm.setFilled(true);
        rightArm.setFillColor(stickColor);
        getGraphics().add(rightArm);


        Ellipse body = new Ellipse(-22, -15, 50, 50);
        body.setStrokeColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        Ellipse head = new Ellipse(-18, -56, 40, 40);
        head.setStrokeColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye, -10, -40);
        addEye(rightEye, 10, -40);

        Rectangle hat = new Rectangle(-15, -85, 30, 30);
        hat.setFilled(true);
        hat.setFillColor(strokeColor);
        getGraphics().add(hat);

        Rectangle hatBrim = new Rectangle(-25, -60, 50, 10);
        hatBrim.setFilled(true);
        hatBrim.setFillColor(strokeColor);
        getGraphics().add(hatBrim);

        Rectangle carrot = new Rectangle(-20, -35, 20, 5);
        carrot.setFilled(true);
        carrot.setFillColor(carrotColor);
        getGraphics().add(carrot);
    }
}
