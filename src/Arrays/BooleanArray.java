package Arrays;

public class BooleanArray {
    public static void main(String[] args) {

    Boolean[] array1 = new Boolean[3];
    Boolean[] array2 = new Boolean[]{true, false};

    array1[0] = false;
    array1[1] = true;
    array1[2] = true;


    for (int i = 0; i < array1.length; i++) {
        if(array1[i]) System.out.println("array1 plads " + i + " er true.");
        else System.out.println("array1 plads " + i + " er false.");
    }

    for (int i = 0; i < array2.length; i++) {
        if(array2[i]) System.out.println("array2 plads " + i + " er true.");
        else System.out.println("array2 plads " + i + " er false.");
    }

}
}
