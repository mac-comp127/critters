package edu.macalester.comp124.critters;

import comp124graphics.Image;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class KirbyTC extends Critter
{private static final Color strokeColor = new Color(206, 72, 79);
    //private static final Color fillColor = new Color(100, 0,0);
    private static final Color fillColor = strokeColor;





    @Override
    protected void buildGraphics()
    {
        comp124graphics.Rectangle leftLeg  = new comp124graphics.Rectangle(27, 90, 17, 35);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram

        comp124graphics.Rectangle rightLeg  = new comp124graphics.Rectangle(50, 90, 17, 35);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram


        comp124graphics.Image mario = null;
        try{
            mario = new Image(0,0, Paths.get(getClass().getResource("/KirbyTC.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(mario);


        addEye(new Eye(6, 0.26, 0.18, Color.RED), 42, 35);
        addEye(new Eye(6, 0.26, 0.18, Color.RED), 60, 35);





    }
}
