import java.util.*;
//Position this line where user code will be pasted.
class SmallestPositiveMissing{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			System.out.println(missingNumber(arr,n));
		}
    }
	static int missingNumber(int arr[], int N){
        HashSet<Integer> map=new HashSet<Integer>();
			for(int i=0;i<N;i++) {
				if(arr[i]>0) {
					map.add(arr[i]);
				}
			}
			for(int i=0;i<map.size();i++) {
				if(!map.contains(i+1))
					return i+1;
			}
        return map.size()+1;
   }
    
}