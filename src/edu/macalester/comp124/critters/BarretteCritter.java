package edu.macalester.comp124.critters;


import org.w3c.dom.css.Rect;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import static java.awt.Color.BLACK;
import static java.awt.Color.CYAN;

public class BarretteCritter extends Critter {
    //The color of the body and legs
private final Color STROKE_COLOR = new Color(139, 69, 19);
private final Color FILL_COLOR = STROKE_COLOR;
    private final int LEG_X_POS = 30;
    private final int LEG_Y_POS = 15;
        private final int LEG_WIDTH = 100;
        private final int LEG_HEIGHT = 10;

        //Building the critter
    public BarretteCritter(){
        buildGraphics();
    }
    public void buildGraphics(){
        makeBody();
        makeLegs();
        makeEyes();
    }

    private void makeBody(){
        Rectangle rec = new Rectangle(LEG_X_POS+30,LEG_Y_POS, 40, 130);
        rec.setFilled(true);
        rec.setStrokeColor(STROKE_COLOR);
        rec.setFillColor(FILL_COLOR);

        getGraphics().add(rec);
    }



    private void makeEyes(){
        addEye(new Eye(10, .5, .25, BLACK ), LEG_X_POS +35, LEG_Y_POS);
        addEye(new Eye(10, .5, .25, BLACK ), LEG_X_POS +65, LEG_Y_POS);

    }

    private void makeLegs(){
        int longLegs = 5;
        GraphicsGroup group = new GraphicsGroup();
        while(longLegs >0 ){
            Rectangle rec = new Rectangle(LEG_X_POS, LEG_Y_POS+(LEG_HEIGHT*(2*longLegs)), LEG_WIDTH, LEG_HEIGHT);
            rec.setStrokeColor(STROKE_COLOR);
            rec.setFilled(true);
            rec.setFillColor(FILL_COLOR);

            group.add(rec);

            longLegs--;
        }
        addLeg(new Leg(group, 4));
    }
}
