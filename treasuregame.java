import java.util.Scanner;
import java.util.Random;

public class tresuregame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String name;
        int age;
        double wPower;
        double defense;
        int tCode;
        int tCodeGuess;
        int energy = 100;

        tCode = rand.nextInt(10) + 1;

        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        System.out.println("Enter your Weapon Power (1-100): ");
        wPower = scan.nextDouble();
        System.out.println("Enter your Defense (1-50): ");
        defense = scan.nextDouble();
        System.out.println("Enter your guess: ");
        tCodeGuess = scan.nextInt();

        int remEn = energy - 20;
        boolean isCorrect = tCodeGuess == tCode;
        int prem = (int) ((wPower * 2) - (defense * 2.0));
        int score = (int) (wPower + defense);
        boolean win = score == 100;

        System.out.println("=============================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Attack damage: " + prem);
        System.out.println("Remaining Energy: " + remEn);
        System.out.println("Guess Correctly: " + isCorrect);
        System.out.println("Correct Treasure Code: " + tCode);
        System.out.println("Score: " + score);
        System.out.println("=============================");

        System.out.println("Did you win: " + win);
        System.out.println("Did you correctly guess: " + isCorrect);
    }
}
