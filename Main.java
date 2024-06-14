import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numQuests = 0;
        boolean validInput = false;

        do {
            System.out.print("Please enter a number from 1 to 10,000: ");
            try {
                numQuests = input.nextInt();
                if (numQuests < 0 || numQuests > 10000) {
                    System.out.println("The entered number is incorrect. Please try again.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
            }
        } while (!validInput);

        QuestRewardGenerator.generateRewardSequence(numQuests);

        input.close();
    }
}
