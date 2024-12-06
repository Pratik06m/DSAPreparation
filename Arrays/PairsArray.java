import java.util.*;

public class PairsArray {
    public static void Pairs(int numbers[]){
        int totalPairs = 0;
        for (int i =0; i< numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length;j++){
                System.out.print("(" + curr + ","+ numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is: "+ totalPairs); 
        // Formula n*(n-1)/2
        System.out.println(numbers.length*(numbers.length - 1)/2);

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        Pairs(numbers);
    }
}
