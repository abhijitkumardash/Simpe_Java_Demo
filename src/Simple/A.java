package Simple;

class A 
{
	public static void main(String[] args) 
	{
		m1(10);

		m1(20);

		m1(10+20);

		int a=40;

		m1(a);

		int b=1;

		m1(++b);

		System.out.println("b="+b);
	}
	public static void m1(int i)
	{
		System.out.println("i="+i);			//before "b" output
	}
}
