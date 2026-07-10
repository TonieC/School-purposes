import java.util.Scanner;

public class isStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age;
        boolean isStudent;

        System.out.print("Age: ");
        age = scan.nextInt();

        System.out.print("Student (true/false): ");
        isStudent = scan.nextBoolean();

        if (age >= 18) {
            if (isStudent) {
                System.out.println("You are a legal student.");
            } else {
                System.out.println("You are a legal non-student.");
            }
        } else {
            if (isStudent) {
                System.out.println("You are a minor student.");
            } else {
                System.out.println("You are a minor non-student.");
            }
        }

        scan.close();
    }
}
