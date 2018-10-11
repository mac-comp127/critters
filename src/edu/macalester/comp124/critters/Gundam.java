package edu.macalester.comp124.critters;


import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;


public class Gundam extends Critter {
    private static final Color strokeColor = new Color(255,150,150);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        Rectangle leftLeg  = new Rectangle(88, 104, 12.5*1.5, 25.7*3);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        Rectangle rightLeg  = new Rectangle(116, 104, 12.5*1.49999, 25.7*3);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        Image mario = CritterUtils.loadCritterImage("gundam.png");
        getGraphics().add(mario);

        addEye(new Eye(1.8, 0.13, 0.09, Color.RED), 105, 29);
        addEye(new Eye(1.8, 0.13, 0.09, Color.RED), 112, 29);
    }
}
