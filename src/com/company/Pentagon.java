package com.company;

public class Pentagon {
    public static void isAreaPentagon(double n, double s) {
        double a; // is the apothem length

        a = (s / 2) / (Math.tan(Math.toRadians(360 / (n * 2)))); // formula a = (s/2) / tan(360` / (n * 2))
        double area_pentagon = (double) (n * s/2.0) * a;

        System.out.println("Area of the pentagon=" + area_pentagon);
    }
}
