package edu.macalester.comp124.critters;

import comp124graphics.*;
import comp124graphics.Rectangle;

import java.awt.*;
import java.net.URISyntaxException;

/**
 * Created by LBC on 10/5/2017.
 */
public class Illuminati extends Critter {
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final Color FILL_COLOR = Color.WHITE;
	private static final int NUMBER_OF_LEGS = 3;

	@Override
	protected void buildGraphics() {
		Rectangle[] legs = new Rectangle[NUMBER_OF_LEGS];
		
		for (int i = 0; i < legs.length; i++)
		{
			legs[i] = new Rectangle(45 + i * 45,180, 20,50);
			legs[i].setStrokeColor(BORDER_COLOR);
			legs[i].setFillColor(FILL_COLOR);
			legs[i].setFilled(true);
			addLeg(new Leg(legs[i], 20));
		}

		try {
			comp124graphics.Image body = CritterUtils.fetchImageInPackage(this, "ResizedIlluminati.png");
			getGraphics().add(body);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		addEye(new Eye(20, 0.25, 0.4, Color.RED), 70, 80);
		addEye(new Eye(20, 0.25, 0.4, Color.RED), 130, 80);
		//addEye(new Eye(20, 0.25, 0.4, Color.RED), 100, 180);
	}
}
