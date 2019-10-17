package Simple;

import java.util.Scanner;

public class Primeno 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		if(n == 1)
		{
			System.out.println("neither prime nor composite");
		}
		for(int i = 2; i <= n/2; i++)
		{
			if(n%i== 0)
			{
				System.out.println("not prime");
				return;
			}

		}

		System.out.println("prime");

	}

}
