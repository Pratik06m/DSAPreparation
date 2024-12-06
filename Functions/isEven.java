import java.util.*;;

public class isEven {

    public static boolean even(int n){

        for(int i = 2; i <= n-1; i++){
            if(n % 2 == 0){
                return true;
            }
        }
        return false;

    }
        public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(even(n));
    
    }
}
