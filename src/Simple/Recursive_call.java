package Simple;

import java.util.Scanner;

public class Recursive_call {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		System.out.println(fact(n));
	}
	static int fact(int m)
	{
		if(m==1||m==0)
		{
			return 1;
		}
		return m*fact(m-1);
	}

}
