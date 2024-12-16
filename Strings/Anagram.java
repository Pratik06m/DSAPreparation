import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String str1 = "raca";
        String str2 = "care";

        //Covert the strings into lowercase or uppercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //first check the length of strings same or not

        if(str1.length() == str2.length()){
            
            // Convert the string into the array
            char[] str1array = str1.toCharArray();
            char[] str2array = str2.toCharArray();

            System.out.println(str1array);
            System.out.println(str2array);
            
            //sort the array
            Arrays.sort(str1array);
            Arrays.sort(str2array);

            System.out.println(str1array);
            System.out.println(str2array);

            //CHECK VALUE OF STR1ARRAY AND STR2ARRAY
            if(Arrays.equals(str1array, str2array)){
                System.out.println("They are anagrams");
            }
            else{
                System.out.println("They are Not anagrams");
            }

        }
        else{
            System.out.println("Following Strings are not anagrams cause length");
        }
    }
}
