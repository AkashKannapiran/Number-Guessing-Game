import java.util.Scanner;
import java.util.Random;

public class NGG {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int play = 1;

        while (play == 1){

            int randNum = rand.nextInt(100)+1;
            int guess = -1;
            int tryCount = 0;

            while (guess!=randNum){

                System.out.print("Guess a number between 1 to 100: ");
                guess = scan.nextInt();
                tryCount++;

                if (guess == randNum){
                    System.out.print("You're Correct! ");
                    System.out.println("It took you "+tryCount+" tries");
                    System.out.println("Would you like to play again?");
                    System.out.println("If YES, please press \"1\". If NO, please press \"2\".");
                    play = scan.nextInt();
                } else if (randNum>guess) {
                    System.out.println("Nope! The number is higher. Guess again.");
                } else {
                    System.out.println("Nope! The number is lower. Guess again.");
                }
            }
        }
        scan.close();
    }
}
