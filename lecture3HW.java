import java.util.*;

public class lecture3HW {
    public static void main(String args[]){

        // WAP to create a virtual CALCULATOR
        
        Scanner sc = new Scanner(System.in);
        // Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();

        // Declaring algebraic operations

        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;

        switch(button){
            case 1 : System.out.println(sum);
            break;
            case 2 : System.out.println(diff);
            break;
            case 3 : System.out.println(mul);
            break;
            case 4 : System.out.println(div);
            break;
            case 5 : System.out.println(rem);
            break;
            default : System.out.println("Invalid button");
        }


    }
    
}
