package edu.macalester.comp124.critters;

import comp124graphics.Ellipse;

import java.awt.*;

import comp124graphics.Ellipse;
import comp124graphics.Image;
import javafx.scene.shape.Circle;


import java.awt.*;



public class CarriessPinkMonster extends Critter{


        private static final Color strokeColor = new Color(0, 0, 0);
        private static final Color fillColor = new Color(255,192,203);


        @Override
        protected void buildGraphics() {


            Ellipse body = new Ellipse(10,10,80,80);
            body.setFilled(true);
            body.setFillColor(new Color(255,192,203));
            getGraphics().add(body);
            addEye(new Eye(5, 0.36, 0.18, Color.RED), 50, 26);
            addEye(new Eye(5, 0.36, 0.18, Color.RED), 50, 26);

            comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(35, 73.5, 12.5, 25.7);
            leftLeg.setStrokeColor(strokeColor);
            leftLeg.setFilled(true);
            leftLeg.setFillColor(fillColor);
            addLeg(new Leg(leftLeg, 4));

            comp124graphics.Rectangle rightLeg  = new comp124graphics.Rectangle(55, 73.5, 12.5, 25.7);
            rightLeg.setStrokeColor(strokeColor);
            rightLeg.setFilled(true);
            rightLeg.setFillColor(fillColor);
            addLeg(new Leg(rightLeg, 4));


        }
    }



