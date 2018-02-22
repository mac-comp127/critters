package edu.macalester.comp124.critters;

import comp124graphics.Image;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

// Images Source: https://lionheart963.itch.io/sorcerer-villain
public class Villain extends Critter {
	private static final Color strokeColor = new Color(0, 0, 255);
	//private static final Color fillColor = new Color(100, 0,0);
	private static final Color fillColor = strokeColor;


	@Override
	protected void buildGraphics() {


		Image villainLeg = null;
		try{
			villainLeg = new Image(0,0, Paths.get(getClass().getResource("/villain-legs.png").toURI()).toString());
		} catch (URISyntaxException e){
			e.printStackTrace();
		}
		villainLeg.setPosition(12, 82);
		addLeg(new Leg(villainLeg, 4));

		Image villainBody = null;
		try{
			villainBody = new Image(0,0, Paths.get(getClass().getResource("/villain-body.png").toURI()).toString());
		} catch (URISyntaxException e){
			e.printStackTrace();
		}

		getGraphics().add(villainBody);


		addEye(new Eye(2, 0.26, 0.18, new Color(171, 61, 5)), 44, 31);
        addEye(new Eye(2, 0.26, 0.18, new Color(171, 61, 5)), 49, 31);
	}
	
	
}
