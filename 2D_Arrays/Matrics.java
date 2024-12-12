import java.util.*;
public class Matrics {

    public static void LargeSmallNum(int matrix[][]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j] > large){ // check large no 
                    large = matrix[i][j];
                }
                if(matrix[i][j] < small){ // check large no 
                    small = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Number in the Matrix is: "+large);
        System.out.println("smallest Number in the Matrix is: "+small);
    }

    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j] == key){ // check the key at the index 
                    System.out.println("Key found at cell no: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {

        int matrix[][] = new int[3][3]; // Declaration of 2D Array

        int n=matrix.length, m = matrix[0].length; // size of rows and columns

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers for make array");

        for(int i=0;i<n;i++){ // traversing Rows
            for(int j=0;j<n;j++){ // Traversing Columns
                matrix[i][j] = in.nextInt(); // take values from user
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " "); // print values in matrix
            }
            System.out.println();
        }

        search(matrix, 7);
        LargeSmallNum(matrix);
    }
}
