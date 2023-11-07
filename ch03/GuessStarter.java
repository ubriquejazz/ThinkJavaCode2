import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int desired = random.nextInt(100) + 1;
        for (int i=0; i<3; i++){
            System.out.print("Type your guess (" + i + ")"+ ": ");
            int guessed = in.nextInt();
            System.out.println("Your guess is: " + guessed);
            System.out.println("I was thinking of: " + desired);
            if (desired > guessed)
                System.out.println("You were off by:" + (desired - guessed));
            else 
                System.out.println("You were off by:" + (guessed - desired));
        }
    }

}
