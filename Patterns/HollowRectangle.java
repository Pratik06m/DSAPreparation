import java.util.*;

public class HollowRectangle{

    public static void hollowRect(int tRows, int tCols){
        for(int i = 1; i<= tRows; i++){
            for(int j =1; j<= tCols;j++){
                if(i ==1 || i == tRows || j == 1|| j== tCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int r = in.nextInt();
        int c = in.nextInt();
        hollowRect(r, c);
        in.close();

    }
}