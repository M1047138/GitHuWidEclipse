//4ques
import java.util.Scanner;
public class MultArr {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		//transpose
		System.out.println("The transpose is:");
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println("");
		}
	}
	
}
