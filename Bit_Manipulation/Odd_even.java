public class Odd_even {
    public static void evenOddNo(int n){
        int bitMask = 1;
        
        if((n & bitMask) == 0){
            // even number
            System.out.println("even number");
        }
        else{
            //odd number
            System.out.println("Odd Number");
        }
    }
    
    public static void main(String[] args) {
        evenOddNo(5);
        evenOddNo(9);
        evenOddNo(10);
        evenOddNo(4);
    }
}
