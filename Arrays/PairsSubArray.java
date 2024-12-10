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

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16,18,20};
        subArray(array);
        maxsubArraySum(array);
    }
}
