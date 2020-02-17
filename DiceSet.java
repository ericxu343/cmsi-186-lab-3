/**
 * A dice set holds a collection of Die objects. All of the die objects have
 * the same number of sides.
 */
import java.util.Random;
public class DiceSet {

    // TODO add fields
    private final int sidesOnEachDie;
    private final int numberOfDice;
    private int value;

    /**
     * Creates a DiceSet containing the given number of dice, each with the
     * given number of sides. All die values start off as 1. Throws an
     * IllegalArgumentException if either less than two dice were provided
     * or if it is asked to make dice with less than 4 sides.
     */


    public DiceSet(int sidesOnEachDie, int numberOfDice) {
        // TODO
        if (sidesOnEachDie < 4) {
          throw new IllegalArgumentException("At least four sides required for each die");
        }
        else if (numberOfDice < 2) {
          throw new IllegalArgumentException("At least 2 die required");
        }
        sidesOnEachDie = this.sidesOnEachDie;
        numberOfDice = this.numberOfDice;

    }

    /**
     * Creates a DiceSet where each die has the given number of sides, with the
     * given values.
     */

    /*
    public DiceSet(int sidesOnEachDie, int... values) {
       // TODO
       sidesOnEachDie = this.sidesOnEachDie;
       value = ... values;
    }
    */

    public DiceSet(int sidesOnEachDie, int[] values) { // not logical
        // TODO
        // creates and defines the number of sides
        sidesOnEachDie = this.sidesOnEachDie;
        values = new int[numberOfDice];
        for (int i = 0; i < numberOfDice; i++) { // assigns a value to each of the data in the value
          values[i] = this.value;
        }

    }


    /**
     * Returns the descriptor of the dice set; for example "5d20" for a set with
     * five dice of 20 sides each; or "2d6" for a set of two six-sided dice.
     */
    public String descriptor() {
        // TODO
        // prints the description of how many dies and number of sides
        System.out.printf("There are d%d ", numberOfDice, sidesOnEachDie);

    }

    /**
     * Returns the sum of the values of each die in the set.
     */
    public int sum() {
        // TODO

    }

    /**
     * Rolls all the dice in the set.
     */
    public void rollAll() {
        // TODO
      /*  for(){

        } */

    }

    /**
     * Rolls the ith die, updating its value.
     */
    public void rollIndividual(int i) {
        // TODO


    }

    /**
     * Returns the value of the ith die.
     */
    public int getIndividual(int i) {
        // TODO

    }

    /**
     * Returns the values of each of the dice in a list.
     */
    public List<Integer> values() {
        // TODO
        /* for(){

        } */

    }

    /**
     * Returns whether this dice set has the same distribution of values as
     * an other dice set. The two dice sets must have the same number of dice
     * and the same number of sides per dice, and there must be the same
     * number of each value in each set.
     */
    public boolean isIdenticalTo(DiceSet diceSet) {
        // TODO
    }

    /**
     * Returns a string representation in which each of the die strings are
     * joined without a separator, for example: "[2][5][2][3]".
     */
    @Override public String toString() {



        // TODO
    }
}
