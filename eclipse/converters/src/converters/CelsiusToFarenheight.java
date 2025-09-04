package converters;

import java.util.*;

public class CelsiusToFarenheight {

	public static void main(String[] args) {
		// Prepare
		Double celsius, result;
		
		// Input
		System.out.print("Celsius: ");
		Scanner data = new Scanner(System.in);
		celsius = data.nextDouble();
		data.close();
		
		// Output
		result = (celsius * 1.8) + 32;
		System.out.println("Farenheight: " +result);
	}

}
