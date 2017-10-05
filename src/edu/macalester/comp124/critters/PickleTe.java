package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;


public class PickleTe extends Critter {
	private static final Color strokeColor = new Color(0, 75, 0);
	//private static final Color fillColor = new Color(100, 0,0);
	private static final Color fillColor = strokeColor;


	@Override
	protected void buildGraphics() {

		Rectangle leftLeg  = new Rectangle(100, 250, 17, 35);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 10));       // this leg will be animated when running CritterProgram
        
        Rectangle rightLeg  = new Rectangle(150, 250, 17, 35);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 10));     // this leg will be animated when running CritterProgram
        
       
		Image rick = null;
		try{
			rick = new Image(0,0, Paths.get(getClass().getResource("/pickleRick.png").toURI()).toString());
		} catch (URISyntaxException e){
			e.printStackTrace();
		}

		getGraphics().add(rick);
		
		
		addEye(new Eye(13, 0.26, 0.18, Color.BLACK), 70, 72);
        addEye(new Eye(13, 0.26, 0.18, Color.BLACK), 97, 67);
	}
	
	
}
