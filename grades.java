import java.util.Scanner;
public class grades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double grades;
        
        System.out.println("Enter your grades (1-100): ");
        grades = scan.nextDouble();
        
       
        if(grades >= 98 && grades <= 100){
        System.out.println("your grade is A");
        } else if(grades >= 95 && grades <= 100 ){
        System.out.println("your grade is B");
        }
        else if(grades >= 90 && grades <= 100){
        System.out.println("your grade is C");
        }
        else if(grades >= 75 && grades <= 100 ){
        System.out.println("your grade is D");
        }
        else if(grades <= 74 && grades <= 100){
        System.out.println("you failed.");
        }
        else{
        System.out.println("You cannot enter anything above 101");
        }
        
    }
}
