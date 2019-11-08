import java.util.Scanner;

class SentenceReverse {
	
	public static void main (String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int T=sc.nextInt();
    	 sc.nextLine();
    	 while(T-->0){
    	     String input=sc.nextLine();
    	     String arr[]=input.split("\\.");
    	     String output="";
    	     for(int i=arr.length-1;i>=0;i--)
    	        output=output+""+arr[i]+".";
    	     System.out.println(output.substring(0,output.length()-1));
    	 }
    	 sc.close();
	 }
}