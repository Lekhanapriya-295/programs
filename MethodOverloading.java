class MethodOverload
{
void show(int a)
{
   System.out.println(a);
}
void show(int a,int b)
{  
   System.out.println("sum:"+(a+b));
}
void show(double a,double b,double c)
{
  System.out.println("sum:"+(a+b+c));
}
}
class MethodOverloading
{
public static void main(String args[])
{
  MethodOverload obj=new MethodOverload();
  obj.show(8);
  obj.show(6,9);
  obj.show(8.5,4.5,4.0);
}
}

