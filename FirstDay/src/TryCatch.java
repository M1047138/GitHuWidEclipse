import java.util.Scanner;
public class TryCatch {

	String validateMobileNo(String str){
		
		
		if(str.length()!=10){
			return "false:Invalid mobile no.";
		}
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				continue;
			}
			else{
				System.out.println("ball");
				return "false:Invalid mobile number";
			}
		}
		
		if(str.charAt(0)!='9'){
			System.out.println("lol");
			return "false:Invalid mobile number";
		}
		
		
		
		
		return "true:valid no";
		
	}
	public static void main(String args[]){
		TryCatch tc=new TryCatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		try{
		//String str=sc.next();
		String str=null;
		String s=tc.validateMobileNo(str);
		System.out.println(s);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
