

public class InsertionSort {

    public static void insertSort(int arr[]){
        for (int i=1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //for find the position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insert element on that position
            arr[prev+1] = curr;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,8,9,7,3,1,2,0};
        insertSort(arr);
        print(arr);
    }    
}
