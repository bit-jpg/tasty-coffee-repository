/*
 * FarenheightToCelsuis.java
 * Jayden Guina-ao
 * Part of converters
 */
package converters;

import java.util.*;

public class FarenheightToCelsius {

	public static void main(String[] args) {
		// Prepare
		Double farenheight, result;
		
		// Input
		System.out.print("Farenheight: ");
		Scanner data = new Scanner(System.in);
		farenheight = data.nextDouble();
		data.close();
		
		// Output
		result = (farenheight - 32) / 1.8;
		System.out.println("Celsius: " +result);
	}

}
