package serg;

import java.util.ArrayList;
import java.util.Scanner;
import serg.MathUtils;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String s = null;
        int x = 3;
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
        MathUtils.task1(x, alist);
        MathUtils.task1(alist);
        int digt = 5;
        MathUtils.task2(digt);
        int y = 5;
        MathUtils.task3(y);
        in.close();
    }

}
