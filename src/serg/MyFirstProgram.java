package serg;
import serg.MyFirstPackage.*;
import java.lang.Math;

class MyFirstClass {

    public static void main(String[] args) {
    	MySecondClass MyCl = new MySecondClass(1, 1);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                MyCl.setFieldX(2);
                MyCl.setFieldY(3);
                System.out.print(MyCl.getMin());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}

