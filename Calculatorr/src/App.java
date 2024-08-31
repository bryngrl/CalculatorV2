import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter a choice for operation:\n[1]Addition\n[2]Subtraction\n[3]Multiplication\n[4]Division\nEnter here:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Addition(x, y);
        } else if (choice == 2) {
            Subtraction(x, y);
        } else if (choice == 3) {
            Multiplication(x, y);
        } else if (choice == 4) {
            Division(x, y);
        } else {
            System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

    }

    public static void Addition(int x, int y) {
        int sum = x + y;
        System.out.println("Answer is: " + sum);
        
    }

    public static void Subtraction(int x, int y) {
        int diff = x - y;
        System.out.println("Answer is: " + diff);
        
    }

    public static void Multiplication(int x, int y) {
        int prod = x * y;
        System.out.println("Answer is: " + prod);
        
    }

    public static void Division(int x, int y) {
        int quo = x / y;
        System.out.println("Answer is: " + quo);  
    }

}


//room for improvement are naming, closing of scanner, input validation, use of switch instead of relyign in if else too much.