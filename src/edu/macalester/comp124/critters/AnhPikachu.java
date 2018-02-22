package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class AnhPikachu extends Critter{

    private static final Color strokeColor = new Color(0, 0, 0);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = strokeColor;


    @Override
    protected void buildGraphics() {

        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(15, 120, 14, 10);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));   // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle rightLeg = new Rectangle(50, 120, 12, 10);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));   // this leg will be animated when running CritterProgram

        comp124graphics.Image pikachu = null;
        try{
            pikachu = new Image(0,0, Paths.get(getClass().getResource("/pikachuBlack.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(pikachu);


        addEye(new Eye(5, 0.26, 0.18, Color.RED), 20, 55);
        addEye(new Eye(5, 0.26, 0.18, Color.RED), 46, 55);
    }


}
