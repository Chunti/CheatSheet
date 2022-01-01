package ArrayList;

import java.util.ArrayList;

public class BooleanArrayList {

    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(false);

        for(int i = 0; i < list.size(); i++) {
            if(!list.get(i)){
                System.out.println("The boolean on the " + i + " spot is false");
            }
            else System.out.println("The boolean on the " + i + " spot is true");
        }
    }
}
