# CMPSC 100-03 Practical Session 3

In this practical session, we will solve and assemble a puzzle within a puzzle with the goal of putting our Gator Wizard back together in ASCII form!
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

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

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

- [ ] Locate the source code in the repository's `src/main/java/puzzle` folder.
- [ ] Open it and survey the damage
* It's quite jumbled, after all!

Your task is to reassemble the program and make it work like new! The program contains:

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
- [ ] Three (3) puzzle pieces to reorder

At his most glorious, he should look like this:

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

Great! You've put the Gator Wizard's puzzle back together! He was in the middle of improving it when he dropped it (clumsy wizard) and he doesn't trust himself to hold it (no thumbs, after all).

He'd like you to:

- [ ] Replace his `TODO` with an empty line followed by a caption of your choosing!
* Try to center it with reference to Gator's picture.

## Finished product

A successful program will:

- [ ] Be 16 lines
- [ ] Contain no `{}` placeholders
- [ ] Contain no `TODO` statements
- [ ] Use _at most_:
    - [ ] 4 `System.out.println` statements
    - [ ] 1 `System.out.print` statement
- [ ] 2 multi-line `Javadoc` comments