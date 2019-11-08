import java.util.Scanner;
public class SortHalfSorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			int mid=-1;
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=1;i<N;i++) {
				if(arr[i]<arr[i-1]) {
					mid=i;
					break;
				}
			}
			arr=sort(arr,0,mid,N);
			for(int i=0;i<N;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[] sort(int arr[],int low,int mid, int high) {
		int arr2[]=new int[high];
		int i=0,j=mid,k=0;
		while(i<mid && j<high) {
			if(arr[i]<arr[j])
				arr2[k++]=arr[i++];
			else
				arr2[k++]=arr[j++];
		}
		while(i<mid)
			arr2[k++]=arr[i++];
		while(j<high)
			arr2[k++]=arr[j++];
		return arr2;
	}

}
