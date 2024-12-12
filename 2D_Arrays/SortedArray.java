public class SortedArray{
    public static boolean StairCaseSearch(int matrix[][], int key){
        int row =0 , col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){ // check row reach to last and column reach to first
           
            if(matrix[row][col] == key){    // current cell = key
                System.out.println("Key found at: ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){        // if cellvalue is greater than key shift to left
                col--;
            }
            else{                       // if cellvalue smaller than key then shift to down 
                row++;
            }
        }
        System.out.println("Key not found..!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        
        int key = 39;
        StairCaseSearch(matrix, key);
    }
}