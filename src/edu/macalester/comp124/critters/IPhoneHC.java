package edu.macalester.comp124.critters;

import comp124graphics.Image;

import java.awt.*;

public class IPhoneHC extends Critter{

    private static final Color strokeColor = new Color(255, 0, 0);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(21, 63.5, 12.5, 25.7);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        comp124graphics.Rectangle rightLeg  = new comp124graphics.Rectangle(35, 63.5, 12.5, 25.7);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        Image iPhone = CritterUtils.loadCritterImage("mobile.png");
        getGraphics().add(iPhone);


        addEye(new Eye(3.6, 0.26, 0.18, Color.RED), 28, 32);
        addEye(new Eye(3.6, 0.26, 0.18, Color.RED), 43, 32);
    }
}
