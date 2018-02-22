package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;

import comp124graphics.Polygon;
import comp124graphics.Rectangle;

import java.awt.*;
import java.awt.geom.Point2D;

public class LOElephant extends Critter {

    private static final Color color = new Color(100, 100, 100);

    @Override
    protected void buildGraphics() {
        Ellipse body = new Ellipse(0,0,100,70);
        body.setFilled(true);
        body.setFillColor(color);

        Ellipse head = new Ellipse(80,-15,40,40);
        head.setFilled(true);
        head.setFillColor(color);

        Rectangle leftLeg = new Rectangle(15,60,20,40);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(color);

        Rectangle rightLeg = new Rectangle(65,60,20,40);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(color);

        Eye eye = new Eye(6,0.2,.18,Color.WHITE);

        Rectangle trunk = new Rectangle(110,10,40,10);
        trunk.setFilled(true);
        trunk.setFillColor(color);

        addLeg(new Leg(leftLeg,2));
        addLeg(new Leg(rightLeg,2));
        addLeg(new Leg(trunk,2));
        getGraphics().add(body);
        getGraphics().add(head);

        addEye(eye,110,5);
    }
}
