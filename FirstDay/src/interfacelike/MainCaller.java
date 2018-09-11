package interfacelike;

import java.util.Scanner;

public class MainCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		Employee ext[]=new Employee[2];
		Employee e=new Employee();
		Extending_class ob=new Extending_class();
		System.out.println("================menu===============");
		System.out.println("save");
		System.out.println("update");
		System.out.println("display");
		System.out.println("exit");
		System.out.println("===================================");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		int i=0;
		do{
		switch(choice){
		
		case "save":
			
			ext[i]=ob.saveEmployee();
			i++;
			count++;
			break;
		case "update":
			
			System.out.println("Enter the id to be updated:");
			String id=sc.next();
			for(i=0;i<ext.length;i++){
				if(ext[i].getEmployeeId().equals(id)){
					ob.updateEmployee(ext[i]);
				}
			}
			break;
			
		case "display":
			System.out.println("The data is:");
			ob.display(ext,count);
			break;
			
		case "exit":
			System.exit(0);
		}
		
		System.out.println("================menu===============");
		System.out.println("save");
		System.out.println("update");
		System.out.println("display");
		System.out.println("exit");
		System.out.println("===================================");
		System.out.println("Enter your choice");
		choice=sc.next();
		
		}while(i!=10);
			
		
		
		

	}

}
