import java.util.Scanner;
public class SeachingANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N+1];
			int K=sc.nextInt();
			boolean flag=false;
			for(int i=1;i<N+1;i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==K) {
					System.out.println(i);
					flag=true;
				}
			}
			if(!flag)
				System.out.println("-1");
		}
	}
}
