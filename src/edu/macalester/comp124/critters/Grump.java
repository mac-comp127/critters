package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;

public class Grump extends Critter {
    private static final Color
            strokeColor = new Color(51, 65, 0),
            fillColor   = strokeColor;


    @Override
    protected void buildGraphics() {
        xOffset = 44.0;
        yOffset = 30.0;

        Image gromp = CritterUtils.loadCritterImage("gromp.png");
        getGraphics().add(gromp);


        Eye leftEye = new Eye(10, 0.46, 0.18, Color.RED);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.RED);
        addEye(leftEye, 27, 15);
        addEye(rightEye, 57, 15);

        comp124graphics.Rectangle rightLeg  = new Rectangle(17, 70.5, 12.5, 15.7);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        comp124graphics.Rectangle leftLeg  = new Rectangle(37, 70.5, 12.5, 15.7);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        comp124graphics.Rectangle backrightLeg  = new Rectangle(5, 55, 12.5, 15.7);
        backrightLeg.setStrokeColor(strokeColor);
        backrightLeg.setFilled(true);
        backrightLeg.setFillColor(fillColor);
        addLeg(new Leg(backrightLeg, 4));

        comp124graphics.Rectangle backleftLeg  = new Rectangle(80, 55, 12.5, 15.7);
        backleftLeg.setStrokeColor(strokeColor);
        backleftLeg.setFilled(true);
        backleftLeg.setFillColor(fillColor);
        addLeg(new Leg(backleftLeg, 4));



    }
}
