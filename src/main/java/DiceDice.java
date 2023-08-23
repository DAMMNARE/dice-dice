import java.util.Random;
import java.util.Scanner;

public class DiceDice {

    public void DiceGame() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Dice Game!");

        while(true) {
            System.out.print("\nEnter 'roll' to roll the dice or 'quit' to exit: ");
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("quit")) {
                System.out.println("Thanks for playing!");
                input.close();
                return;
            }

            if (!choice.equals("roll")) {
                System.out.println("Invalid choice! Try again.");
            } else {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int total = die1 + die2;
                System.out.println("You rolled a " + die1 + " and a " + die2 + ".");
                System.out.println("Your total is " + total + ".");
                if (total == 7) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }
    }
}
