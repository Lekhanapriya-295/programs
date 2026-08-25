import Mypackage.Calculator;
public class PackageDemo{
	public static void main(String args[])
	{
		Calculator c =new Calculator();
		int sum=c.add(10,5);
		int diff=c.substract(10,5);
		System.out.println("Addition:"+sum);
		System.out.println("subtraction:"+diff);
	}
}
