package Logik;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Press 1 for english, 2 for spanish, 3 for danish.");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch(number){
            case 1:
                System.out.println("Hello, my name is Peter.");
                break;
            case 2:
                System.out.println("Hola mi nombre es Peter.");
                break;
            case 3:
                System.out.println("Hej, mit navn er Peter.");
                break;
            default:
                System.out.println("You didn't choose a number between 1 and 3.");
                break;
        }
    }
}
