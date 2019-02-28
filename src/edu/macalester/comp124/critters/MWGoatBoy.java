package edu.macalester.comp124.critters;

import comp124graphics.GraphicsGroup;
import comp124graphics.Image;
import comp124graphics.Line;

import java.awt.*;

/**
 * @author Paul Cantrell
 */
public class MWGoatBoy extends Critter {

    @Override
    protected void buildGraphics() {
        // these offsets are designed to be added to the location of initial placement
        // of this Critter, since we use negative x and y values to place parts of it
        // on the graphics GCompound
        xOffset = 44.0;
        yOffset = 40.0;



//        createLeg(20,  20, 0,  0);
//        createLeg(-20+10-20+40, 0+10+40, -34+10+40,   10+10+40);
//        createLeg(-20+10+40, -20+10+40, -30+10+40, -10+10+40);
//        createLeg( 40+40+10,  20+10+40,  50+10+40,  30+10+40);
//        createLeg( 44+40+10, 0+10+40,  54+10+40,   10+10+40);
//        createLeg( 40+10+40, -20+10+40,  50+10+40, -10+20+40);

        createLeg(-30+40-30+30,  10+40+10, -40+40-40,  20+40+20);
        createLeg(-30+40-30+30, -10+40-10, -44+40-44,   0+40);
        createLeg(-30+40-30+30, -30+40-30, -40+40-40, -20+40-20);
        createLeg( 30+40+30+30,  10+40+10,  40+40+40,  20+40+20);
        createLeg( 34+40+34+30, -10+40+10,  44+40+44,   0+40);
        createLeg( 30+40+30+30, -30+40-30,  40+40+40, -20+40-20);

        Image goat = CritterUtils.loadCritterImage("little ruby cutout.gif");
        getGraphics().add(goat);


//        Polygon body = new Polygon(-25.0,50.0,);
//        body.setFilled(true);
//        body.setFillColor(new Color(158, 103, 12));
//        getGraphics().add(body);

//        Eye leftEye = new Eye(10, 0.46, 0.18, Color.GREEN);
//        Eye rightEye = new Eye(10, 0.46, 0.18, Color.GREEN);
//        addEye(leftEye, -8, 20);
//        addEye(rightEye, 28, 20);
    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GraphicsGroup legGroup = new GraphicsGroup(0,0);
        Color color = new Color(95, 62, 7);
        Line legLine0 = new Line(40, 38, x0, y0-1);
        legLine0.setStrokeColor(color);
        legGroup.add(legLine0);

        Line legLine1 = new Line(x0, y0-1, x1, y1);
        legLine1.setStrokeColor(color);
        legGroup.add(legLine1);

        Line legLine2 = new Line(x1, y1, x0, y0+1);
        legLine2.setStrokeColor(color);
        legGroup.add(legLine2);

        Line legLine3 = new Line(x0, y0+1, 40, 45);
        legLine3.setStrokeColor(color);
        legGroup.add(legLine3);


        addLeg(new Leg(legGroup, 4));
    }
}
