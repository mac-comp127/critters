package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;

public class BlackCatTF extends Critter {

    // created by Li (Tiffany) Fan

    private static final Color strokeColor = new Color(45, 45, 45);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {
        Image cat = CritterUtils.loadCritterImage("BlackCatTF.jpeg");
        getGraphics().add(cat);

        Rectangle leftLeg  = new Rectangle(35, 82, 12.5, 15);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        Rectangle rightLeg  = new Rectangle(55, 82, 12.5, 15);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));


    }


}
