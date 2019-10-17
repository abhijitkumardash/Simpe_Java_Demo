package Simple;

class MethodOverload
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	void search(String[] name)
	{
		System.out.println("Name:"+ name);
	}
	void search(Long[] phoneNo)
	{
		System.out.println("Phone No:"+ phoneNo);
	}

}
