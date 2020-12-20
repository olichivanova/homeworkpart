package by.belhard26.homework.homework7.task1;

import java.util.HashSet;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(5);
        h.add(89);
        h.add(47);
        h.add(41);
        h.add(22);
        h.add(7);
        h.add(54);
        h.add(14);
        h.add(63);
        h.add(32);

        int boarder = 35;
        HashSet<Integer> k = new HashSet<>();
        for (int j: h)

            System.out.print(j + " ");
        System.out.println();

        for (int j: h) {
            if (j < boarder)
                 k.add(j); }

        System.out.println( );

        for (int j: k)
            System.out.print(j + " ");

        System.out.println( );

        h.removeAll(k);

            for (int j: h)
                System.out.print(j + " ");

      

      /*  while (i.hasNext()) {
           
            System.out.print(i.next() + " "); } */
    }
}
