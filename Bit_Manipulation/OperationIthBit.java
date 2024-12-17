public class OperationIthBit {

    public static int getithbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static int setithbit(int n, int i){
        int bitMask = 1<<i;
         return n | bitMask;
    
    }

    public static int clearithbit(int n, int i){
        int bitMask = ~(1<<i);
         return n & bitMask;
    
    }

    public static int updateithbit(int n, int i, int newBit){

        //First Way
        
        // if(newBit ==0){
        //     return clearithbit(n, i);
        // }
        // else{
        //     return setithbit(n, i);
        // }

        //Second way

        n = clearithbit(n, i);
        int bitMask = newBit<<i;
        return n |bitMask;
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10, 2));
        System.out.println(setithbit(10, 2));
        System.out.println(clearithbit(10, 1));
    }    
}