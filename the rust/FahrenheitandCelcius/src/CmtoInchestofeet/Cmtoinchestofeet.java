package CmtoInchestofeet;

import java.util.Scanner;

public class Cmtoinchestofeet {

    public static void main(String[] args) {
        // prepare
        double centimeter, feet, inches;

        // input
        Scanner inData = new Scanner(System.in);
        System.out.print("centimeter: ");
        centimeter = inData.nextDouble();
        inData.close();

        // convert
        inches = centimeter / 2.54;
        feet = centimeter / 30.48;

        // output
        System.out.print("Inches: " + inches);
        System.out.print("\nFeet: " + feet);
    }
}