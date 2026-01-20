 import java.util.*;
// public class Conditional {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter userName:");

//         String name=sc.nextLine();
//         System.out.println("Enter password");
//         String pass=sc.nextLine();
        
//         String userName="Adarsh";
//         String password="adarsh@123";

//         if ((userName==name) && (password==pass)){
//             System.out.println("welcome to my portfolio");
//         }
//         else{
//             System.out.println("wrong password;pleasetry again");
//         }
//     }
// }
// //----------------------------if -else statement---------------
// public class Conditional{
//     public static void main(String args[]){
//         int age=15;
//         if (age>=18){
//             System.out.println("adult");
//         }
//         else{
//             System.out.println("not adult");
//         }
//     }
// }
// //-----------------even/odd---------------------------
// public class Conditional{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter any number to check wheather it is even or odd:");
//     int num=sc.nextInt();
//     if(num%2==0){
//         System.out.println(num+" "+ "is even");
//     }
//     else{
//         System.out.println(num+" "+"is  odd");
//     }

        
//     }
// }
// //---------------------------------Income tax calculator---------
// public class Conditional {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float income=sc.nextFloat();
//         float tax;
//         if(income<500000){
//             tax=0;
//             System.out.println("0.0% tax");
            
//         }
        
//         else if(income>=500000&&income<1000000){
//             System.out.println("20% tax");
           
//             tax= (float) (income*0.2);
            
//         }
//         else{
//             System.out.println("30% tax");
//             tax=(float)(income*0.3);
//         }
           
//         System.out.println("total tax is:" + tax);
//     }

//     }
        
// //-----------'------ternary operator-------------------
// public class Conditional{
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int larger=(5>3)?5:3;
//     System.out.println(larger);
//     String number=(sc.nextInt()%2==0)?"even":"odd";
//     System.out.println(number);
// }
// }
// //----------switch  statement-----------------
// public class Conditional{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         char operator=sc.next().charAt(0);
//         switch(operator){
//             case '+':System.out.println(a+b);
//                      break;
//             case '-':System.out.println(a-b);  
//                      break;  
//             case '*':System.out.println(a*b);  
//                      break;       
//             case '/':System.out.println(a/b);  
//                      break; 
//              case '%':System.out.println(a%b);  
//                      break;       
               


//             default:System.out.println("invalid operator");
//         }
//     }
// }
//-----------------------leap year---------------
public class Conditional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + "is leap year.");
                }
            }
        }
        else{
            System.out.println(year +" is not a leap year");
        }
        
    }
}