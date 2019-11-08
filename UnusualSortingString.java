import java.util.Arrays;
import java.util.Scanner;
public class UnusualSortingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			char arr[]=str.toCharArray();
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]);
		}
	}
}
