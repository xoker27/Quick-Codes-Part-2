import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			int max1,max2;
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			if(arr[0]>arr[1]) {
				max1=arr[0];
				max2=arr[1];
			}
			else {
				max1=arr[1];
				max2=arr[0];
			}
			for(int i=2;i<N;i++) {
				if(arr[i]>max1) {
					max2=max1;
					max1=arr[i];
				}
				else if(arr[i]>max2)
					max2=arr[i];
				//System.out.println(max2);
			}
			System.out.println(max2);
		}
	}

}
