package Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] array1 = new String[5];
        String[] array2 = new String[]{"Davs", "Hello"};

        array1[0] = "Hejsa,";
        array1[1] = "mit";
        array1[2] = "navn";
        array1[3] = "er";
        array1[4] = "Peter";

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
