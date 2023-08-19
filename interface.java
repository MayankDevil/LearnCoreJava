/*
-	interface is idea that collect inside public abtract function declare AND public static final variales.
-	we are not create interface object.
-	we are implements one or multiple interface with class either other interfaces.
-	if we are add interface with class so we are overide all fuction with that your class is abstract.
-	Syntax : [ ACCESSIFER class SubClassName extends SuperClassName implements Interface,Interface,... { //code }]
*/
interface MyIdea
{
	void display();
	int n = 10;
}
interface JustIdea
{
	int n = 0;
}
interface CopyIdea extends MyIdea
{
	void display();
}
class Test implements CopyIdea,JustIdea
{
	public void display()
	{
		System.out.println(" JustIdea n is "+JustIdea.n+" MyIdea n is "+MyIdea.n);
	}
	public static void main(String args[])
	{
		// Test t = 
		new Test().display();
	}
}
/*

Compiled from "interface.java"
interface MyIdea {
  public static final int n;
  public abstract void display();
}
interface.java:10: error: display() in Test cannot implement display() in MyIdea
	void display()
	     ^
  attempting to assign weaker access privileges; was public
1 error
 n is 10
 n is 10
interface.java:7: error: = expected
	int n;
	     ^
1 error

*/
