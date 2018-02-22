package edu.macalester.comp124.critters;

import comp124graphics.*;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class HCMochi extends Critter{
    private static final Color color = Color.BLACK;

    @Override
    protected void buildGraphics(){

        Image chicken = null;
        try{
            chicken = new Image(0,0, Paths.get(getClass().getResource("/HCchick.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(chicken);

        Ellipse leftLeg = new Ellipse(75, 112, 10, 10);
        leftLeg.setFilled(true);
        leftLeg.setStroked(false);
        leftLeg.setFillColor(color);
        addLeg(new Leg(leftLeg, 3));

        Ellipse rightLeg = new Ellipse(61, 112, 10, 10);
        rightLeg.setFilled(true);
        rightLeg.setStroked(false);
        rightLeg.setFillColor(color);
        addLeg(new Leg(rightLeg, 3));

        Eye rightEye = new Eye(6, 0.27, 0.2, color);
        addEye(rightEye, 80, 56);

        Eye leftEye = new Eye(6, 0.27, 0.2, color);
        addEye(leftEye, 60, 56);

    }

}
