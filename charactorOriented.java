/*
-	programmer:Mayank
-	./charactorOriented.java
*/

/*
-	charactor oriented Input get Input in charactor form that follow Universal Standared Code.
-	charactor oriented get in charactor datatype Input.
-	charactor oriented superime (top most) classes are Reader and Wirter.

[ syntax ]

	public abstract class java.io.Reader implements java.lang.Readable, java.io.Closeable {}

	public abstract class java.io.Writer implements java.lang.Appendabl, java.io.Closeable, java.io.Flushable {}

-	charactor oriented classes package in "java.io".
-	both classes are abstract.

-	we are get charactor oriented input use BufferedReader class.
-	but java.io.BufferedReader class have not any default constructor.

[ syntax ]

	public java.io.BufferedReader(java.io.Reader, int)

	public java.io.BUfferedReader(java.io.Reader)

{ solution }

-	we have ReaderClass sub class [ InputStreamReader ] that give our super class reference.
-	InputStreamReader have 4 constructor but not any deault contructor.

[ syntax ]

	public java.io.InputStreamReader(java.io.InputStream)

	public java.io.InputStreamReader(java.io.InputStream, java.lang.String) throws java.io.UnsupportedEncodingException

	public java.io.InputStreamReader(java.io.InputStream, java.nio.charset.Charset)

	public java.io.InputStreamReader(java.io.InputStream, java.nio.charsetCharsetDecoder)

*/

class Test
{
	public static void main(String args[]) throws java.io.IOException
	{
//		java.io.BufferedReader input = ;

		String myLine = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();

		System.out.println("-"+myLine);

//		java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out)).write(232);
	}
}
/*
[ Output ]==============================================================


*/
