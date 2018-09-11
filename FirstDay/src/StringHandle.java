import java.util.HashMap;
import java.util.Scanner;


public class StringHandle {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		System.out.println("Enter the String");
		String inpStr1=sc.nextLine();
		System.out.println(inpStr1);
		String inpStr=inpStr1.toUpperCase();
		/*String inpStr1="Student List do not exist in sys-tem";
		String inpStr=inpStr1.toUpperCase();*/
		char arr[]=inpStr.toCharArray();
		//System.out.println(String.valueOf(arr));
		//System.out.println(inpStr);
		
		char b[]=new char[2];
		for(int i=0;i<inpStr.length()-1;i++){
			int j=i+1;
			if((int)inpStr.charAt(j)-(int)inpStr.charAt(i)==1){
				b[0]=inpStr.charAt(i);
				b[1]=inpStr.charAt(j);
				int count=0;
				for(int z=0;z<inpStr.length()-1;z++){
					if(arr[z]==b[0] && arr[z+1]==b[1]){
						count++;
					}
				}
				  
				hm.put(String.valueOf(b), count);

			}
		}
		
			System.out.println(hm);
		
	}
}
