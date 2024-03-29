import java.util.Scanner;

/**
 * This program converts an amount in Australian Dollars (AUD) to South African Rand (ZAR)
 * using a fixed exchange rate. The user is prompted to enter the amount in AUD,
 * and the equivalent amount in ZAR is calculated and displayed.
 *
 * @author Satish Pansara <104310978>
 * @version java version "21"; Program version 1.0
 * @date Created on 06/03/2024
 */
public class AUD_To_ZAR {

    /**
     * Exchange rate for converting AUD to ZAR.
     */
    private static final double EXCHANGE_RATE = 9.91;

    private Scanner scanner; // Scanner object for user input

    /**
     * Constructor for AUD_To_ZAR class.
     * Initializes the scanner for user input.
     */
    public AUD_To_ZAR() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main method that creates an AUD_To_ZAR object and calls the calculateExchange method.
     */
    public static void main(String[] args) {
        AUD_To_ZAR exchangeAmount = new AUD_To_ZAR();
        exchangeAmount.calculateExchange();
    }

   /**
     * Prompts the user to enter an amount in Australian Dollars (AUD),
     * validates the input as a positive number,
     * calculates the equivalent amount in South African Rand (ZAR) using a fixed exchange rate,
     * and displays the result in the format "AUD<amount> is worth ZAR<converted amount>".
     */
    public void calculateExchange() {
        boolean validInput = false;
        double audAmount = 0.0;

        while (!validInput) {
            try {
                System.out.print("Enter the amount of money in AUD: ");
                audAmount = scanner.nextDouble(); // User input for AUD amount
                if (audAmount < 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        double zarAmount = audAmount * EXCHANGE_RATE; // Calculate ZAR amount

        // Display the result with two decimal places for AUD and four decimal places for ZAR
        System.out.printf("AUD%.2f is worth ZAR%.4f\n", audAmount, zarAmount);
    }
}
