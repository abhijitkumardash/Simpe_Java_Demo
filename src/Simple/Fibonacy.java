package Simple;

import java.util.Scanner;

public class Fibonacy 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		int a = 0,c = 0;

		if(n == 1)
		{
			System.out.println(a);
			return;
		}
		int b = 1;
		System.out.print(a + " " + b);
		for(int i = 3; i <= n;i++)
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}
