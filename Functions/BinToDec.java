import java.util.*;

public class BinToDec {
    
    public static void binToDec(int BinNum){
        
        int myNum = BinNum;
        int pow = 0;
        int decNum =0;

        while(BinNum > 0){
            int lastDigit = BinNum % 10; // for find the last digit of the number

            decNum = decNum + (lastDigit * (int)Math.pow(2, pow)); // 

            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of "+myNum+" =" +decNum);
    }

    public static void DectoBin(int Decno){
        int myNum = Decno;
        int pow = 0;
        int biNum = 0;

        while(Decno > 0){
            int rem = Decno % 2;

            biNum = biNum +(rem * (int)Math.pow(10, pow));

            pow++;
            Decno = Decno / 2;
        }
        System.out.println("Binary No of "+myNum+ "="+biNum);
    }


    
    public static void main (String []args){
        binToDec(110);
        DectoBin(12);
    }
}