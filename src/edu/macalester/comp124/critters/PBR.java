package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * @author clintonkunhardt
 */

public class PBR extends Critter {

    private static final Color STROKE_COLOR = new Color(233, 159, 121);
    private static final Color FILL_COLOR = STROKE_COLOR;

    @Override
    protected void buildGraphics(){

        makeRectLegs();

        Image orange = null;
        try {
            orange = new Image(0,0, Paths.get(getClass().getResource("/pbr.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(orange);

        addEye(new Eye(5, 0.2, 0.1, Color.BLUE), 34, 85);
        addEye(new Eye(5, 0.2, 0.1, Color.BLUE), 76, 83);

    }

    private void makeRectLegs(){
        Rectangle rightLeg = new Rectangle(88,145,20,50);
        rightLeg.setStrokeColor(STROKE_COLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILL_COLOR);

        Rectangle leftLeg = new Rectangle(36,145,20,50);
        leftLeg.setStrokeColor(STROKE_COLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILL_COLOR);

        addLeg(new Leg(rightLeg, 10));
        addLeg(new Leg(leftLeg, 10));
    }
}
