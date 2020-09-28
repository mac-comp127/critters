Comp 127: Critters Lab
====

**Acknowledgement:** Paul Cantrell developed this lab, Shilad tweaked the Eye code, Bret tweaked the default critters, Libby added x, y offsets for Critters and a test program.

Today's lab is a bit of silly fun in the name of practicing graphics programming and using inheritance.

This project provides a framework for building little critters that wander around the screen. You will add your own critters.

## Create your critter

Begin by studying one of the existing critters. Take a look at BoxBot, RoundBug, and Mario as examples. Run `CritterTester` to study the individual critters. Then run `CritterParty` to see all of them wandering around together.

Now create some new critters of your own! Create a new class that extends `Critter`, called `<<YourGithubUsername>>Critter` (but with your actual GitHub username, with the first letter capitalized). This is to make sure that your critter’s name is unique. Add a comment to the top of your `Critter` file with your full name.

There are only three requirements for your critter:
- Add animated legs or eyes (or both), as the example critters do.
- Don’t make it so big that it hogs the screen. Play nice with the other critters.
- Have fun!

Test your new type of Critter using `CritterTester`. Change it to create one of your type of Critter rather than one of the examples.

Design your critter so that it approximately fits within the grey guide box that `CritterTester` draws.

**Important notes:** 

* Look at the examples to see how they add the animated legs and eyes. Study how they use `addLeg(new Leg(...))`.
* If you want to use an image, as Mario does:
    - Make sure that your image is small enough that it fits within CritterTester’s guide box.
    - Place your image in the directory called `res`, not in `src`. This is the resources directory.
    - Prefix the image’s filename with your GitHub username, e.g. `pcantrell-octopus.png`.
    - Load your image like this: `new Image(0, 0, "filename.jpg")`. This will give an image you can position, resize, and add to a graphics group just like any other graphics object.
    - You should still add animated features so it looks good in the `CritterParty`. Don’t just drop in a fixed image and call it done.
* Make sure you **add your Github username** to your critter class name **and** image names to avoid git conflicts.

The code in `CritterParty` is written to automatically detect new critters, but does so randomly, so it is best to only use this once you have your new Critter drawing properly in the `CritterTester`.

We hope that you will be able to finish at least one new critter of your own invention during lab time!

## Share your critter

Once you have a new Critter working and **thoroughly tested**, then:

- Open your project in Github Desktop, and…
- …**BEFORE YOU COMMIT ANYTHING**, uncheck the checkbox next to `CritterTester` so that you aren’t committing your changes to it. You can even right-click it and choose “Discard Changes” to make sure you don’t commit them. Make sure you **only discard changes to `CritterTester`**. Don’t lose your work!

    🚨 Warning: 🚨 If you commit any changes to `CritterTester`, you will get merge conflicts with the other students. If you accidentally committed changes to that class, **ask the instructor for help before you push!**

- Commit your code.
- Now pull other people's critters by choosing Repository → Pull. 
- Did any changes come in? Run `CritterParty` again to make sure everything still works.
- Finally, push your changes by choosing Repository → Push.

## Repeat for extra fun!

You only need to make one critter to complete the lab, but more critters make for a merrier critter party!

As the critters come in, we’ll have a class critter party on the projector.
