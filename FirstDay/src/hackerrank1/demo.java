package hackerrank1;

public class demo {

	String str;
	public void showData(){
		if (str==null){
			throw NullPointerException;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo ob=new demo();
		ob.showData();
	}

}
