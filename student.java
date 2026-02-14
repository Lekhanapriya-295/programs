import java.util.*;
class student{
String name;
int age;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name:");
name=sc.nextLine();
System.out.println("enter age:");
age=sc.nextInt();
}
void display()
{
System.out.println("student name:"+name);
System.out.println("student age:"+age);
}
public static void main(String args[])
{
student s1=new student();
s1.read();
s1.display();
}
}