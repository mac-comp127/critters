package edu.macalester.comp124.critters;

import comp124graphics.Arc;
import comp124graphics.Rectangle;
import java.awt.*;


public class JellyfishGraham extends Critter{
    private Color jellyColor;
    private Color legColor;
    private final int BODY_WIDTH=80;
    private final int BODY_HEIGHT = 40;

    @Override
    public void buildGraphics(){
        jellyColor=new Color(200,0,(int)(Math.random()*100+100));
        legColor=jellyColor;

        //body
        Arc body = new Arc(BODY_WIDTH/4,BODY_HEIGHT/2,BODY_WIDTH/2,BODY_HEIGHT,0,180);
        body.setStrokeColor(jellyColor);
        body.setStrokeWidth(BODY_WIDTH/2);
        getGraphics().add(body);


        buildLegs((int)(Math.random()*4+4));

        addEye(new Eye(5,1, .5,Color.blue),BODY_WIDTH/4,BODY_HEIGHT/2);
        addEye(new Eye(5,1, .5,Color.blue),3*BODY_WIDTH/4, BODY_HEIGHT/2);


    }

    public void buildLegs(int legCount){
        int spaceCount=2*legCount-1;

        for(int i = 0; i<legCount;i++){
            Rectangle leg = new Rectangle(i*2*BODY_WIDTH/spaceCount, BODY_HEIGHT, BODY_WIDTH/spaceCount, Math.random()*10+50);
            leg.setFilled(true);
            leg.setFillColor(legColor);
            leg.setStroked(false);

            addLeg(new Leg(leg, 4));
        }
    }

}
