package Simple;

class  VarArgs
{
	public static void main(String[] args) 
	{
		m1(10);
		m1(2,4,6,8);
	}
	static void m1(int... a) //TWO Times as (int... a) helps to execute m1 twice even Single or Multiple args {with same type}
	{
		System.out.println("executing m1");
	}
}
