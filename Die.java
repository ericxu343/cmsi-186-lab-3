import java.util.Random;

/**
 * A simple class for representing die objects. A die has a given number of
 * sides (at least) four, set when the die is constructed and which can never
 * be changed. The die's value can be changed, but only by calling its roll()
 * method.
 */
public class Die {

    // TODO: Add fields

    /**
     * Constructs a die with the given number of sides and starting value.
     * @throws IllegalArgumentException if the number of sides is less than 4 or
     * if the starting value is not consistent with the number of sides.
     */

     /**
      * Create the fields
     */
     private static Random random = new Random();
     public static final String SIX_SIDED_DIE_EMOJI = "🎲"; // made it so people can see it and not changed
     public final int sides;
     public int value; // value has to change only by rolling it (cannot be seen)
//     var aDie = new Die(numOfSides, aValue);
    public Die(int sides, int value) {
        // TODO
        if (sides < 4) {
          throw new IllegalArgumentException("At least four sides required");
        }
        else if (value < 1 || value > sides) {
          throw new IllegalArgumentException("Die value not legal for die shape");
        }

        this.sides = sides; // assigns the number of sides to die
        this.value = value; // assigns a value to the die

    }

    /**
     * Simulates a roll by randomly updating the value of this die. In addition to
     * mutating the die's value, this method also returns the new updated value.
     */
    public int roll() {
        // TODO
        value = random.nextInt(sides) + 1; // creates a value from 0 to 5 and adds 1
        return value;
    }

    /**
     * Returns the number of sides of this die. Allows us to see the sides
     */
    public int getSides() {
        // TODO
        return sides;
    }

    /**
     * Returns the value of this die. Allows us to see the values. Also it gets called first before roll logically
     */
    public int getValue() {
        // TODO
        return value;
    }

    /**
     * Returns a description of this die, which is its value enclosed in square
     * brackets, without spaces, for example "[5]".
     */
    @Override public String toString() {
        // TODO
        return "[" + value + "]"; // returns the value in brackets

    }
}
