import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String name;
        int num1;
        int num2;
        double answer;
        double answer1;
        double answer2;
        double answer3;

        System.out.println("Enter your name: ");
        name = scan.nextLine();

        num1 = rand.nextInt(10) + 1;
        num2 = rand.nextInt(10) + 1;

        System.out.println("Solve: " + num1 + "+" + num2);
        answer = scan.nextDouble();
        boolean addSolved = answer == (num1 + num2);

        System.out.println("Solve: " + num1 + "*" + num2);
        answer1 = scan.nextDouble();
        boolean multSolved = answer1 == (num1 * num2);

        System.out.println("Solve: " + num1 + "/" + num2);
        answer2 = scan.nextDouble();
        boolean divSolved = answer2 == ((double) num1 / num2);

        System.out.println("Solve: " + num1 + "-" + num2);
        answer3 = scan.nextDouble();
        boolean subSolved = answer3 == (num1 - num2);

        boolean perfectScore = addSolved && multSolved && divSolved && subSolved;

        System.out.println("==========================");
        System.out.println("Good job! " + name);
        System.out.println("1) " + answer + " Correct Answer: " + (num1 + num2) + " Check: " + addSolved);
        System.out.println("2) " + answer1 + " Correct Answer: " + (num1 * num2) + " Check: " + multSolved);
        System.out.println("3) " + answer2 + " Correct Answer: " + (num1 / num2) + " Check: " + divSolved);
        System.out.println("4) " + answer3 + " Correct Answer: " + (num1 - num2) + " Check: " + subSolved);
        System.out.println("==========================");
        System.out.println("Did you got a perfect score? " + perfectScore);
    }
}
