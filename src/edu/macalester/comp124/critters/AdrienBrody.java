package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class AdrienBrody extends Critter {

    private static final Color STROKE_COLOR = new Color(233, 159, 121);
    private static final Color FILL_COLOR = STROKE_COLOR;

    @Override
    protected void buildGraphics(){

        makeRectLegs();

        Image orange = null;
        try {
            orange = new Image(0,0, Paths.get(getClass().getResource("/brody.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(orange);

        addEye(new Eye(3, 0.1, 0.05, Color.BLUE), 28, 52);
        addEye(new Eye(3, 0.1, 0.05, Color.BLUE), 55, 49);

    }

    private void makeRectLegs(){
        Rectangle rightLeg = new Rectangle(56,78,10,50);
        rightLeg.setStrokeColor(STROKE_COLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILL_COLOR);

        Rectangle leftLeg = new Rectangle(27,78,10,50);
        leftLeg.setStrokeColor(STROKE_COLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILL_COLOR);

        addLeg(new Leg(rightLeg, 10));
        addLeg(new Leg(leftLeg, 10));
    }
}
