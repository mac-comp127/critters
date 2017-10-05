package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class MrOrange extends Critter {

    private static final Color STROKE_COLOR = new Color(233, 159, 121);
    private static final Color FILL_COLOR = STROKE_COLOR;

    @Override
    protected void buildGraphics(){

        try {
            Image rightLeg = new Image(92,97, Paths.get(getClass().getResource("/OrangeRightLeg.png").toURI()).toString());
            Image leftLeg = new Image(60,87, Paths.get(getClass().getResource("/OrangeLeftLeg.png").toURI()).toString());


            //addLeg(new Leg(rightLeg, 10));
            //addLeg(new Leg(leftLeg, 10));
            // Image legs are being weird, so just add rectangle legs for now.
            makeRectLegs();
        } catch (URISyntaxException e){
            e.printStackTrace();
            makeRectLegs();
        }

        Image orange = null;
        try {
            orange = new Image(0,0, Paths.get(getClass().getResource("/Orange.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(orange);

        addEye(new Eye(7, 0.5, 0.25, Color.BLUE), 57, 35);
        addEye(new Eye(7.5, 0.5, 0.25, Color.BLUE), 86, 36);

    }

    private void makeRectLegs(){
        Rectangle rightLeg = new Rectangle(97,92,20,50);
        rightLeg.setStrokeColor(STROKE_COLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILL_COLOR);

        Rectangle leftLeg = new Rectangle(60,92,20,50);
        leftLeg.setStrokeColor(STROKE_COLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILL_COLOR);

        addLeg(new Leg(rightLeg, 10));
        addLeg(new Leg(leftLeg, 10));
    }
}
