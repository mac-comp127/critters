package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * Created by Thea Nguyen on 02/22/2018.
 */

public class StitchThea extends Critter {
    @Override
    protected void buildGraphics() {
        Rectangle leftLeg  = new Rectangle(10, 80, 17, 10);
        leftLeg.setStrokeColor(Color.BLUE);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.BLUE);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        Rectangle rightLeg  = new Rectangle(53, 100, 17, 10);
        rightLeg.setStrokeColor(Color.BLUE);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.BLUE);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram

        comp124graphics.Image stitch = null;
        try{
            stitch = new Image(0,0, Paths.get(getClass().getResource("/Stitch.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(stitch);

        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 34, 38);
        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 57, 33);
    }
}
