class Grandparent{
 void showGrandparent()
  {
    System.out.println("Grandparent method invoked");
  }
}

class Parent extends Grandparent{
  void showParent()
  {
    System.out.println("Parent method invoked");
  }
}

class Child extends Parent{
   void showChild()
  {
    System.out.println("child method invoked");
  }
}

class MultilevelInheritance
{
  public static void main(String args[])
 {
   Child obj=new Child();
   obj.showGrandparent();
   obj.showParent();
   obj.showChild();
}
}
