package Simple;

class method 
{
	public static void main(String[] args) 
	{
		int i=0;

		int j=0;

		j=m1(++i)+m1(i++);					//Pre Increment then Post Increment

		System.out.println("i="+i);			//2

		System.out.println("j="+j);			//2	
	}
	static int m1(int a)
	{
		return a++;							//Post Increment
	}
}
