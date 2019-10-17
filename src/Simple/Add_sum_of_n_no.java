package Simple;

import java.util.Scanner;

public class Add_sum_of_n_no {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
    System.out.println("Sum="+sum);
	}

}
