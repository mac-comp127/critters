package edu.macalester.comp124.critters;

import comp124graphics.GraphicsGroup;
import comp124graphics.Line;
import comp124graphics.Rectangle;
import comp124graphics.Ellipse;
import java.awt.*;

public class AngelsCritters extends Critter{
    private static final Color strokeColor = new Color(10,100,0);
    private static final Color fillColor = new Color(200,200,0);
    @Override
    protected void buildGraphics() {

//        Rectangle leg1 = new Rectangle(-16,0,10,40);
//        leg1.setStrokeColor(strokeColor);
//        leg1.setFilled(true);
//        leg1.setFillColor(fillColor);
//        addLeg(new Leg(leg1,1));
//
//        Rectangle Leg2 = new Rectangle( 40,10,0,-16);
//        Leg2.setStrokeColor(strokeColor);
//        Leg2.setFilled(true);
//        Leg2.setFillColor(fillColor);
//        addLeg(new Leg(Leg2, 2));   // this leg will be animated when running CritterParty

        xOffset = 44.0;
        yOffset = 30.0;

        createLeg(-30, 10, -40, 20);
        createLeg(-30, -10, -44, 0);
        createLeg(-30, -30, -40, -20);
        createLeg(30, 10, 40, 20);
        createLeg(34, -10, 44, 0);
        createLeg(30, -30, 40, -20);


        Rectangle body = new Rectangle(-20,-30, 40, 40);
        body.setStrokeColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.WHITE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.WHITE);
        addEye(leftEye, -10, -45);
        addEye(rightEye, 10, -45);
    }

        private void createLeg(double x0, double y0, double x1, double y1) {
            GraphicsGroup legGroup = new GraphicsGroup(0,0);
            Color color = new Color(10,9,100);
            Line legLine0 = new Line(0, -2, x0, y0-1);
            legLine0.setStrokeColor(color);
            legGroup.add(legLine0);

            Line legLine1 = new Line(x0, y0-1, x1, y1);
            legLine1.setStrokeColor(color);
            legGroup.add(legLine1);


            Line legLine2 = new Line(x1, y1, x0, y0+1);
            legLine2.setStrokeColor(color);
            legGroup.add(legLine2);

            Line legLine3 = new Line(x0, y0+1, 0, 5);
            legLine3.setStrokeColor(color);
            legGroup.add(legLine3);


            addLeg(new Leg(legGroup, 4));
        }

        
        
        
//        Ellipse head = new Ellipse( 20,30 , 36, 20);
//        head.setStrokeColor(strokeColor);
//        head.setFilled(true);
//        head.setFillColor(fillColor);
//        getGraphics().add(head);


    }




