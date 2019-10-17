package Simple;
import java.util.*;
public class RangeOfPerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a range");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int sum=1;
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					sum=sum+j;
				}
			}
			if(n==sum)
			{
			System.out.println(n+" is a perfect number");
			}
		}
	}

}
