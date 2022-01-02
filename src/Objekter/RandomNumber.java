package Objekter;

public class RandomNumber {
    int dice;

    public RandomNumber(int dice) {
        this.dice = dice;
    }

    public int rollDice(){
        return (int) (dice*Math.random()+1);
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}
