import java.util.Random;
import java.util.Scanner;

public class treasuregame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=========================================");
        System.out.println("        WELCOME TO TREASURE HUNTER       ");
        System.out.println("=========================================");

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int playerAge = scanner.nextInt();

        System.out.print("Enter your weapon power (1-100): ");
        int weaponPower = scanner.nextInt();

        System.out.print("Enter your defense level (1-100): ");
        int defenseLevel = scanner.nextInt();

        System.out.print("Guess the treasure code (1-10): ");
        int playerGuess = scanner.nextInt();

        int treasureCode = random.nextInt(10) + 1;

        int attackDamage = (weaponPower * 2) - (defenseLevel / 2);

        int baseEnergy = 100;
        int remainingEnergy = baseEnergy - (playerAge / 2) - (defenseLevel % 10);

        boolean correctGuess = (playerGuess == treasureCode);
        boolean strongEnoughAttack = (attackDamage >= 50);
        boolean hasEnoughEnergy = (remainingEnergy > 0);
        boolean isAdult = (playerAge >= 18);

        boolean gameWon = correctGuess && strongEnoughAttack && hasEnoughEnergy;

        System.out.println();
        System.out.println("=========================================");
        System.out.println("               PLAYER PROFILE            ");
        System.out.println("=========================================");
        System.out.println("Name            : " + playerName);
        System.out.println("Age             : " + playerAge);
        System.out.println("Weapon Power    : " + weaponPower);
        System.out.println("Defense Level   : " + defenseLevel);
        System.out.println("Treasure Guess  : " + playerGuess);

        System.out.println();
        System.out.println("=========================================");
        System.out.println("               GAME RESULTS               ");
        System.out.println("=========================================");
        System.out.println("Actual Treasure Code : " + treasureCode);
        System.out.println("Attack Damage         : " + attackDamage);
        System.out.println("Remaining Energy      : " + remainingEnergy);

        System.out.println();
        System.out.println("---------- Boolean Checks ----------");
        System.out.println("Correct Guess?        : " + correctGuess);
        System.out.println("Strong Enough Attack? : " + strongEnoughAttack);
        System.out.println("Has Enough Energy?    : " + hasEnoughEnergy);
        System.out.println("Is Adult?             : " + isAdult);

        System.out.println();
        System.out.println("=========================================");
        if (gameWon) {
            System.out.println(playerName + ", YOU FOUND THE TREASURE! YOU WIN!");
        } else {
            System.out.println(playerName + ", the treasure remains hidden. YOU LOSE!");
        }
        System.out.println("Game Won: " + gameWon);
        System.out.println("=========================================");

        scanner.close();
    }
}
