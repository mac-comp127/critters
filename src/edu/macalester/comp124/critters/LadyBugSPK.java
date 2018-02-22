package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Line;
import comp124graphics.Triangle;

import java.awt.*;

public class LadyBugSPK extends Critter {

    private static final Color wings = new Color(234, 0, 1);

    @Override
    protected void buildGraphics() {

        Line leg1 = new Line(-35, -10, -23, 0);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg1, 2));

        Line leg2 = new Line(-40, 15, -23, 15);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg2, 2));

        Line leg3 = new Line(-35, 40, -23, 30);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg3, 2));

        Line leg4 = new Line(52, 0, 65, -10);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg4, 2));

        Line leg5 = new Line(52, 15, 70, 15);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg5, 2));

        Line leg6 = new Line(52, 30, 65, 40);
        leg1.setStrokeColor(Color.black);
        addLeg(new Leg(leg6, 2));


        Ellipse body = new Ellipse(-25, -25, 80, 88);
        body.setFilled(true);
        body.setFillColor(Color.black);
        getGraphics().add(body);


        Triangle leftWing = new Triangle(-25, 9, -25, 56, 15, 9);
        leftWing.setFilled(true);
        leftWing.setFillColor(wings);
        getGraphics().add(leftWing);

        Triangle rightWing = new Triangle(15, 9, 55, 56, 55, 9);
        rightWing.setFilled(true);
        rightWing.setFillColor(wings);
        getGraphics().add(rightWing);


        Ellipse spot1 = new Ellipse(-21, 15, 8, 8);
        spot1.setFilled(true);
        spot1.setFillColor(Color.black);
        getGraphics().add(spot1);

        Ellipse spot2 = new Ellipse(-9, 14, 9, 9);
        spot2.setFilled(true);
        spot2.setFillColor(Color.black);
        getGraphics().add(spot2);

        Ellipse spot3 = new Ellipse(-21, 29, 8, 8);
        spot3.setFilled(true);
        spot3.setFillColor(Color.black);
        getGraphics().add(spot3);

        Ellipse spot4 = new Ellipse(29, 13, 8, 8);
        spot4.setFilled(true);
        spot4.setFillColor(Color.black);
        getGraphics().add(spot4);

        Ellipse spot5 = new Ellipse(42, 15, 9, 9);
        spot5.setFilled(true);
        spot5.setFillColor(Color.black);
        getGraphics().add(spot5);

        Ellipse spot6 = new Ellipse(43, 30, 7, 7);
        spot6.setFilled(true);
        spot6.setFillColor(Color.black);
        getGraphics().add(spot6);


        Eye leftEye = new Eye(8, .46, .18, Color.BLUE);
        Eye rightEye = new Eye(8, .46, .18, Color.BLUE);
        addEye(leftEye, 0, -5);
        addEye(rightEye, 30, -5);

    }
}
