public class PairsSubArray {

    public static void subArray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j = i; j<array.length;j++){
                for(int k=i; k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxsubArraySum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            for(int j = i; j<array.length;j++){
                currSum = 0;
                for(int k=i; k<=j;k++){
                    // System.out.print(array[k]+" ");
                    currSum += array[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of Sub Array is: "+maxSum);
    }
    
    public static void prefixArraySum(int numbers[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i =1; i<prefix.length;i++){
            prefix[i] = prefix [i - 1] + numbers[i];
        }

        for(int i=0; i<numbers.length;i++){
            for(int j = i; j<numbers.length;j++){
                
                curr = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < curr){
                    maxSum = curr;
                }

            }
        }
        System.out.println("Max Sum: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        // subArray(array);
        // maxsubArraySum(array);
        prefixArraySum(numbers);
    }
}
