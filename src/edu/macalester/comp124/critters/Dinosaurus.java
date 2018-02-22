package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Rectangle;
import comp124graphics.Triangle;

import java.awt.*;

public class Dinosaurus extends Critter{

    @Override
    protected void buildGraphics(){


        Ellipse body = new Ellipse(-50, -50, 100, 100);
        body.setFilled(true);
        body.setStroked(false);
        body.setFillColor(new Color(173,255,47));
        getGraphics().add(body);
        Rectangle trunk = new Rectangle(-50,0, 100, 50);
        trunk.setFillColor(new Color(173,255,47));
        trunk.setFilled(true);
        trunk.setStroked(false);
        getGraphics().add(trunk);
        Triangle tail = new Triangle(-40,0,-50,50,-125,50);
        tail.setFillColor(new Color(173,255,47));
        tail.setFilled(true);
        tail.setStroked(false);
        getGraphics().add(tail);
        Rectangle neck = new Rectangle(50,-65,20,115);
        neck.setFillColor(new Color(173,255,47));
        neck.setFilled(true);
        neck.setStroked(false);
        getGraphics().add(neck);

        Rectangle neck2 = new Rectangle(65,-65,20,20);
        neck2.setFillColor(new Color(173,255,47));
        neck2.setFilled(true);
        neck2.setStroked(false);
        getGraphics().add(neck2);

        Ellipse head = new Ellipse(72.5,-65,20,20);
        head.setFillColor(new Color(173,255,47));
        head.setFilled(true);
        head.setStroked(false);
        getGraphics().add(head);

        Rectangle backLeg  = new Rectangle(-50, 0, 15, 75);
        backLeg.setFillColor(new Color(173,255,47));
        backLeg.setFilled(true);
        backLeg.setStroked(false);
        addLeg(new Leg(backLeg, 2));

        Rectangle backLeg2  = new Rectangle(-30, 0, 15, 75);
        backLeg2.setFillColor(new Color(173,255,47));
        backLeg2.setFilled(true);
        backLeg2.setStroked(false);
        addLeg(new Leg(backLeg2, 2));

        Rectangle frontLeg  = new Rectangle(52.5, 0, 15, 75);
        frontLeg.setFillColor(new Color(173,255,47));
        frontLeg.setFilled(true);
        frontLeg.setStroked(false);
        addLeg(new Leg(frontLeg, 2));

        Rectangle frontLeg2  = new Rectangle(30, 0, 15, 75);
        frontLeg2.setFillColor(new Color(173,255,47));
        frontLeg2.setFilled(true);
        frontLeg2.setStroked(false);
        addLeg(new Leg(frontLeg2, 2));

        Eye eye = new Eye(4, 0.46, 0.18, Color.GREEN);
        addEye(eye, 72, -55);
    }
}