import java.util.Scanner;
public class OccurOnesOnly {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			if((arr[0]^arr[1])!=0)
				System.out.println(arr[0]);
			if((arr[N-2]^arr[N-1])!=0)
				System.out.println(arr[N-1]);
			for(int i=1;i<N-1;i++) {
				if((arr[i-1] ^ arr[i]) !=0 && (arr[i+1] ^ arr[i]) !=0)
					System.out.println(arr[i]);
			}
			//Improved Approach::
			//System.out.println(arr[uniqueIndex(arr,0,N-1)]);
		}
	}
	public static int uniqueIndex(int arr[],int i,int j) {
		if(i==j)
			return i;
		int mid=(i+j)/2;
		if(mid%2==0) {
			if(arr[mid]==arr[mid+1]) 
				return uniqueIndex(arr,mid+2,j);
			return uniqueIndex(arr,i,mid);
		}
		else {
			if(arr[mid]==arr[mid-1]) 
				return uniqueIndex(arr,mid+1,j);
			return uniqueIndex(arr,i,mid-1);
		}
	}
}
