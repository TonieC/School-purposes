import java.util.Scanner;
import java.util.Random;

public class guess{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int lives = 10;
        int num;
        int guess;
        
        num = rand.nextInt(10) + 1;
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("guess 1-10");
        System.out.println("Lives: " + lives);
        while (lives > 0) {
        System.out.println("====================================");
    System.out.print("Enter your guess: ");
    guess = scan.nextInt();
        if(guess == num){
            System.out.println("You have correctly guessed the number! " + num);
            System.out.println("Remaining lives " + lives);
            break;
        } else if(guess >= num){
            System.out.println("Too high!");
            --lives;
             System.out.println("Remaining lives " + lives);
        } else if(guess <= num){
            System.out.println("Too Low!");
            --lives;
             System.out.println("Remaining lives " + lives);
        } else if(guess >= 11){
            System.out.println("Invalid Guess only 1-10.");
             System.out.println("Remaining lives " + lives);
        }
        else{
            System.out.println("Something went wrong.");
             System.out.println("Remaining lives " + lives);
        }
        
        }
        
    }
}
