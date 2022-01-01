package Arrays;

public class IntegerArray {
    public static void main(String[] args) {

        Integer[] array1 = new Integer[5];
        Integer[] array2 = new Integer[]{5, 5, 61, 13, 1};

        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}