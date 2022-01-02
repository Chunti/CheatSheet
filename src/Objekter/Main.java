package Objekter;

public class Main {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber(6);

        System.out.println(randomNumber.getDice());
        System.out.println(randomNumber.rollDice());
        randomNumber.setDice(25);
        System.out.println(randomNumber.rollDice());
    }
}
