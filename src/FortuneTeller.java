import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstName = input.next();
		
		System.out.println("Please enter your last name:");
		String lastName = input.next();
		
		input.close();

	}

}
