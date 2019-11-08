import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			System.out.print(calRoot(N));
		}
	}
	public static int calRoot(int X) {
		if(X==0 || X==1)
			return X;
		int start=1, end=X, ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid*mid==X)
				return mid;
			else if(mid*mid<X) {
				start=mid+1;
				ans=mid;
			}
			else {
				end=mid-1;
			}
		}
		return ans;
	}
}
