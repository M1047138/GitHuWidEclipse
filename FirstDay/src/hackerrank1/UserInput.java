package hackerrank1;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] height={1,2,3,4,5,6,7,8,9,10};
		int left=0,leftCount=1,right=height.length-1,rightCount=1,len1=1,len2=1,finalAns=0;
        while(left<right){
            len1=1;
            len2=1;
            while(left<height.length-1 && height[left]<=height[left+1]){
                len1++;
                left++;
            }
            //left++;
            
            
            while(height[right]<=height[right-1] && right>0){
                len2++;
                right--;
            }
            //right--;
            
            if(len1>len2){
                finalAns+=leftCount;
            }
            else
            {
                finalAns+=rightCount;
            }
            
            if(left>=right){
                break;
            }
            
            else{
                finalAns+=leftCount;
            }
            
            left++;
            right--;
            
        }
        
        System.out.println(finalAns);
	}

}
