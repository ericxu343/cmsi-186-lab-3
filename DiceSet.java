import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class DiceSet {

    private static Random random = new Random();
    private Die[] dice;

    public DiceSet(int sidesOnEachDie, int numberOfDice) {

        if (sidesOnEachDie < 4) {
            throw new IllegalArgumentException("Dice must have at least four sides");
        }
        if (numberOfDice < 2) {
            throw new IllegalArgumentException("At least two dice required");
        }
        this.dice = new Die[numberOfDice];

        for (var i = 0; i < numberOfDice; i++) {
            this.dice[i] = new Die(sidesOnEachDie, 1);
        }

    }


    public DiceSet(int sidesOnEachDie, int... values) {

        if (sidesOnEachDie < 4) {
            throw new IllegalArgumentException("Dice must have at least four sides");
        }
        if (values.length < 2) {
            throw new IllegalArgumentException("At least two dice required");
        }

        this.dice = new Die[values.length];

        for (var i = 0; i < this.dice.length; i++){
            this.dice[i] = new Die(sidesOnEachDie, values[i]);
        }
    }


    public String descriptor() {
        return this.dice.length + "d" + this.dice[0].sides;
    }


    public int sum() {
        int sum = 0;
        for (int i = 0; i < this.dice.length; i++) {
            sum += this.dice[i].value;
        }
        return sum;
    }


    public void rollAll() {
        for (int i = 0; i< this.dice.length; i++) {
            this.dice[i].roll();
        }
        return;
    }


    public void rollIndividual(int i) {
        this.dice[i].roll();
        return;
    }


    public int getIndividual(int i) {
        return this.dice[i].value;
    }


    public List<Integer> values() {
        Integer [] diceArray = new Integer[this.dice.length];
        for (int i = 0; i < this.dice.length; i++) {
            int diceValue = this.dice[i].value;
            diceArray[i] = diceValue;
        }
        return Arrays.asList(diceArray);

    }


    public boolean isIdenticalTo(DiceSet diceSet) {
        if (this.dice.length < diceSet.dice.length || diceSet.dice.length < this.dice.length) {
            return false;
        }

        if (this.dice[0].sides > diceSet.dice[0].sides || this.dice[0].sides < diceSet.dice[0].sides) {
            return false;
        }
        else {
            return true;
        }
    }


    @Override public String toString() {

        String result = "";
        for(Die d : dice) {
            result += d.toString();
        }
        return result;
    }
}
