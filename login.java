import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "";
        String password = "";
        while (!username.equals("admin") || !password.equals("1234")) {
            System.out.print("Enter username: ");
            username = scan.nextLine();
            System.out.print("Enter password: ");
            password = scan.nextLine();
            if (!username.equals("admin") || !password.equals("1234")) {
                System.out.println("Invalid username or password. Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        }
    }
}
