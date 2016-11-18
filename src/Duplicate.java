import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
	
	public static void printTimesCharacters (String text){
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		ArrayList<Character> repeated= new ArrayList<Character>();
		int numb=0;
		char c='a';
		for(int i=0; i<text.length(); i++){
			if(!map.containsKey(text.charAt(i))){
				map.put(text.charAt(i), 1);
			}else{
				map.put(text.charAt(i), map.get(text.charAt(i))+1);
				if(map.get(text.charAt(i))>numb){
					numb=map.get(text.charAt(i));
					c=text.charAt(i);
				}
				if(!repeated.contains(text.charAt(i))){ 
					repeated.add(text.charAt(i));}
			}
		}
		System.out.println("The characters in the String are: " +  map);
		System.out.println("The characters repeated are: " + repeated);
		System.out.println("The character most repeated is: "+"'"+ c +"'"+" "+ numb +" times");
	}
	
	public static void main (String[] args){
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		printTimesCharacters(text);
	}
}