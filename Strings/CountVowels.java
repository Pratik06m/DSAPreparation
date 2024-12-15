import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter the String: ");

        String str = in.nextLine();

        int count=0;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        System.err.println("Number of vowels in the string is: "+count);
    }
}
