import java.util.*;

public class BinoCoeff{

	public static int Fact(int n){
		int f = 1;
		for(int i = 1; i<=n; i++){
			f *= i;
		}
		return f;
	}

	public static void main(String [] args){

	System.out.println("Enter the value of n and r: ");
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int r = in.nextInt();

	// System.out.println(n,r);

	int factn = Fact(n);
	int factr = Fact(r);
	int factnr = Fact(n-r);

	int binoCoef = factn / (factr * factnr);

	System.out.println("Binomial Coefficient of the N and R is "+binoCoef);
	}

}