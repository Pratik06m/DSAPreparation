public class SelectionSort {

    public static void selectSort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                //if min greater than current element
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        selectSort(arr);
        print(arr);
    }    
}
