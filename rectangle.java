import java.util.*;
class rectangle
{
double length,width,area,perimeter;
 void readAttributes()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
 length=sc.nextDouble();
System.out.println("enter the width:");
 width=sc.nextDouble();
}
void area()
{
area=length*width;
System.out.println("area:"+area);
}
void perimeter()
{
perimeter=2*(length+width);
System.out.println("perimeter:"+ perimeter);
}
public static void main(String args[])
{
rectangle r=new rectangle();
r.readAttributes();
 r.area();
 r.perimeter();
}
}


