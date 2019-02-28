package edu.macalester.comp124.critters;
import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;


public class buffPH extends Critter {
        private static final Color strokeColor = new Color(0, 0, 0);
        private static final Color fillColor = strokeColor;

        @Override
        protected void buildGraphics() {

            Rectangle leftLeg  = new Rectangle(25, 73.5, 12.5, 25.7);
            leftLeg.setStrokeColor(strokeColor);
            leftLeg.setFilled(true);
            leftLeg.setFillColor(fillColor);
            addLeg(new Leg(leftLeg, 4));

            Rectangle rightLeg  = new Rectangle(40, 73.5, 12.5, 25.7);
            rightLeg.setStrokeColor(strokeColor);
            rightLeg.setFilled(true);
            rightLeg.setFillColor(fillColor);
            addLeg(new Leg(rightLeg, 4));

            Image mario = CritterUtils.loadCritterImage("754ccc2401ed4566ae099f156befea2et.jpg");
            getGraphics().add(mario);

            addEye(new Eye(3.6, 0.26, 0.18, Color.RED), 31, 40);
            addEye(new Eye(3.6, 0.26, 0.18, Color.RED), 42, 40);
            addEye(new Eye(3.6, 0.26, 0.18, Color.BLUE), 35, 15);
            addEye(new Eye(3.6, 0.26, 0.18, Color.BLUE), 42, 15);
        }
    }


