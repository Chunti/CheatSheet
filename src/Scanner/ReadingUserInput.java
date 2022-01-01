package Scanner;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scanner.nextLine();
        System.out.println("Write your age");
        int age = scanner.nextInt();

        System.out.println("Your name is: " + name + " and you are " + age + " years old");
    }
}
