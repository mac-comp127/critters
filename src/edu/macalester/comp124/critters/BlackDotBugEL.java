package edu.macalester.comp124.critters;

import java.awt.Color;

import comp124graphics.*;
import sun.font.TrueTypeFont;

/**
 * @author Erle Lei
 */


public class BlackDotBugEL extends Critter{

    protected void buildGraphics(){

        createLeg(-25,  10, -40,  20);
        createLeg(-25, -10, -44,   0);
        createLeg(-25, -30, -40, -20);
        createLeg( 25,  10,  40,  20);
        createLeg( 29, -10,  44,   0);
        createLeg( 35, -30,  40, -20);

        Ellipse body = new Ellipse(-30, -25, 50, 50);
        body.setStrokeWidth(4);
        body.setStrokeColor(Color.black);
        body.setFilled(true);
        body.setFillColor(Color.black);

        getGraphics().add(body);

        Triangle eye = new Triangle(-30.0,25.0,-20.0,30.0,-50.0,40.0);
        eye.setStrokeWidth(4);
        eye.setStrokeColor(Color.green);
        eye.setFilled(true);
        eye.setFillColor(Color.green);

        getGraphics().add(eye);

    }

    private void createLeg(double x0, double y0, double x1, double y1) {

        GraphicsGroup legGroup = new GraphicsGroup(0,0);
        Color color = Color.darkGray;
        Rectangle legRec1 = new Rectangle(x0, -2 , x1 , y1-1);
        legRec1.setStrokeColor(color);
        legRec1.setFilled(true);
        legRec1.setFillColor(color);
        legGroup.add(legRec1);



        addLeg(new Leg(legGroup, 4));
    }






}
