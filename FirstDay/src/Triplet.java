//14
public class Triplet {

	void trip(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int lol=a[i]+a[j];
				int flag=0;
				for(int k=0;k<a.length;k++){
					if(lol==a[k]){
						flag=1;
						break;
					}
				}
				if (flag==1){
					System.out.println(a[i]+","+a[j]+","+lol);
				}
			}
		}
	}
	public static void main(String args[]){
		Triplet tp=new Triplet();
		int a[]={1,2,3,3,4,5} ;
		tp.trip(a);
	}
}
