//question 2
import java.util.Scanner;
public class DelDup {

	
	
	public static void main(String args[])
	{
		DelDup d=new DelDup();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println(size);
		System.out.println("Enter the data in the array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		
		int arr2[]=new int[size];
		int k=0;
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<=k;j++){
				if(arr[i]==arr2[j]){
					count++;
				}
				
			}
			if(count==0){
				arr2[k++]=arr[i];
			}
		}
		//new array print
		for(int i=0;i<k;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
	}
}