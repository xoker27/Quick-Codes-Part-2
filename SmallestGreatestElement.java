import java.util.Scanner;
import java.util.Arrays;

public class SmallestGreatestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr1[]=new int[N];
			int arr2[]=new int[N];
			for(int i=0;i<N;i++) {
				arr1[i]=sc.nextInt();
				arr2[i]=arr1[i];
			}
			Arrays.sort(arr1);
			int res[]=new int[N];
			
		}
		sc.close();
	}

}
