
class A
{
	int n = 10;

	/*A()
	{
		System.out.println(" class A ");
	}*/

	A(boolean code)
	{}
}

class B extends A
{
	B()
	{
		super(true);
		System.out.println(" class B "+n);
	}
}

class C
{
	public static void main(String args[])
	{
		new B();
		System.out.println(" FUCK YOU ");
	}
}
