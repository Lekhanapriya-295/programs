class Animal
{
	void sound()
	{
		System.out.println("Animal makes sound");
	}
	void sound(String name)
	{
		System.out.println(name+"makes sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog barks");

	}
}
public class PolymorphismDemo
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.sound();
		a.sound("cat");
		Animal obj=new Dog();
		obj.sound();
	}
}

