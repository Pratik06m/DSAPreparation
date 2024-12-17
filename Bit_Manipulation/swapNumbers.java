public class swapNumbers {
    public static void main(String[] args) {
        int x = 5, y = 2;

        System.out.println("Before Swap: "+x+ " and y = "+y);

        x = x^y;
        y = x^y;
        x = x^y;
        
        System.out.println("After Swap: "+x+ " and y = "+y);

    }
}
