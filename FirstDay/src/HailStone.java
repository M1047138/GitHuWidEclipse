

//question 1
public class HailStone {

	int x;
	int count=0;
	public void fun(int n){
		
		x=n;
		//System.out.println(x);
		while(x!=1){
			if(x%2==0){
				System.out.print(x+"is even so i take half:");
				x=x/2;
				System.out.println(x);
				
			}
			else{
				System.out.print(x+"is odd so i take 3n+1:");
				x=3*x+1;
				System.out.println(x);
			}
			count++;
		}
		System.out.println("There are total "+count+ "steps to reach 1");
		
	}
	public static void main(String args[]){
		HailStone ob=new HailStone();
		ob.fun(21);
		
	}
}
