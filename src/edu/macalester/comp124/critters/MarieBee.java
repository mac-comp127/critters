package edu.macalester.comp124.critters;

import comp124graphics.Arc;
import comp124graphics.Ellipse;
import comp124graphics.Rectangle;

import java.awt.Color;

public class MarieBee extends Critter{
    private static final Color BEE_YELLOW = new Color(244, 197, 66);
    private static final Color WING_COLOR = new Color(157,216,224);

    @Override
    protected void buildGraphics() {
        Ellipse rightWing = new Ellipse(60, 80, 70,40);
        rightWing.setFillColor(WING_COLOR);
        rightWing.setFilled(true);
        addLeg(new Leg(rightWing, 10));


        Ellipse leftWing = new Ellipse(-25, 80, 70, 40);
        leftWing.setFillColor(WING_COLOR);
        leftWing.setFilled(true);
        addLeg(new Leg(leftWing, 10));


        Ellipse body = new Ellipse(25, 65, 50,90);
        body.setFillColor(BEE_YELLOW);
        body.setFilled(true);
        getGraphics().add(body);

        Rectangle stripe1 = new Rectangle(30,80,40,10);
        stripe1.setFilled(true);
        getGraphics().add(stripe1);

        Rectangle stripe2 = new Rectangle(25, 100, 50, 10);
        stripe2.setFilled(true);
        getGraphics().add(stripe2);

        Rectangle stripe3 = new Rectangle(30, 120, 40, 10);
        stripe3.setFilled(true);
        getGraphics().add(stripe3);

        Rectangle stripe4 = new Rectangle(35, 140, 30, 10);
        stripe4.setFilled(true);
        getGraphics().add(stripe4);

        Ellipse head = new Ellipse(25, 25, 50, 50);
        head.setFillColor(BEE_YELLOW);
        head.setFilled(true);
        getGraphics().add(head);

        Eye leftEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        addEye(leftEye, 38, 50);
        addEye(rightEye, 62, 50);

        Arc mouth = new Arc(35,50,30,20,200,140);
        getGraphics().add(mouth);

    }

}
