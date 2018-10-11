package edu.macalester.comp124.critters;

import comp124graphics.Rectangle;
import java.awt.*;

public class RyanCritter extends Critter {
    private static final Color strokeColor = new Color(0, 0, 0);
    private static final Color fillColor = new Color(0, 200, 0);

    @Override
    protected void buildGraphics() {
        Rectangle leg1 = new Rectangle(56, 50, 45, 15);
        leg1.setStrokeColor(strokeColor);
        leg1.setFilled(true);
        leg1.setFillColor(fillColor);
        addLeg(new Leg(leg1, 2));

        Rectangle leg2 = new Rectangle(56, 20, 45, 15);
        leg2.setStrokeColor(strokeColor);
        leg2.setFilled(true);
        leg2.setFillColor(fillColor);
        addLeg(new Leg(leg2, 2));

        Rectangle leg3 = new Rectangle(-16, 50, 45, 15);
        leg3.setStrokeColor(strokeColor);
        leg3.setFilled(true);
        leg3.setFillColor(fillColor);
        addLeg(new Leg(leg3, 2));

        Rectangle leg4 = new Rectangle(-16, 20, 45, 15);
        leg4.setStrokeColor(strokeColor);
        leg4.setFilled(true);
        leg4.setFillColor(fillColor);
        addLeg(new Leg(leg4, 2));

        Rectangle body = new Rectangle(20, 10, 40, 60);
        body.setStrokeColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye, 30, 10);
        addEye(rightEye, 50, 10);

        Eye leftEye2 = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye2 = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye2, 30, 23);
        addEye(rightEye2, 50, 23);
    }
}
