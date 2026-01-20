import java.util.*;
public class javaBasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String input=sc.nextLine();
        // System.out.println(input);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println(sum);

//output in java
        // System.out.println("Hello World");
/// variable in java
        // int a=10;
        // int b=5;
        // int sum=(a+b);
        // System.out.println(sum);
// data type
        // byte b=8;
        // System.out.println(b);
        // char  ch='a';
        // System.out.println(ch);
        // boolean var= false;
        // float price=10.5;
        // int number=25;
        // //long
        // //double
        // short n=240;
//input in java
//Area of circle
        // System.out.print("Enter radious:");
        // double radious=sc.nextDouble();
        // double area=3.14*(radious*radious);
        // System.out.println("area of circle is:"+ area);
        
//type conversion:widening/implicit
        byte a=10;
        short b=a;
        int c=b;
        long g=c;
        float d=g;

        double f=d;
        System.out.println(f);
//type casting/explicit/narrowing
        float x=25.5f;
        int  y= (int) x;
        System.out.println(y);


    }
}
