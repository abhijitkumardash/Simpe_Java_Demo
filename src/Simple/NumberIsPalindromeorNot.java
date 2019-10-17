package Simple;
import java.util.*;
public class NumberIsPalindromeorNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int t=n;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println(t+" is palindrome");
		}
		else
		{
			System.out.println(t+" is not a palindrome");
		}
	}

}
