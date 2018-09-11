package interfacelike;

public class Employee {

	private String empName;
	private String emp_id;
	private String company="Mindtree";
	
	
	Employee(){
		
	}
	
	Employee(String name,String id){
		
		empName=name;
		emp_id=id;
		
	}
	
	
	public void setEmployeeName(String name)
	{
		this.empName=name;
	}
	
	public void setEmployeeId(String id)
	{
		this.emp_id=id;
	}
	
	public String getEmployeeName(){
		return empName;
	}
	public String getEmployeeId(){
		return emp_id;
	}
	
}
