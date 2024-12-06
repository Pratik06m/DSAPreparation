import java.util.*;

public class isPrime{

    public static boolean prime(int n){

        if ( n==2){
            return true;
        }
        // for(int i = 2; i <= n-1; i++)
        //OPTIMIZED
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }   
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i = 2; i <= n; i++){
           if (prime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
        
    }
    public static void main(String []args){

        System.out.println("Enter the number");
        Scanner in =  new Scanner(System.in);

        int n = in.nextInt();

        // System.out.println(prime(n));
        PrimeRange(n);
        
    }
}