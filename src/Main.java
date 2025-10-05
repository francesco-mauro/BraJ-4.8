import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in)

        ArrayList<String> list = new ArrayList<>();

        list.add("Orange");
        list.add("Apple");
        list.add("Banana");

        list.set(1, "Pineapple");

        System.out.println(list.get(0));
        System.out.println(list.size());

        Collections.sort(list);

        System.out.println(list);

        for (String fruit : list){
            System.out.println(fruit);
        }

    }
}
