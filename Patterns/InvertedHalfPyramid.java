import java.util.*;

public class InvertedHalfPyramid {

    public static void InvertPy(int tr){
        for(int i =1; i<=tr; i++){
            for(int j = 1; j<=tr-i; j++){
                System.out.print(" ");
            }
            for(int s = 1; s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InvertNumPy(int n){
        for (int i = 1; i<=n;i++){
            for( int j=1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = in.nextInt();
        InvertPy(r);
        InvertNumPy(r);
        in.close();
    }
}
