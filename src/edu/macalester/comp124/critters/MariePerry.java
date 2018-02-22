package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class MariePerry extends Critter {
    private static final Color strokeColor = new Color(0,0,0);
    private static final Color fillColor = new Color(43,219,213);

    @Override
    protected void buildGraphics() {
        addEye(new Eye(10, 0.4, 0.18, Color.BLACK), 10, 30);

        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(50, 40, 17, 30);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle rightLeg  = new Rectangle(100, 40, 17, 30);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram

        Image perry = null;
        try{
            perry = new Image(0,0, Paths.get(getClass().getResource("/perryplatypus.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }
        getGraphics().add(perry);

        addEye(new Eye(10, 0.4, 0.18, Color.BLACK), 40, 30);
    }
}
