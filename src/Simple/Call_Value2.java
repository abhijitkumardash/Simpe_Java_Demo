package Simple;

class Call_Value2
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	public static void m1(int i)
	{
		System.out.println(i);				//1,2,3

		if(i==3)  return;

		m1(i+1);							//call by value

		System.out.println(i);				//2,1
	}
}
