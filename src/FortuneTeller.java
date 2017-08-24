import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name:");
		String firstName = input.next();

		System.out.println("Please enter your last name:");
		String lastName = input.next();

		System.out.println("Please enter your age:");
		int age = input.nextInt();

		System.out.println("Please enter your birth month as a number:");
		int birthMonth = input.nextInt();

		System.out.println(
				"Please enter your favorite ROYGBIV color:  \n\tIf you do not know what the ROYGBIV colors are, please enter the word \"Help\"");
		String colorOfTheRainbow = input.next();

		System.out.println("Please enter the number of siblings you have:");
		int numberOfSiblings = input.nextInt();

		input.close();

		int yearsToRetirement;

		if (age % 2 == 0) {
			yearsToRetirement = 40;
		} else {
			yearsToRetirement = 25;
		}

		double bankBalanceAtRetirement;

		if (birthMonth >= 1 && birthMonth <= 4) {
			bankBalanceAtRetirement = 163577.42;
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			bankBalanceAtRetirement = 6200.16;
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalanceAtRetirement = 974865.28;
		} else {
			bankBalanceAtRetirement = 0.00;
		}

		String vacationHomeLocation;

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
			vacationHomeLocation = "Rikers Island, NY - where you will be staying after your obvious fratricide.";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with "
				+ vacationHomeLocation);

	}

}
