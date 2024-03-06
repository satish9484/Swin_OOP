import java.util.Scanner;

/**
 * This program welcomes a user from a specified university.
 * It takes two command-line arguments: the user's name and current university.
 * If the university is not "Swinburne", it prompts the user to enter the correct input.
 * 
 * @author Satish Pansara <104310978>
 * @version java version "21"; Program version 1.0
 * @date Created on 28/02/2024
 */
public class HelloWorld2 {

    /**
     * Main method to execute the program.
     * 
     * @param args Command-line arguments: <name> <university>
     */
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("Usage: java HelloWorld2 <name> <university>");
            return;
        }

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Loop until the correct university is entered
        while (true) {
            // If university is not Swinburne, prompt user to enter again
            if (!args[1].equals("Swinburne")) {
                System.out.println("Please enter the correct university (Swinburne):");
            }
            // If university is Swinburne, break out of the loop
            else {
                break;
            }
            // Read the user's input
            args[1] = scanner.nextLine();
        }

        // Print the welcome message
        System.out.println("Welcome " + args[0] + " from " + args[1] + ".");
    }
}
