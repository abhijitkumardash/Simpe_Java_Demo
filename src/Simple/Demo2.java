package Simple;

public class Demo2 {

	public static void main(String[] args) {
		double d=12.3;
		Decrement de=new Decrement();
		de.dec(d);
		System.out.println(d);
	}
}
class Decrement
{
	public void dec(double d1)
	{
		d1=d1-1.0;
	}
}
