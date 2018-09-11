package customerdata;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int n=sc.nextInt();
		
		double avgRating=0;
		double sum=0;
		Customer customer[]=new Customer[n];
		for(int i=0;i<n;i++){
			
			System.out.println("Enter the name of the customer");
			String name=sc.next();
			System.out.println("Enter the contact of the customer");
			String contact=sc.next();
			System.out.println("Enter the rating of the customer");
			double rating=sc.nextDouble();
			
			//customer[i]=new Customer(name,contact,rating);
			customer[i]=new Customer();
			customer[i].setName(name);
			customer[i].setContact(contact);
			customer[i].setRating(rating);
			
		}
		
		for(int i=0;i<n;i++){
			
			sum+=customer[i].getRating();
			
		}
		
		avgRating=sum/n;
		
		System.out.println(avgRating);
		

	}

}
