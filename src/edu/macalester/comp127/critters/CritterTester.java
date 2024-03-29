package edu.macalester.comp127.critters;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.Rectangle;

import java.awt.Color;


/**
 * Created by shoop on 2/22/16.
 */
public class CritterTester {

    private CanvasWindow canvas;
    private Critter testCritter;

    public CritterTester() {
        canvas = new CanvasWindow("Critter Test", 260, 260);

        Rectangle targetBounds = new Rectangle(40, 40, 100, 100);
        targetBounds.setStrokeColor(new Color(0, 0, 0, 0.1f));
        targetBounds.setStrokeWidth(3);
        canvas.add(targetBounds);

        testCritter = new BoxBot();
       // testCritter = new RoundBug();  // try these too
       // testCritter = new Mario();


        showCritter();
        run();
    }

    private void showCritter() {
        GraphicsGroup graphics = testCritter.getGraphics();
        graphics.setPosition(40.0 + testCritter.getxOffset(), 40.0 + testCritter.getyOffset());
        canvas.add(graphics);
    }

    @SuppressWarnings("InfiniteLoopStatement")
    private void run() {
        testCritter.setSpeed(10);
        Point center = testCritter.getGraphics().getPosition();
        double t = 0;
        while (true) {
            testCritter.setGoal(new Point(
                center.getX() + Math.cos(t) * 5 + 5,
                center.getY() + Math.sin(t) * 5 + 5));
            testCritter.moveTowardsGoal(0.05);

            canvas.draw();
            canvas.pause(50);
            t = (t + 0.1) % (Math.PI * 2);
        }
    }

    public static void main(String[] args) {
        new CritterTester();
    }
}