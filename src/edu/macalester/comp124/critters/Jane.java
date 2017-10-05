package edu.macalester.comp124.critters;

import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Jane extends Critter {

    private static final Color STROKE_COLOR = new Color(120, 90, 140);
    private static final Color FILL_COLOR = STROKE_COLOR;

    @Override
    protected void buildGraphics(){

        comp124graphics.Rectangle rightLeg = new comp124graphics.Rectangle(97,82,10,40);
        rightLeg.setStrokeColor(STROKE_COLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILL_COLOR);

        comp124graphics.Rectangle leftLeg = new Rectangle(60,82,10,40);
        leftLeg.setStrokeColor(STROKE_COLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILL_COLOR);

        addLeg(new Leg(rightLeg, 10));
        addLeg(new Leg(leftLeg, 10));

        comp124graphics.Image orange = null;
        try {
            orange = new comp124graphics.Image(40,0, Paths.get(getClass().getResource("/Jane.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(orange);

        addEye(new Eye(7, 0.5, 0.25, Color.RED), 60, 45);
        addEye(new Eye(7, 0.5, 0.25, Color.RED), 86, 36);

    }


}




