package collectioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Roman");
        names.add("Peterson");
        names.add("Tomm");
        names.add("Spiderman");

        ListIterator<String> listIterator = names.listIterator();

        // traverse to forward
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next()+ " ");
        }

        System.out.println();

        // traverse to backward
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+ " ");
        }


    }
}
