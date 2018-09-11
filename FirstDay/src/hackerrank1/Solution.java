package hackerrank1;
import java.util.*;

public class Solution {

	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      
		int A[]={1,2,3,4,5,6,7,8,9,10};
		int sum1=A[0],sum2=A[1];
        int count=0;
        
        for(int i=2;i<A.length;i=i+2){
            if(count==0){
                sum1=sum1*A[i];
                count=1;
            }
            else {
                sum1=sum1+A[i];
                count=0;
            }
            
        }
        count=0;
        for(int i=3;i<A.length;i=i+2){
            if(count==0){
                sum2=sum2*A[i];
                count=1;
            }
            else {
                sum2=sum2+A[i];
                count=0;
            }
        }
        System.out.println(sum1+" "+sum2);
        int even=sum1%2;
        int odd=sum2%2;
        if(even<odd){
            System.out.println("ODD");
        }
        else if(even>odd){
        	System.out.println("EVEN");
        }
        else{
        	System.out.println("NEUTRAL");
        }
          }
}
