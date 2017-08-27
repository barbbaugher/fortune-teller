import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Where the user is asked to input their first name
		System.out.println("Please enter your first name:");
		String firstName = input.next();

		// Where the user is asked to input their last name
		System.out.println("Please enter your last name:");
		String lastName = input.next();

		// Where the user is asked to enter their age
		System.out.println("Please enter your age:");
		int age = input.nextInt();

		// Where we declare the variable yearsToRetirement
		int yearsToRetirement;

		// If the age is even it will return 40 years to retirement and if the age is odd it will return 25 years to retirement
		if (age % 2 == 0) {
			yearsToRetirement = 40;
		} else {
			yearsToRetirement = 25;
		}

		// Where the user is asked to enter their birth month as an integer
		System.out.println("Please enter your birth month as a number:");
		int birthMonth = input.nextInt();

		// Where we declare the variable bankBalanceAtRetirement
		double bankBalanceAtRetirement;

		// If the birth month is January - April the bank balance will be $163577.42
		// If the birth month is May - August the bank balance will be $6200.16
		// If the birth month is September - December the bank balance will be $974865.28
		// If the user enters any other number besides 1 - 12 the bank balance will be $0.00
		if (birthMonth >= 1 && birthMonth <= 4) {
			bankBalanceAtRetirement = 163577.42;
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			bankBalanceAtRetirement = 6200.16;
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalanceAtRetirement = 974865.28;
		} else {
			bankBalanceAtRetirement = 0.00;
		}

		// Initializing the variable modeofTransportation
		String modeOfTransportation = null;

		// The start of the do while loop that will run until a valid ROYGBIV color is entered
		do {

			System.out.println(
					"Please enter your favorite ROYGBIV color.  If you do not know what the ROYGBIV colors are, please enter the word \"Help\".");
			String colorOfTheRainbow = input.next();

			// Initializing the variable colorOfTheRainbowToLowerCase so we can ignore the
			// case of the user's input by changing everything to lower case
			String colorOfTheRainbowToLowerCase = colorOfTheRainbow.toLowerCase();

			// If the favorite color is red, the mode of transport will be a jet pack
			// If the favorite color is orange, the mode of transport will be a segway
			// If the favorite color is yellow, the mode of transport will be a hoverboard
			// If the favorite color is green, the mode of transport will be a Formula 1 race car
			// If the favorite color is blue, the mode of transport will be a DeLorean
			// If the favorite color is indigo, the mode of transport will be a yacht
			// If the favorite color is violet, the mode of transport will be a hyperloop
			if (colorOfTheRainbowToLowerCase.equals("red")) {
				modeOfTransportation = "jet pack";
			} else if (colorOfTheRainbowToLowerCase.equals("orange")) {
				modeOfTransportation = "segway";
			} else if (colorOfTheRainbowToLowerCase.equals("yellow")) {
				modeOfTransportation = "hoverboard";
			} else if (colorOfTheRainbowToLowerCase.equals("green")) {
				modeOfTransportation = "Formula 1 race car";
			} else if (colorOfTheRainbowToLowerCase.equals("blue")) {
				modeOfTransportation = "DeLorean";
			} else if (colorOfTheRainbowToLowerCase.equals("indigo")) {
				modeOfTransportation = "yacht";
			} else if (colorOfTheRainbowToLowerCase.equals("violet")) {
				modeOfTransportation = "hyperloop";
			} else if (colorOfTheRainbowToLowerCase.equals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			}
			// The loop will run until a ROYGBIV color is entered
		} while (modeOfTransportation == null);

		// Where the user is asked to enter the number of siblings they have as an
		// integer
		System.out.println("Please enter the number of siblings you have:");
		int numberOfSiblings = input.nextInt();

		// Where we declare the variable vacationHomeLocation
		String vacationHomeLocation;

		// If they have 0 sibilings - the vacation home location is Savannah, GA
		// If they have 1 sibling - the vacation home location is North Wildwood, NJ
		// If they have 2 siblings - the vacation home location is Key West, FL
		// If they have 3 siblings - the vacation home location is Figi
		// If they have more than 3 siblings - the vacation home location is Newport Beach, CA
		// If they have less than 0 siblings - the vacation home location is Rikers Island, NY
		if (numberOfSiblings == 0) {
			vacationHomeLocation = "Savannah, GA";
		} else if (numberOfSiblings == 1) {
			vacationHomeLocation = "North Wildwood, NJ";
		} else if (numberOfSiblings == 2) {
			vacationHomeLocation = "Key West, FL";
		} else if (numberOfSiblings == 3) {
			vacationHomeLocation = "Fiji";
		} else if (numberOfSiblings > 3) {
			vacationHomeLocation = "Newport Beach, CA";
		} else {
			vacationHomeLocation = "Rikers Island, NY (where you will be staying after your obvious fratricide)";
		}

		// Where the system prints out the fortune
		System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with $"
				+ bankBalanceAtRetirement + " in the bank, a vacation home in " + vacationHomeLocation
				+ ", and travel by " + modeOfTransportation + ".");

		input.close();

	}

}
