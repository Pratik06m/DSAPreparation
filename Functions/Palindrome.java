import java.util.Scanner;

public class Palindrome{


    public static boolean isPalindrome(int n){
        int myNum = n;
        int rev = 0;

        while(n != 0){
            int ld = n % 10;
            rev = ld + rev * 10 ;
            n = n / 10;
        }
        return myNum==rev;

    }
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(isPalindrome(n));
    
    }
}