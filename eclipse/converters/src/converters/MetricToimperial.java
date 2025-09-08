/*
 * MetricToimperial.java
 * Jayden Guina-ao
 * Part of converters
 */
package converters;

import java.util.Scanner;

public class MetricToimperial {
    public static void main(String[] args){
    double cm, inch, feet;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Centimeter: ");
    cm = input.nextDouble();
    input.close();

    feet = cm / 2.54;
    inch = cm / 30.48;
    
    System.out.format("%10s %8s", "Feet: " +feet, "\n");
    System.out.format("%10s %8s", "Inch: " +inch, "\n");
    }
}
