import java.util.Random;
import java.util.random.*;
import javax.swing.JOptionPane;
public class RandomNumberGuessing{
    public static void main(String[] args) {
        int score = 0;
        int rounds = 0;
        while (true) {
            Random random= new Random();
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            rounds++;
            for (int i = 1; i <= 5; i++) {
                int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100:"));
                attempts++;
                if (guess == number) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += attempts;
                    break;
                } else if (guess < number) {
                    JOptionPane.showMessageDialog(null, "Your guess is too low. Try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your guess is too high. Try again.");
                }
            }
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
            if (choice != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Thanks for playing! Your score is " + score + " in " + rounds + " rounds.");
                break;
            }
        }

    }
}
