import java.util.Scanner;


 class Customer {

	private String name,contact;
	private double rating;
	static double sum=0,count=0;
	void setter(double rating){
		sum+=rating;
		count++;
	}
	double getter(){
		//System.out.println(sum);
		double avg=sum/count;
		//System.out.println("average rating"+avg);
		return avg;
	}
	
	Customer(){
		
	}
	
	Customer(String name ,String contact,double rating){
		this.name=name;
		this.contact=contact;
		this.rating=rating;
		setter(rating);
	}
	
}

 public class CustomerSolution{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int n=sc.nextInt();
		Customer customer[]=new Customer[n];
		for(int i=0;i<n;i++){
			
			System.out.println("Enter the name of the customer");
			String name=sc.next();
			System.out.println("Enter the contact of the customer");
			String contact=sc.next();
			System.out.println("Enter the rating of the customer");
			double rating=sc.nextDouble();
			
			customer[i]=new Customer(name,contact,rating);
			
		}
		Customer get=new Customer();
		double avg=get.getter();
		System.out.println("Average is:"+avg);
	}
}
