//question 3
import java.util.Scanner;
public class Subper {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Subjects:");
		int n=sc.nextInt();
		int a[]=new int[1000];
		for(int i=0;i<n;i++){
			System.out.println("Enter the marks");
			a[i]=sc.nextInt();
		}
		
		//calculating percentage
		int total_marks=n*100;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		System.out.println("Total marks="+sum);
		float per=(float)sum/5;
		System.out.println("Percentage="+per);
	}
}
