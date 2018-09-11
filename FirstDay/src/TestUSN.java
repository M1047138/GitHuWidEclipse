//6 question
import java.util.Scanner;
public class TestUSN {

	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		
		//validating
		char arr[]=a.toCharArray();
		
		int flag=0;
		
		//check length
		if(a.length()!=10){
			flag=1;
		}
		
		
		//1st must be 1 or 2
		else if((arr[0])!='1'  && arr[0]!='2'){
			flag=1;
		}
		
		//2nd and 3rd must be uppercase
		else if(arr[1]<65 || arr[1]>90){
			flag=1;
		}
		else if(arr[2]<65 || arr[2]>90){
			flag=1;
		}
		
		
		//4th and 5th must be digit between 0-9
		else if(arr[3]<48 || arr[3]>57){
			flag=1;
		}
		else if(arr[4]<48 || arr[4]>57){
			flag=1;
		}
		
		else if(arr[7]<48 || arr[7]>57){
			flag=1;
		}
		else if(arr[8]<48 || arr[8]>57 ){
			flag=1;
		}
		else if(arr[9]<48 || arr[9]>57){
			flag=1;
		}
		//67 CS IS ME EC
		
		
		else if(arr[5]=='C' || arr[5]=='I' || arr[5]=='E' || arr[5]=='M'){
			if(arr[5]=='C' && arr[6]!='S'){
				flag=1;
			}
			else if(arr[5]=='I' && arr[6]!='S'){
				flag=1;
			}
			else if(arr[5]=='E' && arr[6]!='C'){
				flag=1;
			}
			else if(arr[5]=='M' && arr[6]!='E'){
				flag=1;
			}
		}
		else if(arr[5]!='C' || arr[5]!='I' || arr[5]!='E' || arr[5]!='M'){
			flag=1;
		}
		//8th and 9th and 10th must be digit between 0-9
		
		

		
		if(flag==1){
			System.out.println("Failure");
		}
		else
		{
			System.out.println("Success");
		}
		
	}
	
	
}
//						1DS09CS010
