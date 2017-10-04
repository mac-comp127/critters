package edu.macalester.comp124.critters;

import comp124graphics.CanvasWindow;
import comp124graphics.GraphicsGroup;


/**
 * Created by shoop on 2/22/16.
 */
public class CritterTestProgram extends CanvasWindow {

    private Critter myCritter;

    public CritterTestProgram() {
        super("Critter Test", 260, 260);
        //myCritter = new BoxBot();
        myCritter = new RoundBug();
        run();
    }

    public void run() {
        GraphicsGroup graphics = myCritter.getGraphics();
        // place the critter at 40.0, 40.0 by also including the additional offset needed
        graphics.setPosition(40.0 + myCritter.getxOffset(), 40.0 + myCritter.getyOffset());
        add(graphics);
    }

    public static void main(String[] args){
        CritterTestProgram test = new CritterTestProgram();
    }
}