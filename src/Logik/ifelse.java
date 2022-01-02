package Logik;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        boolean isFemale = true;

        int age = scanner.nextInt();

        if(age > 65) System.out.println("You are old");
        else if (age>25 && isFemale == false) System.out.println("you are an adult");
        else if(age>18 || isFemale == true) System.out.println("You are a young adult");
        else System.out.println("you are to young to do anything awesome");
    }
}
