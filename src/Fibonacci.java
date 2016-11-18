
public class Fibonacci {

	public static void main (String[] args){
		if(args.length==1){
			int n= Integer.parseInt(args[0]);
			int a=0, b=1, c=0, i=0;
			while (i<n){
				System.out.print(c+"\t");
				a=b;
				b=c;
				c=a+b;
				i++;
			}
		} else{
			System.out.print("PLease, insert only one parameter");
		}
	}
}
