package serg;

import java.util.*;

public class MathUtils {

    /**
     * @param args
    */

    enum option {POSITIV, NEGATIV, ZERO};
    public static void task1(int x) {
        //Task 1.1
          ArrayList<Integer> alist = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
          String s = null;
          int summ = 0;
          do {
              System.out.print("Do you want to enter the number (y/n)?");
              s = in.next();
              if (s.matches("y|n")) {
                  if (s.equals("y")) {
                      System.out.print("Enter number");
                      alist.add(in.nextInt());
                  }
              } else {
                  System.out.println("Incorrect character");
              }            
          } while (!s.equals("n"));
          for (int i : alist) {
              System.out.println(i);
              if (i % x == 0) {
                  summ += i;
              }
          }
          System.out.println("Sum of elements = " + summ);
          in.close();
      }
      public static void task1() {
          //Task 1.1
          ArrayList<Integer> alist = new ArrayList<Integer>();        
          Scanner in = new Scanner(System.in);
          String s = null;
          int summ = 0;
          do {
              System.out.print("Do you want to enter the number (y/n)?");
              s = in.next();
              if (s.matches("y|n")) {
                  if (s.equals("y")) {
                      System.out.print("Enter number");
                      alist.add(in.nextInt());
                  }
              } else {
                  System.out.println("Incorrect character");
              }            
          } while (!s.equals("n"));
          for (int i : alist) {
              System.out.println(i);
              int x = 5;
              if (i % x == 0) {
                  summ += i;
              }
          }
          System.out.println("Sum of elements = " + summ);
          in.close();
      }
      public static void task2() {
          int digt = 5;
          System.out.println(digt > 0 ? option.POSITIV : (digt < 0 ? option.NEGATIV : option.ZERO));
      }
      public static void task3(int x) {
          switch (x) {
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



