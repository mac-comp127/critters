package edu.macalester.comp124.critters;

import comp124graphics.Image;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class RickTC extends Critter {
    private static final Color strokeColor = new Color(195, 109, 70);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = strokeColor;
    @Override
    protected void buildGraphics() {
        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(50, 190, 17, 35);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle rightLeg  = new comp124graphics.Rectangle(70, 190, 17, 35);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram


        comp124graphics.Image rick = null;
        try{
            rick = new Image(0,0, Paths.get(getClass().getResource("/RickTC.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(rick);


        addEye(new Eye(8, 0.26, 0.18, Color.RED), 58, 47);
        addEye(new Eye(8, 0.26, 0.18, Color.RED), 74, 49);



    }
}
