import java.util.Scanner;


public class StringRev {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//String in=sc.next();
		String inp="karan is 3065ar a lol";
		String words[]=inp.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			StringBuilder sb=new StringBuilder(words[i]);
			System.out.print(sb.reverse().toString());
			
		}
		
	}
}
