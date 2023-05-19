# Monty Hall

The [Monty Hall Problem](https://www.montyhallproblem.com/) is based on a game show hosted by Monty Hall in which a
contestant picks one of three doors, behind one of which is a prize. The host then reveals that one of the doors **not**
selected is the wrong choice (holds a *goat* not a prize). The host then offers the contestant the chance to switch
their choice from the door they originally chose, to the other remaining door.

**Should the contestant switch?**

## Requirements

Write a program that demonstrates whether there is a benefit in switching when presented with the choice given above.
Your program should start with 3 doors and should store which door holds the prize. It should then select one of the
doors, at which point one of the remaining non-winning doors should be revealed to not hold the prize. At this point, 
either **stay** or **switch**.

Track the win percentage of each strategy (staying vs. switching). Iterate the game at least 10000 times to see how the 
two percentages compare.

## Attribution
This technical challenge is described [here](https://github.com/ardalis/kata-catalog/blob/main/katas/Monty%20Hall.md).