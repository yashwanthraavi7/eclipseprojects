package practice;

public class co {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int r=3;
  int n=4;
		
int		value=r*n;
		int[] arr= {3,5,6,7,8,3,8};
		int pos=0;
		int sum=0;
		
		
		for(int j=0;j<n && sum<value;j++ ) {
			
			sum=sum+arr[j];
			pos=j+1;
			//System.out.println(pos);
		}
		
		System.out.println(pos);
	}

}
