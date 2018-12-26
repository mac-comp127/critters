package edu.macalester.comp124.critters;

import comp124graphics.Arc;
import comp124graphics.Ellipse;
import comp124graphics.Line;
import comp124graphics.Rectangle;

import java.awt.*;

public class Smiley extends Critter {


    @Override
    protected void buildGraphics() {

        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(70, 115, 5, 20);
        leftLeg.setStrokeColor(Color.BLACK);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.BLACK);
        addLeg(new Leg(leftLeg, 2));

        comp124graphics.Rectangle rightLeg = new comp124graphics.Rectangle(90,115, 5, 20);
        rightLeg.setStrokeColor(Color.BLACK);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.BLACK);
        addLeg(new Leg(rightLeg, 2));

        comp124graphics.Ellipse face = new comp124graphics.Ellipse(50, 50, 70, 70);
        face.setFilled(true);
        face.setFillColor(Color.YELLOW);
        getGraphics().add(face);

        Arc smile = new Arc(70, 80, 30, 30, 200.0, 140.0);
        smile.setStrokeColor(Color.BLACK);
        smile.setStrokeWidth(4);
        getGraphics().add(smile);


        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLACK);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLACK);
        addEye(leftEye, 75, 75);
        addEye(rightEye, 95, 75);
    }

}