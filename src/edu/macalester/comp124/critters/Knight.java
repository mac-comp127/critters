package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;


public class Knight extends Critter {
	private static final Color strokeColor = new Color(41, 8, 9);
	//private static final Color fillColor = new Color(100, 0,0);
	private static final Color fillColor = strokeColor;


	@Override
	protected void buildGraphics() {
		
		Rectangle leftLeg  = new Rectangle(34, 66, 2, 20);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 3));       // this leg will be animated when running CritterProgram
        
        Rectangle rightLeg  = new Rectangle(46, 66, 2, 20);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 3));     // this leg will be animated when running CritterProgram
        
       
		Image knight = null;
		try{
			knight = new Image(0,0, Paths.get(getClass().getResource("/knight.png").toURI()).toString());
		} catch (URISyntaxException e){
			e.printStackTrace();
		}

		getGraphics().add(knight);
	}
	
	
}
