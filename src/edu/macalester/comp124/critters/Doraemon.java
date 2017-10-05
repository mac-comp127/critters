package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.*;
import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * Created by haimengzhang on 2017/10/5.
 */
public class Doraemon extends Critter {
    private static final Paint strokeColor = new Color(0, 0, 0);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Paint fillColor = strokeColor;

    @Override
    protected void buildGraphics() {
        Ellipse leftLeg  = new Ellipse(70, 245, 50, 20);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Ellipse rightLeg  = new Ellipse(110, 245, 50, 20);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));

        Image doraemon = null;
        try{
            doraemon = new Image(0,0, Paths.get(getClass().getResource("/doraemon.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }
        getGraphics().add(doraemon);
    }
}
