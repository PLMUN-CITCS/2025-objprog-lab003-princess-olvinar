import java.util.Scanner; // Import Scanner class

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt and read the integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt and read the decimal number
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume the newline character left behind by nextDouble()
        input.nextLine(); 

        // Prompt and read the string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output the values with formatting
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);

        // Close the scanner
        input.close();
    }
}
