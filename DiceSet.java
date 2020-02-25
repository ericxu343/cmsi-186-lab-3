/**
 * A dice set holds a collection of Die objects. All of the die objects have
 * the same number of sides.
 */
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class DiceSet {

    // TODO add fields
    private static Random random = new Random();
    private Die[] dice; // a collection of die objects
//    private int[][] diceMatrix; // makes matrix of dice values

    /**
     * Creates a DiceSet containing the given number of dice, each with the
     * given number of sides. All die values start off as 1. Throws an
     * IllegalArgumentException if either less than two dice were provided
     * or if it is asked to make dice with less than 4 sides.
     */


    public DiceSet(int sidesOnEachDie, int numberOfDice) {
        // TODO
        if (sidesOnEachDie < 4) {
          throw new IllegalArgumentException("Dice must have at least four sides");
        }
        if (numberOfDice < 2) {
          throw new IllegalArgumentException("At least two dice required");
        }
        this.dice = new Die[numberOfDice];
        for (var i = 0; i < numberOfDice; i++) {
          this.dice[i] = new Die(sidesOnEachDie, 1); // set them to 1
        }

    }

    /**
     * Creates a DiceSet where each die has the given number of sides, with the
     * given values.
     */


    public DiceSet(int sidesOnEachDie, int... values) {
        // TODO
        if (sidesOnEachDie < 4) {
          throw new IllegalArgumentException("Dice must have at least four sides");
        }
        if (values.length < 2) {
          throw new IllegalArgumentException("At least two dice required");
        }

        this.dice = new Die[values.length]; // creates an array of Die with number of values

        for (var i = 0; i < this.dice.length; i++){

          this.dice[i] = new Die(sidesOnEachDie, values[i]); // creates a dice in the set
        }
    }


    /**
     * Returns the descriptor of the dice set; for example "5d20" for a set with
     * five dice of 20 sides each; or "2d6" for a set of two six-sided dice.
     */
    public String descriptor() {
        return this.dice.length + "d" + this.dice[0].sides;
    }

    /**
     * Returns the sum of the values of each die in the set.
     */
    public int sum() {
        // TODO
        int sum = 0;
        for (int i = 0; i < this.dice.length; i++) {
          sum += this.dice[i].value; // add each of the indviduals
        }
        return sum;

    }

    /**
     * Rolls all the dice in the set.
     */
    public void rollAll() {
        // TODO
        // List<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i< this.dice.length; i++){
          this.dice[i].roll(); // rolls each die in set
          // values.add(dice.values[i]);
        }
        return;
    }

    /**
     * Rolls the ith die, updating its value.
     */
    public void rollIndividual(int i) {
        // TODO
        // rolls the ith die in set
        this.dice[i].roll();
        return;
    }

    /**
     * Returns the value of the ith die.
     */
    public int getIndividual(int i) {
        // TODO
        return this.dice[i].value;
    }

    /**
     * Returns the values of each of the dice in a list.
     */
    public List<Integer> values() {
        // TODO
        // Make a loop
        Integer [] diceArray = new Integer[this.dice.length];
        for (int i = 0; i < this.dice.length; i++){
          int diceValue = this.dice[i].value;
          diceArray[i] = diceValue;
        }
        return Arrays.asList(diceArray);

    }

    /**
     * Returns whether this dice set has the same distribution of values as
     * an other dice set. The two dice sets must have the same number of dice
     * and the same number of sides per dice, and there must be the same
     * number of each value in each set.
     */
    public boolean isIdenticalTo(DiceSet diceSet) {
        // TODO
        if(this.dice.length < diceSet.dice.length || diceSet.dice.length < this.dice.length){
          return false;
        }

        if(this.dice[0].sides > diceSet.dice[0].sides || this.dice[0].sides < diceSet.dice[0].sides){
          return false;
        }
        else{
          return true;
        }
    }

    /**
     * Returns a string representation in which each of the die strings are
     * joined without a separator, for example: "[2][5][2][3]".
     */
    @Override public String toString() {


        // TODO
        String result = "";
        for(Die d : dice){
          result += d.toString();
        }
        return result;
    }
}
