package Simple;

import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=scn.nextInt();
		if(a%2==0)
		{
			System.out.println("Even:");
		}
		else
		{
			System.out.println("Odd:");
		}
	}
}
