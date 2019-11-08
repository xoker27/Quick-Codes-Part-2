import java.util.Scanner;
public class YahaSeWaha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int P=sc.nextInt();
		int Q=sc.nextInt();
		System.out.println(checkPossibility(X,Y,P,Q));
		sc.close();
	}

	public static boolean checkPossibility(int X, int Y, int P, int Q) {
		System.out.println("X: "+X+" Y: "+Y);
		if(X>P || Y>Q)
			return false;
		if(X==P && Y==Q)
			return true;
		return checkPossibility(X+Y,Y,P,Q) || checkPossibility(X,Y+X,P,Q);
	}
}
