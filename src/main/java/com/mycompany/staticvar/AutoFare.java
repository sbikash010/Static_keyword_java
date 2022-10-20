package com.mycompany.staticvar;

/**
 *
What is the output of the following program?
public class AutoFare {

    private static final double MINIMUM_CHARGE = 16.0;
    protected static final double PRICE_PER_KM = 9.25;
    public static final double WAITING_CHARGE_PER_MIN = 0.50;

    public static void main(String[] args) {
        System.out.print(calculate(0.5, 12) + "@");
        System.out.print(calculate(12, 0) + "@");
        System.out.print(calculate(1, 200) + "@");
        System.out.print(calculate(8.25, 3) + "@");
    }

    private static int calculate(double kms, int minutes) {
        return Math.rint(Math.min(kms * PRICE_PER_KM + WAITING_CHARGE_PER_MIN, MINIMUM_CHARGE));
    }
} 
 */ 
public class AutoFare {
   private static final double MINIMUM_CHARGE = 16.0;
    protected static final double PRICE_PER_KM = 9.25;
    public static final double WAITING_CHARGE_PER_MIN = 0.50;

    public static void main(String[] args) {
        System.out.print(calculate(0.5, 12) + "@");
        System.out.print(calculate(12, 0) + "@");
        System.out.print(calculate(1, 200) + "@");
        System.out.print(calculate(8.25, 3) + "@");
    }

    private static int calculate(double kms, int minutes) {
        return Math.rint(Math.min(kms * PRICE_PER_KM + WAITING_CHARGE_PER_MIN, MINIMUM_CHARGE));
    } 
}
