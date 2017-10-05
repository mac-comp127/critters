package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import java.awt.Color;
import java.net.URISyntaxException;

public class AGBCritter extends Critter {
    private static final Color STROKE_COLOR = new Color(255, 255, 0);
    private static final Color FILL_COLOR = STROKE_COLOR;

    @Override
    protected void buildGraphics() {

        try {
            Image rightLeg = new Image(67, 97, Paths.get(getClass().getResource("/AGBRightLeg.jpg").toURI()).toString());
            Image leftLeg = new Image(8, 97, Paths.get(getClass().getResource("/AGBRightLeg.jpg").toURI()).toString());
            getGraphics().add(leftLeg);
            getGraphics().add(rightLeg);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        Image agbCritter = null;
        try {
            agbCritter = new comp124graphics.Image(0, 0, Paths.get(getClass().getResource("/AGBCritterPhoto.jpg").toURI()).toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        getGraphics().add(agbCritter);

        addEye(new Eye(7, 0.5, 0.25, Color.BLUE), 57, 35);
        addEye(new Eye(7.5, 0.5, 0.25, Color.BLUE), 86, 36);
    }

    private void makeLegs() {

        Rectangle rightLeg = new Rectangle(97, 92, 20, 50);
        rightLeg.setStrokeColor(STROKE_COLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILL_COLOR);

        Rectangle leftLeg = new Rectangle(60, 92, 20, 50);
        leftLeg.setStrokeColor(STROKE_COLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILL_COLOR);

        addLeg(new Leg(rightLeg, 10));
        addLeg(new Leg(leftLeg, 10));
    }
}

