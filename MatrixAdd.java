import java.util.*;
class MatrixAdd{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,r1,r2,c1,c2;

System.out.println("enter r1 and c1 values:");
r1=sc.nextInt();
c1=sc.nextInt();

System.out.println("enter r2 and c2 values:");
r2=sc.nextInt();
c2=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];

System.out.println("enter a matrix elements:");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("enter b matrix elements:");
for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
{
b[i][j]=sc.nextInt();
}
}

System.out.println("addition of two matrix elements:");
for(i=0;i<a.length;i++)
{
for(j=0;j<b.length;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(" "+c[i][j]);
}
System.out.println(" ");
}
}
}


