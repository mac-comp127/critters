package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;
import comp124graphics.Triangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class CJCritter extends Critter {
    private static final Color strokeColor = new Color(0,0,255);
    private static final Color fillColor = new Color(255,105,180);

    @Override
    protected void buildGraphics(){
        double width = 10;
        double height = 25;
        double initialX = 5;
        double initialY = 5;
        double movement = 20;
        double x;


        Rectangle leg1 = new Rectangle(initialX, initialY, width, height);
        x = initialX + movement;
        leg1.setStrokeColor(strokeColor);
        leg1.setFilled(true);
        leg1.setFillColor(fillColor);
        addLeg(new Leg(leg1, 3));

        Rectangle leg2 = new Rectangle(x, initialY, 10, 25);
        x = x + movement;

        leg2.setStrokeColor(strokeColor);
        leg2.setFilled(true);
        leg2.setFillColor(fillColor);
        addLeg(new Leg(leg2, 3));

        Rectangle leg3 = new Rectangle(x, initialY, 10, 25);
        x = x + movement;

        leg3.setStrokeColor(strokeColor);
        leg3.setFilled(true);
        leg3.setFillColor(fillColor);
        addLeg(new Leg(leg3, 3));

        Rectangle leg4 = new Rectangle(x, initialY, 10, 25);
        x = x + movement;

        leg4.setStrokeColor(strokeColor);
        leg4.setFilled(true);
        leg4.setFillColor(fillColor);
        addLeg(new Leg(leg4, 3));

        Rectangle leg5 = new Rectangle(x, initialY, 10, 25);
        leg5.setStrokeColor(strokeColor);
        leg5.setFilled(true);
        leg5.setFillColor(fillColor);
        addLeg(new Leg(leg5, 3));

        comp124graphics.Image dragon = null;
        try{
            dragon = new Image(0,0, Paths.get(getClass().getResource("/Dragon.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        dragon.setPosition(initialX,initialY-height*2);

        getGraphics().add(dragon);
        }



}
