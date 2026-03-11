class Animal
{
 void sound()
{
   System.out.println("Animal makes sound");
}
}

class Dog extends Animal{
void sound()
{
   System.out.println("Bowh Bowh...");
}
}

class Cat extends Animal{
void sound()
{
   System.out.println("Meow Meow...");
}
}

class DynamicMethodDispatch
{
public static void main(String args[])
{
   Animal obj;
   obj=new Animal();
   obj=new Dog();
   obj.sound();
   obj=new Cat();
   obj.sound();
}
} 
