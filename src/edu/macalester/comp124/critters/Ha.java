package edu.macalester.comp124.critters;
import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * @author Shiyu Lin
 */


public class Ha extends Critter {

    public static final Color strokeColor = new Color(28,120,79);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics(){


        Rectangle leftLeg  = new Rectangle(17, 48, 5, 75);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg  = new Rectangle(30, 48, 5, 75);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram

        Image ha = null;
        try{
            ha = new Image(0,0, Paths.get(getClass().getResource("/ha.jpg").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(ha);


        addEye(new Eye(2, 0.6, 0.1, Color.GREEN), 17, 20);
        addEye(new Eye(2, 0.6, 0.1, Color.GREEN), 29, 20);



    }

}
