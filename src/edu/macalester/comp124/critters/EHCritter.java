package edu.macalester.comp124.critters;

import java.awt.*;
import java.util.Random;

import comp124graphics.Rectangle;
import comp124graphics.Triangle;
import comp124graphics.Ellipse;

public class EHCritter extends Critter {

    private static final Color
            fillColor = new Color(200, 40, 60),
            strokeColor   = new Color(250, 150, 150);

    private Random rng;

    @Override
    protected void buildGraphics() {
        xOffset = 40.0;
        yOffset = 40.0;

        Rectangle leftLeg  = new Rectangle(-16, 0, 5, 60);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));   // this leg will be animated when running CritterParty

        Rectangle rightLeg = new Rectangle( 6, 0, 5, 60);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));   // this leg will be animated when running CritterParty

        Triangle left = new Triangle(-50,-10, -30,-30, -50, -50);
        left.setStrokeColor(strokeColor);
        left.setFilled(true);
        left.setFillColor(strokeColor);
        getGraphics().add(left);

        Triangle leftSmall = new Triangle(-45,-15,-30,-30,-45,-45);
        leftSmall.setStrokeColor(strokeColor);
        leftSmall.setFilled(true);
        leftSmall.setFillColor(fillColor);
        getGraphics().add(leftSmall);

        Triangle right = new Triangle(50,-10, 30,-30, 50, -50);
        right.setStrokeColor(strokeColor);
        right.setFilled(true);
        right.setFillColor(strokeColor);
        getGraphics().add(right);

        Triangle rightSmall = new Triangle(45,-15,30,-30,45,-45);
        rightSmall.setStrokeColor(strokeColor);
        rightSmall.setFilled(true);
        rightSmall.setFillColor(fillColor);
        getGraphics().add(rightSmall);

        Ellipse head = new Ellipse(-30,-60,60,60);
        head.setStrokeColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        Ellipse spot1 = new Ellipse(-10,-15,10,10);
        spot1.setStrokeColor(strokeColor);
        spot1.setFilled(true);
        spot1.setFillColor(strokeColor);
        getGraphics().add(spot1);

        Ellipse spot2 = new Ellipse(-3,-30,10,10);
        spot2.setStrokeColor(strokeColor);
        spot2.setFilled(true);
        spot2.setFillColor(strokeColor);
        getGraphics().add(spot2);

        Ellipse spot3 = new Ellipse(11,-20,10,10);
        spot3.setStrokeColor(strokeColor);
        spot3.setFilled(true);
        spot3.setFillColor(strokeColor);
        getGraphics().add(spot3);

        Ellipse spot4 = new Ellipse(5,-43,10,10);
        spot4.setStrokeColor(strokeColor);
        spot4.setFilled(true);
        spot4.setFillColor(strokeColor);
        getGraphics().add(spot4);

        Ellipse spot5 = new Ellipse(-15,-40,10,10);
        spot5.setStrokeColor(strokeColor);
        spot5.setFilled(true);
        spot5.setFillColor(strokeColor);
        getGraphics().add(spot5);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye, -10, -46);
        addEye(rightEye, 10, -46);
    }

//    private void createSpot(x, y){
//        rng = new Random();
//        int width = rng.nextInt(10);
//        Ellipse spot = new Ellipse(x,y,width,width);
//        spot.setStrokeColor(strokeColor);
//        spot.setFilled(true);
//        spot.setFillColor(strokeColor);
//        getGraphics().add(spot);
//    }
}
