import java.util.Scanner;

public class SumofInt {


    public static int SumDigit(int n){
        int myNum = n;
        int sum = 0;

        while (n !=0) {

            int ld = n % 10;
            sum = sum + ld;
            n = n /10;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Sum of the digit is: "+SumDigit(n));      
    }
}
