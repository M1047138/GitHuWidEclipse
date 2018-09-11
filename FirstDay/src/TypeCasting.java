//7ques

import java.util.Scanner;
public class TypeCasting {
	public static void main(String args[]){
		double a[]={20.0,50.0,50.0,80.0,10.0};
		double b[]={10.0,20.0,30.0};
		int z[]=new int[10];
		int i=0;
		int k=0;
		while(i<a.length && i<b.length){
			double lol=a[i]+b[i];
			z[k++]=(int) lol;
			i++;
			
			
		}
		if(a.length>b.length){
			while(i<a.length){
				z[k++]=(int)a[i];
				i++;
			}
		}
		else if(a.length<b.length)
		{
			while(i<b.length)
			{
				z[k++]=(int)b[i];
				i++;
			}
		}
		
		for(i=0;i<k;i++){
			System.out.println(z[i]);
		}
		
	}
	
}
