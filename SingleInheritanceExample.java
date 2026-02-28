class Parent{
    void showparent()
          {
            System.out.println("parent method invoked");
          }
     }
class Child extends Parent{
    void showchild()
        {
    	   System.out.println("child method invoked");
	}
     }
class SingleInheritanceEXample
{
  public static void main(String args[])
  {
	Child obj=new Child();
	obj.showparent();
	obj.showchild();
  }
}