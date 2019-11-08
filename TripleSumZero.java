import java.util.Arrays;
import java.util.Scanner;

class TripleSumZero{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			TripleSumZero g=new TripleSumZero();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");						
		}
	}		
    public boolean findTriplets(int arr[] , int n){
    	Arrays.sort(arr);
    	Arrays.sort(arr);
    	int i=0;
    	int j=n-1;
    	for(int k=0;k<n;k++){
    	    while(i<j){
    	        if(arr[i]+arr[j]+arr[k]==0 && i!=k && j!=k)
    	            return true;
    	       else if(arr[i]+arr[j]+arr[k]>0 && i!=k && j!=k)
    	                j--;
    	       else
    	            i++;
    	    }
    	}
    	return false;
    }
}