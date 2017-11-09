package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class PatrickTheStar extends Critter {
    private static final Paint strokeColor = new Color(156, 100, 100);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Paint fillColor = strokeColor;

    @Override
    protected void buildGraphics() {
        Rectangle leftLeg  = new Rectangle(70, 215, 20, 100);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg  = new Rectangle(110, 215, 20, 100);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));


        Image patrick = null;
        try{
            patrick = new Image(0,0, Paths.get(getClass().getResource("/PatrickTheStar.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }
        getGraphics().add(patrick);

        addEye(new Eye(15, 0.5, 0.18, Color.RED), 95, 60);
        addEye(new Eye(15, 0.5, 0.18, Color.RED), 125, 60);
    }
}
