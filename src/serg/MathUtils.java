package serg;

import java.util.*;

public class MathUtils {

    /**
     * @param args
    */

    enum option {POSITIV, NEGATIV, ZERO};
    public static void task1(int x, ArrayList<Integer> alist) {
        int summ = 0;
        //Task 1.1
        for (int i : alist) {
            System.out.println(i);
            if (i % x == 0) {
                summ += i;
            }
        }
        System.out.println("Sum of elements = " + summ);        
    }
    public static void task1(ArrayList<Integer> alist) {
        int summ = 0;
        //Task 1.4
        for (int i : alist) {
            System.out.println(i);
            if (i % 2 == 0) {
                summ += i;
            }
        }
        System.out.println("Sum of elements = " + summ);        
    }
    public static void task2(int digt) {
        //Task 1.2
        System.out.println(digt > 0 ? option.POSITIV : (digt < 0 ? option.NEGATIV : option.ZERO));
    }
    public static void task3(int y) {
        //Task 1.3
        switch (y) {
        case -1: System.out.println(option.NEGATIV);
        case 1: System.out.println(option.POSITIV);
        case 0: System.out.println(option.ZERO);
            break;
        default:
            System.out.println("ERROR");
            break;
        }
      }

}



