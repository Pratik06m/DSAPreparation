import java.util.*;;

public class LargestNum {
    public static int LSNumber(int numbers[]){
        int largeNo = Integer.MIN_VALUE;
        int smallNo = Integer.MAX_VALUE;
        
        for(int i =0; i<numbers.length;i++){
            if(largeNo < numbers[i]){
                largeNo = numbers[i];
            } 
            if(smallNo > numbers[i]){
                smallNo = numbers[i];
            }   
        }
        System.out.println("The smallest number in array is: "+smallNo);
        return largeNo;
        
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,20,10,1,12,};
        System.out.println("The largest number in array is: "+LSNumber(numbers));
    }
}
