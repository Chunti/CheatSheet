package Metoder;

public class Metode {
    public static void main(String[] args) {

        int number = calculation( 5, 6);
        output(number);
    }

    private static int calculation(int a, int b){ //int er den assignede returværdig. Det betyder at den skal retunere en integer.
        int number = a*b;

        return number;
    }

    private static void output(int number){  //Void betyder at den ikke retunere noget.
        System.out.println(number);
    }


}
