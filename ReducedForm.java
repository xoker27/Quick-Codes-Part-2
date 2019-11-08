import java.util.Scanner;
public class ReducedForm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<N;i++)
				System.out.print(calPivot(arr,0,N,i)+" ");
		}
		sc.close();
	}

	public static int calPivot(int arr[], int low, int high,int index) {
		
		int temp1=arr[index]; 
        arr[index]=arr[low]; 
        arr[low]=temp1; 
		
		int pivot=arr[low];
		int i=low;
		for(int j=low+1;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
			}
		}
		return i;
	}
}
