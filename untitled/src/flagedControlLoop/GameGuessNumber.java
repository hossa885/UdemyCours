package flagedControlLoop;

import java.util.Scanner;

public class GameGuessNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int guess;
        int rand;
        rand = (int) (Math.random() * 100);
        boolean stillPlaying = true;
        System.out.println("the generated number from system is: " + rand);
        while (stillPlaying) {
            System.out.println("please guess a number between 0 and 100");
            guess = reader.nextInt();
            if (guess > rand)
                System.out.println("guess is too laaaaaaaaaarg");
            else if (guess < rand)
                System.out.println("guess is too smaaaaaaall");
            else {
                System.out.println("you win!!");
                stillPlaying = false;
            }
        }
    }
}
