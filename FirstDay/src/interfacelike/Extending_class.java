package interfacelike;

import java.util.Scanner;

public class Extending_class implements StoreEmployee {
	//Employee obj=new Employee();
	Scanner sc=new Scanner(System.in);
	@Override
	public Employee saveEmployee() 
	{
		Employee obj=new Employee();
		
		System.out.println("Enter name");
		obj.setEmployeeName(sc.nextLine());
		
		System.out.println("Enter id");
		obj.setEmployeeId(sc.nextLine());
		
		
		
		
		//System.out.println(name+" "+id+"kzbckjznc");
		return obj;
	}
	@Override
	public Employee updateEmployee(Employee ob) {
		
		System.out.println("Enter the name to be updated");
		String name=sc.nextLine();
		ob.setEmployeeName(name);
		
		return ob;
		
		}
		

	@Override
	public void display(Employee objj[],int count) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++){
			System.out.println(objj[i].getEmployeeId());
			System.out.println(objj[i].getEmployeeName());
		}
	}
	@Override
	public void deleteData(Employee obj) {
		// TODO Auto-generated method stub
		
		
		
	}

}
