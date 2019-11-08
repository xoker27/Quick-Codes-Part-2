import java.util.Scanner;
public class RemoveConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			boolean flag=false;
			for(int i=0;i<str.length();i++) {
				switch(str.toLowerCase().charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.print(str.charAt(i));
					flag=true;
					break;
				default:
					System.out.print(" ");
				}
			}
			if(!flag)
				System.out.println("No Vowel");
		}
	}

}
