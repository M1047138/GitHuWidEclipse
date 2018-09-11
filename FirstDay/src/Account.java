import java.sql.SQLException;


public class Account {

	public Account createAccount() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Account account1=null;
		try{
		Class class1 = Class.forName("bank.Account");
		if(class1==null){
			throw new ClassNotFoundException();
		}
		account1=(Account) class1.newInstance();
		}catch(Exception e){
			System.out.println(e);
			//System.out.println("lol");
		}
		
		return account1;
		
		
	}
	public static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Account ac=new Account();
		Account acc=ac.createAccount();
		System.out.println(acc);
	}
}
