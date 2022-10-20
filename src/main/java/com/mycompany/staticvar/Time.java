package com.mycompany.staticvar;

/**
 *What will be the output of the following program
public class Time {
    int a = 50;
    int b = 10;
    public static void main(String args[]) {
        a += b--;
        System.out.println(a);
    }
}

 */
public class Time {
      static int a = 50;
      static int b = 10;
    public static void main(String[] args) {
        a =a+b--;
        System.out.println(a);
    }
}
