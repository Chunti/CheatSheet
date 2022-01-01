package ArrayList;

import java.util.ArrayList;

public class IntegerArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(42);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
