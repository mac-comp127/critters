package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;

import static java.awt.Color.*;

public class ChrisWDog extends Critter {
    protected void buildGraphics(){
        Ellipse mainBody = new Ellipse(0, 0, 50, 10);
        mainBody.setStrokeColor(BLACK);
        mainBody.setFillColor(ORANGE);
        mainBody.setFilled(true);
        getGraphics().add(mainBody);

        Ellipse leftLeg = new Ellipse(0, 0, 10, 20);
        leftLeg.setStrokeColor(BLACK);
        leftLeg.setFillColor(ORANGE);
        leftLeg.setFilled(true);
        getGraphics().add(leftLeg);
        addLeg(new Leg(leftLeg, 2));

        Ellipse head = new Ellipse(40, -10, 20, 13);
        head.setStrokeColor(BLACK);
        head.setFillColor(ORANGE);
        head.setFilled(true);
        getGraphics().add(head);

        Ellipse rightLeg = new Ellipse(40, 0, 10, 20);
        rightLeg.setStrokeColor(BLACK);
        rightLeg.setFillColor(ORANGE);
        rightLeg.setFilled(true);
        addLeg(new Leg(rightLeg, 2));

        Ellipse eye = new Ellipse(50, -7, 5, 5);
        eye.setStrokeColor(BLACK);
        eye.setFillColor(BLACK);
        eye.setFilled(true);
        getGraphics().add(eye);
    }
}
