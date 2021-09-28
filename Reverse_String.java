import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s=sc.nextLine();
		String c=s;
		
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		boolean f=false;
		if(rev.equals(c))
		{
			System.out.println("Palindrome");
			f=true;
		}
		if(f==false)
		{
			System.out.println("not palindrome");
		}
		

	}

}
