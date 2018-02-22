package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;
import comp124graphics.GraphicsGroup;
import comp124graphics.Line;
import comp124graphics.Rectangle;

import java.awt.*;

public class ToothMonster extends Critter{
    protected void buildGraphics() {

        createAntennae(40, 60, 30, 30);
        createAntennae(70, 60, 80, 30);

        Ellipse head = new Ellipse(30, 50, 50, 30);
        head.setFillColor(new Color(100, 150, 150));
        head.setFilled(true);
        getGraphics().add(head);

        createMouth(45, 70, 65, 70);

        Eye leftEye = new Eye(10, .75, .20, Color.RED);
        Eye rightEye = new Eye(10, .75, .20, Color.GREEN);
        addEye(leftEye, 70, 60);
        addEye(rightEye, 40, 60);

        createLeg(45, 70);
        createLeg(55, 70);

        createBrow(30, 45);
        createBrow(60, 45);

        createHat(25, 15);

    }

    private void createMouth(double x1, double y1, double x2, double y2) {
        Line mouth = new Line(x1, y1, x2, y2);
        mouth.setStrokeColor(Color.BLACK);
        getGraphics().add(mouth);
    }

    private void createLeg(double x, double y) {
        comp124graphics.Rectangle tooth = new Rectangle(x, y, 10, 15);
        tooth.setStrokeColor(Color.BLACK);
        tooth.setFilled(true);
        tooth.setFillColor(Color.WHITE);
        addLeg(new Leg(tooth, 2));
    }

    private void createAntennae(double x1, double y1, double x2, double y2) {
        Line antennae = new Line(x1, y1, x2, y2);
        antennae.setStrokeColor(new Color(50, 100, 200));
        Ellipse bulb = new Ellipse(x2-5, y2-5, 10, 10);
        bulb.setFillColor(new Color(50, 150, 200));
        bulb.setFilled(true);
        getGraphics().add(antennae);
        getGraphics().add(bulb);
    }

    private void createBrow(double x, double y) {
        Rectangle brow = new Rectangle(x, y, 20, 5);
        brow.setStrokeColor(Color.BLACK);
        brow.setFilled(true);
        brow.setFillColor(Color.BLACK);
        getGraphics().add(brow);
    }

    private void createHat(double x, double y) {
        Rectangle top = new Rectangle(x, y, 10, 10);
        top.setStrokeColor(Color.BLACK);
        top.setFilled(true);
        top.setFillColor(Color.BLACK);
        Rectangle brim = new Rectangle(x-2.5, y+10, 15, 3);
        brim.setStrokeColor(Color.BLACK);
        brim.setFilled(true);
        brim.setFillColor(Color.BLACK);
        getGraphics().add(brim);
        getGraphics().add(top);
    }





}
