package Simple;

import java.util.Scanner;
class Diff_3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=scn.nextInt();
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;i++)
			{
				System.out.print("");

				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}