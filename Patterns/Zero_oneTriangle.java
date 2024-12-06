import java.util.*;

public class Zero_oneTriangle{

    public static void zeroOnePattern(int n){
        for (int i =1; i <=n;i++){
            for(int j =1; j<=i;j++){
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = in.nextInt();
        zeroOnePattern(r);
    }
}