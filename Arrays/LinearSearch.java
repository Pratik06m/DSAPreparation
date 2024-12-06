import java.util.*;
public class LinearSearch {

    public static int LinearAlgo(int numbers[], int key){
        for(int i=0; i<=numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        int index = LinearAlgo(numbers, key);

        if(index == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Key is at index: "+index);
        }
    }
}
