import java.util.Scanner;

public class ai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CS325 AI Bot Guessing Game …");
        System.out.print("Enter the largest number: ");
        int MAX = sc.nextInt();

        int low = 1;
        int high = MAX;
        boolean found = false;
        int guessCount = 0;

        System.out.println("Pick a number between 1 and " + MAX + " but don’t tell me");

        int maxGuesses = (int) Math.ceil(Math.log(MAX) / Math.log(2));
        System.out.println("I can guess your number in " + maxGuesses + " guesses");

        while (!found && low <= high) {
            int guess = (low + high) / 2;
            guessCount++;

            System.out.print("Guess #" + guessCount + ": Is your number " + guess + "? (y/n): ");
            String answer = sc.next().toLowerCase();

            if (answer.equals("y")) {
                found = true;
                System.out.println("I guessed your number in " + guessCount + " guesses!");
            } else {
                System.out.print("Is your number higher or lower than " + guess + "? (h/l): ");
                String hint = sc.next().toLowerCase();

                if (hint.equals("h")) {
                    low = guess + 1;
                } else if (hint.equals("l")) {
                    high = guess - 1;
                } else {
                    System.out.println("Invalid input. Game over!");
                    break;
                }
            }
        }

        if (!found)
            System.out.println("Your answers were inconsistent. Game over!");

        sc.close();
    }
}
