package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.Triangle;

import java.awt.*;

public class GoldfishSophie extends Critter {

    private static final Color bodyColor = new Color(255, 193, 63);
    private static final Color finColor = new Color(255, 174, 50);

    @Override
    protected void buildGraphics() {

        Ellipse body = new Ellipse(-25, -25, 50, 50);
        body.setFilled(true);
        body.setFillColor(bodyColor);
        body.setStroked(false);
        getGraphics().add(body);

        Triangle bodyEnd = new Triangle(15, -20, 15, 20, 50, 0);
        bodyEnd.setFilled(true);
        bodyEnd.setFillColor(bodyColor);
        bodyEnd.setStroked(false);
        getGraphics().add(bodyEnd);

        Triangle tail = new Triangle(50, 0, 80, -20, 80, 20);
        tail.setStroked(false);
        tail.setFilled(true);
        tail.setFillColor(bodyColor);
        getGraphics().add(tail);

        Eye eye = new Eye(7, .46, .18, Color.BLUE);
        addEye(eye, -6, -7);

        Triangle fin = new Triangle(15, 15, 23, 30, 45, 38);
        fin.setStroked(false);
        fin.setFilled(true);
        fin.setFillColor(finColor);
        addLeg(new Leg(fin, 2));

    }
}
