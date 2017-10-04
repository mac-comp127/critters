Comp 124: Critters Lab
====

**Acknowledgement:** Paul Cantrell developed this lab, Shilad tweaked the Eye code, Bret tweaked the default critters, Libby added x, y offsets for Critters and a test program.

Today's lab is a bit of silly fun in the name of practicing graphics programming.

**When you get started, do not fork this repository. Check out the master copy directly.**

This project provides a framework for building little critters that wander around the screen.

Take a look at BoxBot, RoundBug, and Mario as examples, then create some new Critter subclasses of your own!

We recommend beginning by studying one of the existing critters. 

**impotant notes:** 

* These critter's legs are designed to be animated. Look at the examples to see where we have documented this. You will need to make sure that you add legs to the critter that you build, so it will look good as it moves around the screen.
* If you want to use an image like was done with Mario, make sure that your image is small enough that the overall size of your critter fits in the CritterTestProgram window.
* If you want to use an image, you should still add legs to it so it can move when run in CritterProgram later.
* If you want to use an image, place it in the directory called 'res', not in src. This is the resources directory.

Then create a brand new class that extends Critter and try your hand at building one of your own (spider, ladybug, etc.). Make sure that you use addLeg(new Leg(...)). You should test your new type of Critter by using the simple program called *CritterTestProgram*. Change it to create one of your type of Critter rather than one of the examples.


The code in CritterProgram is written to automatically detect new critters, but does so randomly, so it is best to only use this once you have your new Critter drawing properly in the CritterTestProgram.

We hope that you will be able to finish at least one new critter of your own invention!

Once you have a new Critter **working**, then:
* first right-click on the CritterTestProgram and do git-revert
* Then pull other people's changes by right-clicking on the whole repository and choosing git-repository-pull. 
* Then, push your changes. Do this by right-clicking on the  whole repository and using the Git-commit.

At the end of class, we'll have a critter party on the projector.
