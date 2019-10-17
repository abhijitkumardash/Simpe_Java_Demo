package Simple;
import java.util.*;
public class AbhijitProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=scn.nextLine();
		givenString(s);
	}
	static void givenString(String s)
	{
		String arr[] =s.split(" ");
		String s1="";
		String s2="";
		String s3="";
		s1=s1+arr[2];
		s1+=" ";
		s1=s1+arr[3];
		s1+=" ";
		for(int i=arr[0].length()-1;i>=0;i--)
		{
			s2=s2+arr[0].charAt(i);
		}
		s1=s1+s2;
		s1+=" ";
		s1=s1+arr[4];
		s1+=" ";
		s1=s1+arr[5];
		s1+=" ";
		for(int i=arr[7].length()-1;i>=0;i--)
		{
			s3=s3+arr[7].charAt(i);
		}
		s1=s1+s3;
		s1+=" ";
		s1=s1+arr[6];
		s1+=" ";
		s1=s1+arr[1];
		System.out.println(s1);
	}
}
