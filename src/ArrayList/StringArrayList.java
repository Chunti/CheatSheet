package ArrayList;

import java.util.ArrayList;

public class StringArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Good day");
        list.add("Hejsa");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
