/*
-	copy constructor is use to copy any object value by another object.
-	copy constructor take argument as a objectreferance and copy values that set in copy constructor.
-	copy constructor use require same class object.
*/
class A
{
	int n1, n2;

	A(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	int plus()
	{
		return (n1 + n2);
	}
	/* copy constructor */
	A(A object)
	{
		n1 = object.n1;
		n2 = object.n2;
	}
}
class Test
{
	public static void main(String args[])
	{
		A refference_one = new A(5,3);	// call perimeter constructor

		A refference_two = new A(refference_one); // call copy constructor

		System.out.println(" first "+refference_one.plus()+"\n second "+refference_two.plus());
	}
}
