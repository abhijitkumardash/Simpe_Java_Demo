package Simple;

class Argument 
{
	public static void main(String[] arg) 
	{
		int sum=595;

		//double sum=89.9;

		for(int i=0;i<arg.length;i++)
		{
			sum +=Integer.parseInt(arg[i]);
		}
		System.out.println(sum);
	}
}
