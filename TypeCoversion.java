import java.util.*;

class TypeConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any numbers");
        int num1=sc.nextInt();
        float num2=sc.nextFloat();
        float sum=num1+num2;
        float sub=num1-num2;
        float mul=num1*num2;
        System.out.println("sum:"+sum);
        System.out.println("sub:"+sub);
        System.out.println("mul:"+mul);
    }
}
