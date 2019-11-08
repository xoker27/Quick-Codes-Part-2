import java.util.*;
class TransitionPoint{  
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
			int n =sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(transitionPoint(arr,0,n));
			T--;
		}	
	}
    static int transitionPoint(int arr[],int low, int high){
        int mid=(low+high)/2;
        if(arr[mid]==1 && arr[mid-1]==0)
           return mid;
       else{
           if(arr[mid]==1 && arr[mid-1]==1)
               return transitionPoint(arr, low, mid-1);
           else
               return transitionPoint(arr, mid,high);
       }
    } 
}
