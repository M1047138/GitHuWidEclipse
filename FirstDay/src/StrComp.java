import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class StrComp {

	public static void main(String args[]){
		StrComp sp=new StrComp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		int x=0;
		int k=0;
		int siz=a.length();
		char arr1[]=a.toCharArray();
		char arr2[]=new char[siz];
		for(int i=0;i<arr1.length;i++){
			if((arr1[i]>=65 && arr1[i]<=90) || (arr1[i]>=97 && arr1[i]<=122)){
				arr2[k++]=arr1[i];
				x++;
				
			}
		}
		ArrayList names = new ArrayList();
		for(int i=0;i<k;i++){
			names.add(Character.toString(arr2[i]));
		}
		Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		Iterator itr=names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
