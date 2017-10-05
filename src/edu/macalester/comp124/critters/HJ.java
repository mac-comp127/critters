package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class HJ extends Critter {
    private static final Color strokeColor = new Color(245,185,65);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = new Color(245,232,165);


    @Override
    protected void buildGraphics() {

        Rectangle leftLeg  = new Rectangle(40, 100, 10, 80);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg  = new Rectangle(80, 100, 10, 80);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram


        Image HJ = null;
        try{
            HJ = new Image(0,0, Paths.get(getClass().getResource("/HJ.jpg").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(HJ);


        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 23, 30);
        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 80, 30);
    }




}
