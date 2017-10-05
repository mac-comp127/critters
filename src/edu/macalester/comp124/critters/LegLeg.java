package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;

/**
 * @author clintonkunhardt
 */

public class LegLeg extends Critter {

    private static final Color
            STROKE_COLOR = new Color(150, 40, 40),
            FILL_COLOR   = new Color(160, 50, 182);


    @Override
    protected void buildGraphics() {

        xOffset = 50;

        Rectangle mainLeg = new Rectangle(0,0,30,100);
        mainLeg.setFilled(true);
        mainLeg.setFillColor(FILL_COLOR);
        mainLeg.setStrokeColor(STROKE_COLOR);
        getGraphics().add(mainLeg);

        Rectangle legOne = new Rectangle(20,30,50,10);
        legOne.setFilled(true);
        legOne.setFillColor(FILL_COLOR);
        legOne.setStrokeColor(STROKE_COLOR);
        addLeg(new Leg(legOne, 10));

        Rectangle legTwo = new Rectangle(20,60,50,10);
        legTwo.setFilled(true);
        legTwo.setFillColor(FILL_COLOR);
        legTwo.setStrokeColor(STROKE_COLOR);
        addLeg(new Leg(legTwo, 10));

        Rectangle legThree = new Rectangle(-40,30,50,10);
        legThree.setFilled(true);
        legThree.setFillColor(FILL_COLOR);
        legThree.setStrokeColor(STROKE_COLOR);
        addLeg(new Leg(legThree, 10));

        Rectangle legFour = new Rectangle(-40,60,50,10);
        legFour.setFilled(true);
        legFour.setFillColor(FILL_COLOR);
        legFour.setStrokeColor(STROKE_COLOR);
        addLeg(new Leg(legFour, 10));

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye leftEye1 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye1 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye leftEye2 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye2 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye leftEye3 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye3 = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye, 10, 10);
        addEye(rightEye, 20, 10);
        addEye(leftEye1, 10, 20);
        addEye(rightEye1, 20, 20);
        addEye(leftEye2, 10, 30);
        addEye(rightEye2, 20, 30);
        addEye(leftEye3, 10, 40);
        addEye(rightEye3, 20, 40);
    }
}
