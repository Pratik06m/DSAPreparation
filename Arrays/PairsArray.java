import java.util.*;

public class PairsArray {
    public static void Pairs(int array[]){
        int totalPairs = 0;
        for (int i =0; i< array.length; i++){
            int curr = array[i];
            for(int j = i+1; j<array.length;j++){
                System.out.print("(" + curr + ","+ array[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is: "+ totalPairs); 
        // Formula n*(n-1)/2
        System.out.println(array.length*(array.length - 1)/2);

    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16,18,20};
        Pairs(array);
    }
}
