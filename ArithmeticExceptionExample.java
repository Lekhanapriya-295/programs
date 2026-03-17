class ArithmeticExceptionExample
{
	public static void main(String args[])
	{
	try
	{
		int num=10/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error:ArithmeticException occurred");
	}
	}
}
