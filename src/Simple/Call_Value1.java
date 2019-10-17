package Simple;

class Call_Value1
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	public static void m1(int i)
	{
		System.out.println(i);			//1................................

		m1(i++);						//INFINITE LOOP 

		System.out.println(i);			//1................................

		if(i==3)  return;

		m1(i+1);						//call by value
	}
}
