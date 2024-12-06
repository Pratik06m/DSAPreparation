import java.util.*;

public class binarySearch {

    public static int BinaryAlgo(int numbers[], int key){
        int start = 0; 
        int end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){ //when founded
                return mid;
            }

            if(numbers[mid] < key){ // for right half
                start = mid +1;
            }
            else{ // for left half
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 16;

        System.out.println("The index of key is : " +BinaryAlgo(numbers, key));
    }
}
