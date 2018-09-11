import java.util.Scanner;


public class Employee {

	private int empID;
	private String empName;
	private String empDesig;
	private String empDept; 
	
	public Employee(){
		
	}
	
	public int getempID(){
		return empID;
	}
	public String getempName(){
		return empName;
	}
	public String getempDesig(){
		return empDesig;
	}
	public String getempDept(){
		return empDept;
	}
	
	
	public void setempName(String empName){
		if(empName==null){
			throw new NullPointerException("null name");
		}
		else{
			this.empName=empName;
		}
		
	}
	
	
	public void setempID(int empID){
		
		this.empID=empID;
	}
	
	
	
	public void setempDesig(String empDesig) throws MyException{
		if(empDesig.equals("developer") || empDesig.equals("tester") || empDesig.equals("lead") || empDesig.equals("manager")){
			this.empDesig=empDesig;
		}
		else{
			throw new MyException("not accepted designation");
		}
	}
	
	
	
	public void setempDept(String empDept) throws InvalidDeptExp{
		if(empDept.equals("C2") || empDept.equals("TTG") || empDept.equals("ITES") || empDept.equals("PES")){
			this.empDept=empDept;
		}
		else
		{
			throw new InvalidDeptExp("Invalid dept");
		}
	}
	
	public static void main(String args[]) throws MyException{
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee desig");
		String desig=sc.next();
		System.out.println("Enter the employee dept");
		String dept=sc.next();
		
		emp.setempID(id);
		try{
		emp.setempName(name);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		try{
			emp.setempDesig(desig);
		}
		catch(MyException e){
			System.out.println(e);
		}
		try{
			emp.setempDept(dept);
		}catch(InvalidDeptExp e){
			System.out.println(e);
		}
		
		
		int retid=emp.getempID();
		String retname=emp.getempName();
		String retdesig=emp.getempDesig();
		String retdep=emp.getempDept();
		
		System.out.println("id="+retid+",name="+retname+",designation="+retdesig+",deptarment="+retdep);
		
	}
}
