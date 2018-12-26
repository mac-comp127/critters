package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;

import java.awt.*;

public class Conor extends Critter{
    @Override
    protected void buildGraphics(){
        xOffset = 80.0;
        yOffset = 80.0;

        createLeg(-20,  15);
        createLeg(5, 15);
        createBody();

        Eye leftEye = new Eye(10, 0.46, 0.18, Color.GREEN);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.GREEN);
        addEye(leftEye, -18, 10);
        addEye(rightEye, 18, 10);

    }

    private void createBody(){
        GraphicsGroup bodyGroup = new GraphicsGroup(0,0);
        Color color = new Color(255, 141, 0);

        Ellipse body1 = new Ellipse(-20,-20,40,40);
        body1.setFillColor(color);
        body1.setFilled(true);
        body1.setStroked(false);
        bodyGroup.add(body1);

        Ellipse body2 = new Ellipse(5,0,30,20);
        body2.setFillColor(color);
        body2.setFilled(true);
        body2.setStroked(false);
        bodyGroup.add(body2);

        Ellipse body3 = new Ellipse(0,10,20,10);
        body3.setFillColor(color);
        body3.setFilled(true);
        body3.setStroked(false);
        bodyGroup.add(body3);

        Ellipse body4 = new Ellipse(-30,-20,30,20);
        body4.setFillColor(color);
        body4.setFilled(true);
        body4.setStroked(false);
        bodyGroup.add(body4);

        Ellipse body5 = new Ellipse(5,-25,30,25);
        body5.setFillColor(color);
        body5.setFilled(true);
        body5.setStroked(false);
        bodyGroup.add(body5);

        Ellipse body6 = new Ellipse(-10,-30,20,15);
        body6.setFillColor(color);
        body6.setFilled(true);
        body6.setStroked(false);
        bodyGroup.add(body6);

        getGraphics().add(bodyGroup);
    }

    private void createLeg(double xTop, double yTop) {

        Color color1 = new Color(255,204,27);
        Color color2 = new Color(255,207,93);

        Ellipse leg0 = new Ellipse(xTop, yTop, 15, 8);
        leg0.setFillColor(color1);
        leg0.setFilled(true);
        leg0.setStroked(false);
        addLeg(new Leg(leg0, 2));

        Ellipse leg1 = new Ellipse(xTop, yTop+8, 15, 8);
        leg1.setFillColor(color2);
        leg1.setFilled(true);
        leg1.setStroked(false);
        addLeg(new Leg(leg1, 3));

        Ellipse leg2 = new Ellipse(xTop, yTop+16, 15, 8);
        leg2.setFillColor(color1);
        leg2.setFilled(true);
        leg2.setStroked(false);
        addLeg(new Leg(leg2, 4));

    }
}
