public class CountingSort {

    public static void countSort(int arr[]){
        int large = Integer.MIN_VALUE; // to find the largest no in array
        for(int i=0;i<arr.length;i++){
            large = Math.max(large, arr[i]); // find the largest no between large and current number of array
        }

        int count[] = new int[large + 1]; // make size of array large + 1 because positive numbers start from 0
        for(int i =0; i<arr.length;i++){
            count[arr[i]]++; // count the number of the original array and stored in the count
        }

        //sorting
        int j=0; // index of origial array
        for(int i=0; i<count.length;i++){// iterate the count array at this step
            while(count[i] > 0){ 
                arr[j] = i; // add the number of count array into the original array at jth position
                j++;
                count[i]--; // if element is double then delete that no from count array one by one
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,5,6,2,5,6,7,6,2,0,3,4,2,1};
        countSort(arr);
        print(arr);
    }
}
