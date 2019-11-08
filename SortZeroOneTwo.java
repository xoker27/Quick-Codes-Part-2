import java.util.Scanner;
public class SortZeroOneTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int count[]=new int[3];
			int arr[]=new int[N];
			int arr2[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				count[arr[i]]++;
			}
			for(int i=count[0];i<N;i++)
				arr2[i]++;
			for(int i=count[0]+count[1];i<N;i++)
				arr2[i]++;
			for(int i=0;i<N;i++) 
				System.out.print(arr2[i]+" ");
			System.out.println();
		}
	}

}
