import java.util.*;

public class lecture4EXERCISE {
    public static void main(String args[]){

        // WAP to print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        //int sum = n*(n + 1)/2;
        
        //System.err.println(sum);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        



    }
}
