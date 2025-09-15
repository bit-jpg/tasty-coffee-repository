package fahrenheitandcelcius;

import java.util.Scanner;

public class FahrenheitandCelcius {

    public static void main(String[] args) {
        // prepare
        double fahrenheit, result;

        // input
        Scanner data = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        fahrenheit = data.nextDouble();
        data.close();

        // convert
        result = (fahrenheit - 32) / 1.8;

        // output
        System.out.println("Celsius: " + result);
    }
}





