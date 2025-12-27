package org.unfaithful;// Import the ArrayList class and the Iterator class

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveDemo {
    // Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove(); // it.remove() hepsini değil, iterator’ın en son döndürdüğü (son it.next() ile aldığın) elemanı siler.
            }
        }
        System.out.println(numbers);
    }

}
