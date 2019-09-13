# CMPSC 100-03 Practical Session 3

In this practical session, we will solve and assemble a puzzle within a puzzle with the goal of putting our Gator Wizard back together in ASCII form!

* Assigned: Friday, 13 September 2019
* Due: Monday, 16 September 2019
* Point value: 10 points

## General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Table of Contents

* [Cloning your repository](#cloning-your-repository)
* [Slack](#slack)
* [Github](#github)
* [Putting the Gator Wizard back together](#putting-the-gator-wizard-back-together)

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## A note on running applications

As our applications get more and more complex, running them using `java` or compiling using `javac` will become untenable. From this point, I suggest:

### Docker

- [ ] For those of you using the `gatoreducator/dockagator` `container`, you can run `gradle run` in the command line of the container by first `mount`ing and running `/bin/bash` when you start the `container` like so:

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

* Notice the `/bin/bash` at the end. Running the command without this piece causes the `container` to simply grade the `mount`ed project. Specifying a an additional command interrupts the process and runs a terminal session instead.

-

### `gradle` commands in terminal

- [ ]In a terminal window, `cd` to the main directory of your repository and type `gradle run` and press the `Enter` key.
* This simply runs the the project and displays any output programmed to display.

### Practicing file management

- [ ] `cd` to the folder you made to contain all class assignments.
* For Mac users, this is likely `~/Desktop/CMPSC100`
* For Windows users, you may find it in one of the following locations:
    * `~/OneDrive/Desktop`
    * `~/Desktop`
* Remember that if you clone the repository elsewhere, you can always drag and drop it in the right location without breaking a thing!

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## Putting the Gator Wizard back together

### Puzzles within puzzles

Stop me if you've heard this one:

```
The Gator Wizard sat on a wall
The Gator Wizard had a great fall
Four-score Programmers and Four-score more,
Could not make the Gator Wizard what he was before!
```

The Gator Wizard dropped his puzzle program and jumbled it up! (Foolish wizard.) He needs your help to put it back together again.

- [ ] Locate the source code for `DisplayPuzzle.java` in the repository's `src/main/java/puzzle` folder.
- [ ] Open it and survey the damage
* It's quite jumbled, after all!

Your task is to reassemble the program and make it work like new! The program contains:

- [ ] Let's collect our pieces. In the `src/main/java/puzzle` folder, type `javac Pieces.java -d .` and press `Enter`.

- [ ] Two (2) multi-line `Javadoc` comments that look like this:
```java
/** {TEXT}
 *
 * @{AUTHOR/PARAMS}
 */
```
- [ ] One (1) `import` statement which goes at the top.
- [ ] One (1) `class` (object) declaration
- [ ] One (1) `main` method
- [ ] Three (3) puzzle pieces (`Pieces` object methods) to reorder

At its most glorious, the Gator Wizard's puzzle should look like this:

```
                             ##/*###
                            /((((/,//#.
                             .%  %(,((.,% .
                                  %/((///%#(%
                               .%%*.(((//%(((/
                               %###%%%%#(##(/
                                .%%###%((((/,,
                #((((%((((%%%#((((((((((((((((%(((((.
              (((%#((((%(((%%%%%%%%%%%%%%%%%%%.%%%,
            (%((((((((((((((%#(#%%%//////.
          /##(((#(##(******#(((##(/////##%#(
       .#%((/%((%(#%(////((####/////* (#%%%%
     (##((////%(#(##(////((%#(/////    *%%%%
   /(((((//    #(((((((   (((((((      /##(#(
```

### A little help from his friends

Great! You've put the Gator Wizard's puzzle back together! He was in the middle of improving the puzzle when he dropped it (clumsy wizard) and he doesn't trust himself to hold it (no thumbs, after all).

He'd like you to:

- [ ] Replace his `TODO` with an empty line printed to the terminal followed by a caption of your choosing.
* Try to center it with reference to Gator's picture.
    * This may require some "trial and error" work with spacing on the left side of the string. (For those interested in terminology, space on either side of a string is referred to as `padding`.)

## Finished product

A successful program will:

- [ ] Output 15 lines
- [ ] Contain no `{}` placeholders
- [ ] Contain no `TODO` statements
- [ ] Use _at most_:
    - [ ] 4 `System.out.println` statements
    - [ ] 1 `System.out.print` statement
- [ ] Have 2 multi-line `Javadoc` comments

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`