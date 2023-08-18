/*
- 	abstract is keyword that mean incompleted.
-	that use before any function in class that we only declare
-	if we declare abstract function in class it make convert class into abstract class.
-	we not use abstract class by create objects it only use by inherite.
- 	if we are extends any super class that inside any abstract function so it make your sub class abstract.
-	for unabstract your subclass we complete abstract function use to function override.
*/
abstract class Super
{
	// abstract void display();
}
class Sub  extends Super
{
	/*void display()
	{
	}*/
}
class Test
{
	public static void main(String args[])
	{
		Sub sub = new Sub();

		System.out.println(" execute ");
	}
}
