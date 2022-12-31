import java.util.*;

public class lecture6 {
    public static void main(Strings args[]){
        int n =4;

        // upper half
        for(int i =1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.println(" ");
            }

            // stars
            for(int j=1 ; j<=2*i-1; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        // lower half
        for(int i = n; i>=n; i--){
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.println(" ");
            }

            // stars
            for(int j=1 ; j<=2*i-1; j++){
                System.out.println("*");
            }
            System.out.println();
        }




    }
}
