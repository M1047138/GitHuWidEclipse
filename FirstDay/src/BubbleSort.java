//5 question
import java.util.Scanner;
public class BubbleSort {

	public void sort(int a[]){
		int x[]=new int[a.length];
		x=a;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(x[j+1]<x[j]){
					int temp=x[j+1];
					x[j+1]=x[j];
					x[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(x[i]);
		}
	}
	public static void main(String args[]){
		BubbleSort bs=new BubbleSort();
		Scanner sc=new Scanner(System.in);
		//declaring size of array
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		//taking input
		int a[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		bs.sort(a);
		
	}
}
