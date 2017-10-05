package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class SaloniJR extends Critter {
    private static final Color strokeColor = new Color(39, 255, 80);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        Rectangle leftLeg = new Rectangle(19, 75, 10, 50);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg = new Rectangle(43, 75, 10, 50);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram

        Image saloni = null;
        try {
            saloni = new Image(0, 0, Paths.get(getClass().getResource("/SaloniJR.png").toURI()).toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        getGraphics().add(saloni);

        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 26, 43);
        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 52, 35);


    }

}