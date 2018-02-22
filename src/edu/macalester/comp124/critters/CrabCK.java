package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;


public class CrabCK extends Critter {
    private static final Color strokeColor = new Color(255, 0, 0);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        Rectangle leftLeg1  = new Rectangle(37, 50, 7, 35);
        leftLeg1.setStrokeColor(strokeColor);
        leftLeg1.setFilled(true);
        leftLeg1.setFillColor(fillColor);
        addLeg(new Leg(leftLeg1, 4));

        Rectangle leftLeg2  = new Rectangle(50, 50, 7, 35);
        leftLeg2.setStrokeColor(strokeColor);
        leftLeg2.setFilled(true);
        leftLeg2.setFillColor(fillColor);
        addLeg(new Leg(leftLeg2, 4));


        Rectangle rightLeg1  = new Rectangle(63, 50, 7, 35);
        rightLeg1.setStrokeColor(strokeColor);
        rightLeg1.setFilled(true);
        rightLeg1.setFillColor(fillColor);
        addLeg(new Leg(rightLeg1, 4));

        Rectangle rightLeg2  = new Rectangle(76, 50, 7, 35);
        rightLeg2.setStrokeColor(strokeColor);
        rightLeg2.setFilled(true);
        rightLeg2.setFillColor(fillColor);
        addLeg(new Leg(rightLeg2, 4));


        Image crab = null;
        try{
            crab = new Image(0,0, Paths.get(getClass().getResource("/CrabCK.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }


        getGraphics().add(crab);


        addEye(new Eye(8, 0.6, 0.18, Color.GREEN), 48, 12);
        addEye(new Eye(8, 0.6, 0.18, Color.GREEN), 74, 12);
    }


}
