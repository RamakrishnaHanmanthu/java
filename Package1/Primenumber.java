package Package1;
import java.util.Scanner;
public class Primenumber {
public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
               public static boolean isPrime(int number) {
              if (number <= 1) 
        return false;      {                                         
            if (number == 2) {
        return true;                                                 
    }
             if (number % 2 == 0) {
        return false;                                                 
    }
    // Check for factors from 3 up to the square root of the number
          for (int i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i == 0) {
            return false;                                                    
        }
    }
    return true;                                                             
}
}
}