package Simple;

class  VarArgs1
{
	public static void main(String[] args) 
	{
		m1(5);
		m1(2,4,6,8);
	}
	static void m1(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	System.out.println("_ _ _");
	}
}
