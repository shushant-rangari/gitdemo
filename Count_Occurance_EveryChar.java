import java.util.LinkedHashMap;
import java.util.Scanner;

public class Count_Occurance_EveryChar {

	public static void main(String[] args) {


		LinkedHashMap<Character,Integer> lm=new LinkedHashMap<Character,Integer>();
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();


		char ch[]=s.toCharArray();
		
		for(char r:ch)
		{
			if(lm.containsKey(r))
				lm.put(r,lm.get(r)+1);
			else
				lm.put(r, 1);
		}
		System.out.println(lm);
		sc.close();
	}

}
