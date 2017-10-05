package edu.macalester.comp124.critters;

import comp124graphics.Arc;
import comp124graphics.Ellipse;
import comp124graphics.Rectangle;

import java.awt.*;

public class BoxAnimalHH extends Critter{

    private static final Color strokeColor = null;//Color.darkGray;
    private static final Color fillColor = new Color(165, 42, 42);
    private static final Color earColor = new Color(219, 111, 111);

    @Override
    protected void buildGraphics() {
        //
        // NOTE: the way this is drawn with negative values for x and y for parts
        //       of this critter, the initial location should be at least +10, +30
        //
        xOffset = 10.0;
        yOffset = 30.0;

        int xBody = 60;
        int yBody = 30;

        int xLeg = 7;
        int yLeg = 25;


        //left back leg
        comp124graphics.Rectangle leftBackLeg  = new comp124graphics.Rectangle(0, yBody-5, xLeg, yLeg);
        leftBackLeg.setStrokeColor(null);
        leftBackLeg.setFilled(true);
        leftBackLeg.setFillColor(fillColor);
        addLeg(new Leg(leftBackLeg, 2));   // this leg will be animated when running CritterProgram

        //left front leg
        comp124graphics.Rectangle leftFrontLeg  = new comp124graphics.Rectangle(xLeg + 5, yBody-5, xLeg, yLeg);
        leftFrontLeg.setStrokeColor(strokeColor);
        leftFrontLeg.setFilled(true);
        leftFrontLeg.setFillColor(fillColor);
        addLeg(new Leg(leftFrontLeg, 2));   // this leg will be animated when running CritterProgram

        //right back leg
        comp124graphics.Rectangle rightBackLeg = new comp124graphics.Rectangle( xLeg*2 + 5 + 22, yBody-5, xLeg, yLeg);
        rightBackLeg.setStrokeColor(strokeColor);
        rightBackLeg.setFilled(true);
        rightBackLeg.setFillColor(fillColor);
        addLeg(new Leg(rightBackLeg, 2));   // this leg will be animated when running CritterProgram

        //right back leg
        comp124graphics.Rectangle rightFrontLeg = new comp124graphics.Rectangle( xLeg*3 + 5 + 22 + 5, yBody-5, xLeg, yLeg);
        rightFrontLeg.setStrokeColor(strokeColor);
        rightFrontLeg.setFilled(true);
        rightFrontLeg.setFillColor(fillColor);
        addLeg(new Leg(rightFrontLeg, 2));   // this leg will be animated when running CritterProgram

        //body
        comp124graphics.Rectangle body = new comp124graphics.Rectangle(0, 0, xBody, yBody);
        body.setStrokeColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        //head
        comp124graphics.Rectangle head = new Rectangle(xBody, -20, 30, 30);
        head.setStrokeColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        //tail
        comp124graphics.Arc tail = new Arc(-10, -35, 20, 52, 180, 140);
        tail.setStrokeColor(fillColor);
        tail.setStrokeWidth(5);
        getGraphics().add(tail);

        //Left Ear
        comp124graphics.Ellipse leftEar = new Ellipse(xBody-5, -20, 10, 35);
        leftEar.setStrokeColor(fillColor);
        leftEar.setFilled(true);
        leftEar.setFillColor(earColor);
        getGraphics().add(leftEar);

        //mouth
        comp124graphics.Arc mouth = new Arc(70, 0, 10, 5, 180, 180);
        mouth.setStrokeColor(Color.black);
        mouth.setStrokeWidth(1);
        getGraphics().add(mouth);
        //    public Arc(double x, double y, double width, double height, double startAngle, double sweepAngle) {


        //right Ear
        comp124graphics.Ellipse rightEar = new Ellipse(xBody + 25, -20, 10, 35);
        rightEar.setStrokeColor(fillColor);
        rightEar.setFilled(true);
        rightEar.setFillColor(earColor);
        getGraphics().add(rightEar);

        //eyes
        Eye leftEye = new Eye(6, 0.26, 0.18, Color.darkGray);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.darkGray);
        addEye(leftEye, xBody + 10, -10);
        addEye(rightEye, xBody + 22, -10);
    }
}
