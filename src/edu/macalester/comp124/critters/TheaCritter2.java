package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * Created by Thea Nguyen on 02/22/2018.
 */

public class TheaCritter2 extends Critter {
    @Override
    protected void buildGraphics() {
        Rectangle leftLeg  = new Rectangle(10, 105, 17, 3);
        leftLeg.setStrokeColor(Color.BLACK);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.BLACK);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg  = new Rectangle(44, 105, 17, 3);
        rightLeg.setStrokeColor(Color.BLACK);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.BLACK);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram

        comp124graphics.Image judy = null;
        try{
            judy = new Image(0,0, Paths.get(getClass().getResource("/Judy.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(judy);

        addEye(new Eye(3, 0.26, 0.18, Color.BLACK), 34, 36);
        addEye(new Eye(3, 0.26, 0.18, Color.BLACK), 44, 34);
    }
}
