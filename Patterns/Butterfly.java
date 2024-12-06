import java.util.*;

public class Butterfly {

    public static void ButterFlyPattern(int n){
        //For Find rows
        for (int i=1; i<=n;i++){

            //For print *
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            //for print spaces
            for(int j =1; j <= 2*(n-i);j++){
                System.out.print(" ");
            }
            //for print *
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //For Find rows
        for (int i=n; i>=1;i--){

            //For print *
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            //for print spaces
            for(int j =1; j <= 2*(n-i);j++){
                System.out.print(" ");
            }
            //for print *
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = in.nextInt();
        ButterFlyPattern(r);
    }
}
