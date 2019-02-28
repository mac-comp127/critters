package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Rectangle;

import java.awt.*;

public class CritterBF extends Critter {

    @Override
    protected void buildGraphics() {
        Rectangle leftLeg = new Rectangle(30, 65, 10, 20);
        leftLeg.setStrokeColor(Color.BLACK);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.GREEN);
        addLeg(new Leg(leftLeg, 2));

        Rectangle rightLeg = new Rectangle(55, 65, 10, 20);
        rightLeg.setStrokeColor(Color.BLACK);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.GREEN);
        addLeg(new Leg(rightLeg, 2));

        Ellipse body = new Ellipse(25, 25, 50, 50);
        body.setFilled(true);
        body.setFillColor(Color.GREEN);
        getGraphics().add(body);

        Eye centerEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        addEye(centerEye, 50, 50);
    }
}
