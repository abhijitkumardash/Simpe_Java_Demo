package Simple;

class Call_Value3
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	public static void m1(int i)		//call by value
	{
		System.out.println(i);			//1,2,3,4,5,6,7.8.9,..............

		m1(++i);						//INFINITE LOOP 

		System.out.println(i);			

		if(i==3)  return;

		m1(i+1);						
	}
}
