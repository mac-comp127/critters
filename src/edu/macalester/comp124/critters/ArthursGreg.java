package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;
import org.w3c.dom.css.Rect;

import java.awt.*;

public class ArthursGreg extends Critter {

    @Override
    protected void buildGraphics() {
        Image greg = CritterUtils.loadCritterImage("itssmolgreg.png");
        getGraphics().add(greg);

        Rectangle topFlipper = new Rectangle(95, 60, 50, 10);
        topFlipper.setFillColor(new Color(0xA2A2A2));
        topFlipper.setFilled(true);
        topFlipper.setStrokeColor(new Color(0xA2A2A2));

        Rectangle bottomFlipper = new Rectangle(95, 100, 50, 10);
        bottomFlipper.setFillColor(new Color(0xA2A2A2));
        bottomFlipper.setFilled(true);
        bottomFlipper.setStrokeColor(new Color(0xA2A2A2));

        Eye theEye = new Eye(6, .5, .25, Color.red);

        addLeg(new Leg(topFlipper, 5.5));
        addLeg(new Leg(bottomFlipper, 5.5));
        addEye(theEye, 55, 40);

    }

    @Override
    public void moveTowardsGoal(double dt) {
        double  dx = super.getGoal().getX() - getGraphics().getX(),
                dy = super.getGoal().getY() - getGraphics().getY(),
                dist = Math.hypot(dx, dy);
        moveBy(
                dx * getSpeed() / dist,
                0,
                dt);
    }
}
