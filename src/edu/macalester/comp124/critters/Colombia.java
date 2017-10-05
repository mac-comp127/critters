package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * Created by Juan David Garrido on 10/5/2017.
 */
public class Colombia extends Critter
{
    @Override
    protected void buildGraphics()
    {
        Rectangle leftLeg1  = new Rectangle(90, 150, 7, 50);
        leftLeg1.setFilled(true);
        leftLeg1.setFillColor(Color.YELLOW);
        addLeg(new Leg(leftLeg1, 10));

        Rectangle leftLeg2  = new Rectangle(97, 150, 7, 50);
        leftLeg2.setFilled(true);
        leftLeg2.setFillColor(Color.BLUE);
        addLeg(new Leg(leftLeg2, 10)); // this leg will be animated when running CritterProgram

        Rectangle leftLeg3  = new Rectangle(104, 150, 7, 50);
        leftLeg3.setFilled(true);
        leftLeg3.setFillColor(Color.RED);
        addLeg(new Leg(leftLeg3, 10)); // this leg will be animated when running CritterProgram

        Rectangle rightLeg1  = new Rectangle(130, 150, 7, 50);
        rightLeg1.setFilled(true);
        rightLeg1.setFillColor(Color.BLUE);
        addLeg(new Leg(rightLeg1, 10));     // this leg will be animated when running CritterProgram

        Rectangle rightLeg2  = new Rectangle(137, 150, 7, 50);
        rightLeg2.setFilled(true);
        rightLeg2.setFillColor(Color.YELLOW);
        addLeg(new Leg(rightLeg2, 10));     // this leg will be animated when running CritterProgram

        Rectangle rightLeg3  = new Rectangle(144, 150, 7, 50);
        rightLeg3.setFilled(true);
        rightLeg3.setFillColor(Color.RED);
        addLeg(new Leg(rightLeg3, 10));     // this leg will be animated when running CritterProgram

        Image colombia = null;
        try{
            colombia = new Image(0,0, Paths.get(getClass().getResource("/ColombiaFlag.png").toURI()).toString());
        } catch (URISyntaxException e){
            e.printStackTrace();
        }

        getGraphics().add(colombia);

        addEye(new Eye(20, 0.5, 0.18, Color.BLUE), 80, 50);
        addEye(new Eye(20, 0.5, 0.18, Color.BLUE), 120, 50);
    }
}
