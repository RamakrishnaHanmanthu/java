package Package1;
import java.util.Scanner;

public class ArmStrongnumber {
	

	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = 0;

	        // Find the number of digits in the number
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }

	        originalNumber = number;

	        // Compute the sum of digits each raised to the power of the number of digits
	        while (originalNumber != 0) {
	            int remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }

	        // Return true if the result equals the original number
	        return result == number;
	    }

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }
	}

	
	
