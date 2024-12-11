public class BubbleSort {

    public static void bubblesort(int arr[]){

        for(int turn=0;turn<arr.length-1;turn++){
            //for skipping the numbers of alreay sorted 
            for(int j=0; j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //Swapping 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int arr[] = {5,3,4,2,1};
        bubblesort(arr);
        print(arr);

    }
}
