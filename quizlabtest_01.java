import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // File paths
        String input = "D:/JAVA/game1.txt";
        String output = "D:/JAVA/game2.txt";

        try {
            // Read the input file
            Scanner scanner = new Scanner(new File(input));
            PrintWriter writer = new PrintWriter(output);

            System.out.println("Results:");
            writer.println("Results:");

            // Process each line in the file
            while (scanner.hasNextLine()) {
                String expression = scanner.nextLine().trim(); // Read the expression

                try {
                    // Find the operator position (assuming there's only one operator in the expression)
                    char operator = ' ';
                    int operatorIndex = -1;

                    // Check where the operator is located (+, -, *, /)
                    for (int i = 0; i < expression.length(); i++) {
                        char ch = expression.charAt(i);
                        if (ch == '+'  ch == '-'  ch == '*' || ch == '/') {
                            operator = ch;
                            operatorIndex = i;
                            break;
                        }
                    }

                    if (operatorIndex == -1) {
                        throw new IllegalArgumentException("No operator found");
                    }

                    // Extract the operands and operator
                    int num1 = Integer.parseInt(expression.substring(0, operatorIndex));
                    int num2 = Integer.parseInt(expression.substring(operatorIndex + 1));
                    
                    // Perform the operation based on the operator
                    int result = 0;
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                throw new ArithmeticException("Division by zero");
                            }
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator: " + operator);
                    }

                    // Output the result
                    System.out.println(expression + " = " + result);
                    writer.println(expression + " = " + result);

                } catch (Exception e) {
                    // Handle invalid expressions
                    System.out.println("Invalid expression: " + expression);
                    writer.println("Invalid expression: " + expression);
                }
            }

            
            scanner.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
