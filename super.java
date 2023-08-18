/*
-	super keyword is use for call superclass vairable that overwrite in subclass.
*/
class A
{
	A()
	{
		System.out.println(" x value in super class "+x);
	}
	int x = 10;
}
class B extends A
{
	B()
	{
		System.out.println(" x vlaue in sub class "+x+"\n super.x value is "+super.x);
	}
	char x = 'A';
}
class C
{
	public static void main(String args[])
	{
		new B();
	}
}
