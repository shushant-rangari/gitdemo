import java.util.Scanner;

public class Prime_Number {
	
	void check()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		int c=1;
		boolean f=true;
		while(c<=n/2)
		{
			if(n%2==0)
			{
				System.out.println("Not prime number");
				f=false;
				break;
			}
			c++;
		}
		if(f==true)
		{
			System.out.println("Prime number");
		}
		sc.close();
	}

	public static void main(String[] args) {
		Prime_Number obj=new Prime_Number();
		obj.check();

	}

}
