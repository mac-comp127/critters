package edu.macalester.comp124.critters;
import java.util.Random;
import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;

import java.awt.*;

public class BrennanCreature extends Critter {
    protected void buildGraphics() {
        Random generator = new Random();
        Color bodyColor = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
        Color eyeColor = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));

        int numLegs = 1 + generator.nextInt(10);
        double legAngle = 2* Math.PI/numLegs, currAngle = 0.0;

        for (int leg = 1; leg<=numLegs; leg++) {
            Line legLine = new Line(30,30, 30 +60*Math.sin(currAngle), 30+60*Math.cos(currAngle));
            legLine.setStrokeWidth(4);
            legLine.setStrokeColor(bodyColor);
            Leg legToAdd = new Leg(legLine, 4);
            addLeg(legToAdd);
            currAngle += legAngle;
        }


        Ellipse body = new Ellipse(0,0,60,60);
        body.setFillColor(bodyColor);
        body.setFilled(true);
        body.setStroked(false);
        getGraphics().add(body);

        Eye eye = new Eye(10,.46,.18,eyeColor);
        addEye(eye,30,30);

    }

}
