package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;
import comp124graphics.Rectangle;

import java.awt.*;

public class Gastropoda extends Critter {

    @Override
    protected void buildGraphics() {

        xOffset = 44.0;
        yOffset = 30.0;

//        createLeg(-30, -30, -40, -20);
//        createLeg( 30,  10,  40,  20);


        Ellipse shell = new Ellipse(-25, -25, 50, 50);
        shell.setFilled(true);
        shell.setFillColor(new Color(158, 92, 50));
        getGraphics().add(shell);

        Rectangle body=new Rectangle(-50,15,80,20);
        body.setFillColor(Color.GREEN);
        body.setFilled(true);
        body.setStroked(false);
        getGraphics().add(body);

        Line eyeline=new Line(-40,15,-50,-25);
        eyeline.setStrokeColor(Color.GREEN);
        getGraphics().add(eyeline);

        Line eyeline2=new Line(-45,15,-60,-25);
        eyeline2.setStrokeColor(Color.GREEN);
        getGraphics().add(eyeline2);

        Eye leftEye = new Eye(13, 0.46, 0.18, Color.BLUE);
        Eye rightEye = new Eye(13, 0.46, 0.18, Color.BLUE);
        addEye(leftEye, -55, -20);
        addEye(rightEye, -30, -20);

        Rectangle leftLeg  = new Rectangle(-6, 30, 15, 5);
        leftLeg.setStrokeColor(Color.GREEN);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.GREEN);
        addLeg(new Leg(leftLeg, 5));

        Rectangle rightLeg = new Rectangle( 6, 30, 15, 5);
        rightLeg.setStrokeColor(Color.GREEN);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.GREEN);
        addLeg(new Leg(rightLeg, 5));
    }

}
