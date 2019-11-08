import java.util.Scanner;
public class SortedExceptTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<N-2;i++) {
				for(int j=i+1;j<N;j++) {
					if(arr[i]>arr[j])
						swap(arr,i,j);
				}
			}
			for(int i=0;i<N-2;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
