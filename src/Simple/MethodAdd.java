package Simple;

class MethodAdd 
{
	public static void main(String[] args) //main method
	{
		m2();
		
		int a=m2();							//a value declare
		System.out.println("a="+a);
		
		int j=m2()+10+m2();					//j value declare
		System.out.println("j="+j);

		System.out.println(m2());
	}
	static int m2()							//it can also be before the main method
	{
		System.out.println("Executing m2");
		return 10;
	}
}
