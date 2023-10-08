/*
 * Lab6_Task1_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 10/5/2023
 */
import java.util.Scanner;
public class Lab6_Task1_Francine_Vo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.next();
		input.close();
		
		if (isValid(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Invalid password");
		}
	}

	public static boolean isValid(String password) {
		
		for(int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				System.out.println("No special characters");
				return false;
			}
			
			if(password.length() < 8) {
				System.out.println("password must contain at least 8 characters");
			}
			int digitCount = 0;
			for(int i2 = 0; i2 < password.length(); i2++) {
				
				if(Character.isDigit(password.charAt(i2))) {
					digitCount++;
			}
				if (digitCount < 2) {
					System.out.println("Must have at least 2 digits");
					return false;
				}
			}
		}
		return true;
	}
}
