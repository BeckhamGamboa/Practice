import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double numerator = input.nextDouble();
        
        System.out.print("Enter a second number : ");
        double denominator = input.nextDouble();

        System.out.print("Enter a operation: ");
        char operator = input.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
            result = numerator + denominator;
            break;
            case '-':
            result = numerator - denominator;
            break;
            case '*':
            result = numerator * denominator;
            break;
            case '%':
            result = numerator % denominator;
            break;
            case '/':
            try {
                if (denominator == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
            break;
            default:
            System.out.println("Invalid Operator!");
            break;

        }
        System.out.println(result);

        input.close();
        
    }
}