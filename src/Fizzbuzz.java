import org.junit.Assert;
import org.junit.Test;

public class Fizzbuzz {
	
	public static void fizz (){
		for (int i=1; i<=100; i++){
			String word="";
			word+= (i%3 == 0) ? "Fizz" :"";
			word+= (i%5 == 0) ? "Buzz" :"";
			System.out.println(!word.isEmpty() ? word: String.valueOf(i));
		}
	}
	
	public static void main(String[]args){
		fizz();
	}
}
