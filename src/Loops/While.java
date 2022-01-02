package Loops;

public class While {

    public static void main(String[] args) {
        int number = 0;

        while (number < 10) {
            System.out.println(number);
            number++;
        }

        number = 0;


        do{
            System.out.println(number);
            number++;
        }while (number<10);
    }
}
