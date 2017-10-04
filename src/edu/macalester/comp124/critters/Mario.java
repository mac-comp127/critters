package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.Color;
import java.net.URISyntaxException;
import java.nio.file.Paths;


public class Mario extends Critter {
	private static final Color strokeColor = new Color(0, 0, 255);
	//private static final Color fillColor = new Color(100, 0,0);
	private static final Color fillColor = strokeColor;


	@Override
	protected void buildGraphics() {
		
		Rectangle leftLeg  = new Rectangle(27, 100, 17, 35);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram
        
        Rectangle rightLeg  = new Rectangle(50, 100, 17, 35);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram
        
       
		Image mario = null;
		try{
			mario = new Image(0,0, Paths.get(getClass().getResource("/Mario.png").toURI()).toString());
		} catch (URISyntaxException e){
			e.printStackTrace();
		}

		getGraphics().add(mario);
		
		
		addEye(new Eye(5, 0.26, 0.18, Color.RED), 42, 35);
        addEye(new Eye(5, 0.26, 0.18, Color.RED), 55, 35);
	}
	
	
}
