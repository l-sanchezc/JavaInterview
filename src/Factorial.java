import java.util.Scanner;

public class Factorial {
	
	static void fact (int n){
		int fact=1;
		for (int i=1; i<=n; i++){
			fact=i*fact;
		}
		System.out.println("The factorial of " + n +" is "+ fact);
	}
	
	static int factorial (int n){
		int result;
		if(n==1){
			return 1;
		}
		return result= factorial(n-1)*n;
	}
	
	public static void main (String[] args){
		System.out.println("Insert Factorial: ");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		System.out.println("The factorial of " + n +" is "+ factorial(n));
	}
}
