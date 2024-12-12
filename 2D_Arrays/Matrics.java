import java.util.*;
public class Matrics {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m = matrix[0].length;

        Scanner in = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
