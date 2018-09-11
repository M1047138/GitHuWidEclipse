package hackerrank1;

public class File {

	private String user_name;
	private int password;
	
	public void setName(String name){
		user_name=name;
	}
	public void setPassword(int pass){
		password=pass;
	}
	
	public String getName(){
		return user_name;
	}
	public int getPassword(){
		return password;
	}
}
