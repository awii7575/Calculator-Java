import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            // Menu
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                // Take inputs
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                
                double result = 0;
                switch(choice) {
                    case 1: result = num1 + num2; break;
                    case 2: result = num1 - num2; break;
                    case 3: result = num1 * num2; break;
                    case 4: 
                        if(num2 != 0) {
                            result = num1 / num2; 
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                            continue; // skip result print
                        }
                        break;
                }
                System.out.println("Result = " + result);
            } 
            else if (choice != 5) {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);
        
        System.out.println("Exiting Calculator... Goodbye!");
        sc.close();
    }
}
