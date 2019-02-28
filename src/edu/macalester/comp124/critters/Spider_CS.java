package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Rectangle;

import java.awt.*;

public class Spider_CS extends Critter{

    private static final Color creatureColor = new Color(38,103,75);

    @Override
    protected void buildGraphics() {
        Ellipse body = new Ellipse(10,10,80,80);
        body.setStrokeColor(creatureColor);
        body.setFilled(true);
        body.setFillColor(creatureColor);


        makeLeg(4,22);
        makeLeg(4,36);
        makeLeg(4,50);
        makeLeg(4,64);
        makeLeg(64,22);
        makeLeg(64,36);
        makeLeg(64,50);
        makeLeg(64,64);


        getGraphics().add(body);
        addEye(new Eye(8,0.8,0.3,Color.RED),30,30);
        addEye(new Eye(8,0.8,0.3,Color.RED),70,30);
        addEye(new Eye(8,0.8,0.3,Color.RED),50,30);
        addEye(new Eye(8,0.8,0.3,Color.RED),20,45);
        addEye(new Eye(8,0.8,0.3,Color.RED),80,45);
        addEye(new Eye(8,0.8,0.3,Color.RED),40,45);
        addEye(new Eye(8,0.8,0.3,Color.RED),60,45);
        addEye(new Eye(8,0.8,0.3,Color.RED),50,60);

    }

    private void makeLeg(int x, int y)
    {
        Rectangle leg = new Rectangle(x,y,35,8);
        leg.setFilled(true);
        leg.setFillColor(new Color(68, 43, 7));
        leg.setStrokeColor(new Color(68,43,7));
        addLeg(new Leg(leg,2));
    }
}
