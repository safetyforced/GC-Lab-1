/**
 * 
 */
package lab1;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * @author Alex Marks
 *
 */
public class GrandCircusAreas {

	public static void main(String[] args) {

		String userConsent = "Y";
		Scanner input = new Scanner(System.in);

		while (userConsent.equalsIgnoreCase("Y")) {

			System.out.print("Enter Length: ");
			float userLength = input.nextFloat();

			System.out.print("Enter Width: ");
			float userWidth = input.nextFloat();

			System.out.print("Enter Height: ");
			float userHeight = input.nextFloat();

			float area = userWidth * userLength;
			float perimeter = (userWidth + userLength) * 2;
			float volume = userWidth * userLength * userHeight;

			NumberFormat formatValue = NumberFormat.getNumberInstance();
			formatValue.setMaximumFractionDigits(2);

			String formatArea = formatValue.format(area);
			String formatPerimeter = formatValue.format(perimeter);
			String formatVolume = formatValue.format(volume);

			System.out.println("Area: " + formatArea);
			System.out.println("Perimeter: " + formatPerimeter);
			System.out.println("Volume: " + formatVolume);

			System.out.print("Continue? (Y/n): ");
			userConsent = input.next();

		}

		input.close();

	}

}