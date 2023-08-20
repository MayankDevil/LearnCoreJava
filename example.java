/*
	Operator : pertor function
*/
class Test
{
	void arithmetic_operator()
	{
		System.out.println(
			" addition "+(1 + 2)+
			" subtraction "+(2 - 1)+
			" Multiplication "+(2 * 3)+
			" Divition "+(9 / 3)+
			" Modulas "+(7 % 3)
		);
	}
	void assignment_operator()
	{
		System.out.println();
	}
	public static void main(String args[])
	{
		Test t = new Test();

		t.arithmetic_operator();
	}
}
/*
 addition 3 subtraction 1 Multiplication 6 Divition 3 Modulas 1

*/
