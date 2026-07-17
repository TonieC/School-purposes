import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        String choice;

        do {
            System.out.print("Continue program? (y/n): ");
            choice = scan.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Happy Birthday!");
            } else if (choice.equalsIgnoreCase("n")) {

                System.out.print("Enter your name: ");
                String name = scan.nextLine();

                System.out.print("Reason for leaving: ");
                String reason = scan.nextLine();

                System.out.println("Exiting in:");
                for (int i = 5; i >= 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }

                System.out.println("\nUser Info:");
                System.out.println("Name: " + name);
                System.out.println("Reason: " + reason);

            } else {
                System.out.println("Invalid input. Try again.");
            }

        } while (!choice.equalsIgnoreCase("n"));

    }
}
