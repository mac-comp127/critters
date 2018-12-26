package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Line;
import comp124graphics.Rectangle;

import java.awt.*;

public class Pig extends Critter {

    @Override
    protected void buildGraphics() {

        Ellipse head = new Ellipse(37.5, 0, 30, 30);
        head.setFilled(true);
        head.setFillColor(new Color(255, 11, 167));
        head.setStrokeColor(new Color(255, 11, 167));
        getGraphics().add(head);

        Ellipse body = new Ellipse(45, 20, 60, 40);
        body.setFilled(true);
        body.setFillColor(new Color(255, 11, 167));
        body.setStrokeColor(new Color(255, 11, 167));
        getGraphics().add(body);

        comp124graphics.Rectangle nose = new Rectangle(32, 12, 14, 12);
        nose.setStrokeColor(new Color(255, 11, 167));
        nose.setFilled(true);
        nose.setFillColor(new Color(255, 11, 167));
        addLeg(new Leg(nose, 4));   // this leg will be animated when running CritterProgram

        Eye eye = new Eye(6, 0.46, 0.18, Color.BLACK);
        addEye(eye, 50, 12);

        comp124graphics.Rectangle leg1 = new Rectangle(50, 50, 4, 24);
        leg1.setStrokeColor(new Color(255, 11, 167));
        leg1.setFilled(true);
        leg1.setFillColor(new Color(255, 11, 167));
        addLeg(new Leg(leg1, 4));   // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle leg2 = new Rectangle(65, 50, 4, 24);
        leg2.setStrokeColor(new Color(255, 11, 167));
        leg2.setFilled(true);
        leg2.setFillColor(new Color(255, 11, 167));
        addLeg(new Leg(leg2, 4));   // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle leg3 = new Rectangle(80, 50, 4, 24);
        leg3.setStrokeColor(new Color(255, 11, 167));
        leg3.setFilled(true);
        leg3.setFillColor(new Color(255, 11, 167));
        addLeg(new Leg(leg3, 4));   // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle leg4 = new Rectangle(95, 50, 4, 24);
        leg4.setStrokeColor(new Color(255, 11, 167));
        leg4.setFilled(true);
        leg4.setFillColor(new Color(255, 11, 167));
        addLeg(new Leg(leg4, 4));   // this leg will be animated when running CritterProgram
    }

}

