import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        
        System.out.print("Enter any number: ");
        number = scan.nextInt();
        
        if(number % 2 == 0){
        System.out.println("This number is even.");
        }
        else { System.out.println("This number is odd.");
        }
        }
}	
