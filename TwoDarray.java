import java.util.*;
class TwoDarray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int row,col;
System.out.println("enter number of row elements:");
row=sc.nextInt();
System.out.println("enter number of column elements:");
col=sc.nextInt();
int[][] a=new int[row][col];
System.out.println("enter array elements:");

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("array elements are:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}


