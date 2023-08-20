/*
	class is blue print of any object that have locate memory by create object.
	class is also is collection of member variables or functions,
	In java class is Abstract Datatpe.
	object is real entity the is represent class in real world.
*/
class A
{
	int n; // instance variable : that is comman for  member function and it default value is set by javac
	void f()
	{
		n = 10;
	}
}
class B
{
	void f()
	{
		int n; // local variable : that declare in any function have not any default value.
		n = 12; // that not print without assign any value.
	}
}
class C
{
	public static void main(String args[])
	{
		// ClassName refference_variable = new Constructor();

		A a = new A();
		B b = new B();

		a.f();
		b.f();

		System.out.println(" a.n "+a.n);
	}
}
/*
 a.n 10 b.n 12

*/
