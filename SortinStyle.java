import java.util.Arrays;
import java.util.Scanner;
public class SortinStyle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			int k=0;
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				if(arr[i]%2==0)
					k++;
			}
			Arrays.sort(arr);
			//System.out.println(k);
			int resArray[]=new int[N];
			int odd=N-k;
			int even=N-k;
			for(int i=0;i<N;i++) {
				if(arr[i]%2!=0) {
					resArray[--odd]=arr[i];
				}
				else {
					resArray[even++]=arr[i];
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(resArray[i]+" ");
			}
		}
	}
}
