import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    double num1;
    double num2;
    char op;

    System.out.print("First Number: ");
    num1 = scan.nextInt();
    System.out.print("Operation: ");
    op = scan.next().charAt(0);
    System.out.print("Second Number: ");
    num2 = scan.nextInt();

    switch(op){
      case '+':
       System.out.println(num1 + num2);
       break;
      case '-':
       System.out.println(num1 - num2);
       break;
      case '*':
       System.out.println(num1 * num2);
       break;
      case '/':
       System.out.println(num1 / num2);
       break;
      default:
       System.out.println("Invalid Operation.");
    }
    
  }
}
