package Simple;

class Call_Value4
{										//call by value
	public static void main(String[] args) 
	{
		m1();
	}
	static void m1()
	{
		int n=1;

		System.out.println(n);

		m1();						//STACK OVERFLOW ERROR DUE TO RECURSIVE m1() Calling
	}
}
