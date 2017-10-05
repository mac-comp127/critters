package edu.macalester.comp124.critters;

import comp124graphics.Image;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class JakeSalad extends Critter {
    private static final Color STROKECOLOR = new Color(225, 153, 51);
    private static final Color FILLCOLOR = STROKECOLOR;

    @Override
    protected void buildGraphics() {

        comp124graphics.Rectangle leftLeg = new comp124graphics.Rectangle(32, 150, 17, 50);
        leftLeg.setStrokeColor(STROKECOLOR);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(FILLCOLOR);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle rightLeg = new comp124graphics.Rectangle(90, 150, 17, 50);
        rightLeg.setStrokeColor(STROKECOLOR);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(FILLCOLOR);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram


        Image jakesalad = null;
        try {
            jakesalad = new Image(0, 0, Paths.get(getClass().getResource("/JakeSalad.png").toURI()).toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        getGraphics().add(jakesalad);

        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 55, 45);
        addEye(new Eye(5, 0.26, 0.18, Color.BLACK), 120, 45);
    }
}
