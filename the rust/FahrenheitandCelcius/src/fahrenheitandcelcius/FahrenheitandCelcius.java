package fahrenheitandcelcius;

import java.util.Scanner;

public class FahrenheitandCelcius {

    public static void main(String[] args) {
        // prepare
        double fahrenheit, celsius;

        // input
        Scanner data = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = data.nextDouble();
        data.close();

        // convert
        celsius = (fahrenheit - 32) / 1.8;

        // output (rounded to 2 decimal places)
        System.out.printf("Celsius: %.2f%n", celsius);
    }
}