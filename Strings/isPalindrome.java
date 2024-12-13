import java.util.*;
public class isPalindrome {
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2;i++){        // to check half of string
            if(str.charAt(i) != str.charAt(n-1-i)){ // if not same then false
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = "madam";
        System.out.println(palindrome(str));
    }
}
