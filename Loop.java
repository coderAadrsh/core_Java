// //-----------------while loop--------------
// import java.util.*;
// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n=sc.nextInt();
//         int count=1;
//         int sum=0;
//         while(count<=n){
//             sum=sum+count;
//             System.out.println(count);
//             count++;

//         }
//         System.out.println("-----------------------------");
//         System.out.println("total sum is:"+ sum);
//     }
    
// }

// //-----------------for loop--------------
// import java.util.*;
// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
            
//         }
         
//     }
    
// }


// //-------------------reverse number-------------
// public class Loop{
//     public static void main(String[] args) {
//         int number=123;
//         int reverse=0;
//         while(number>0){
//             int unit=number%10;
//             reverse=(reverse*10)+unit;
//             number/=10;
//         }
//         System.out.println(reverse);
//     }
// }

// --------------DO-WHILE LOOP----
import java.util.*;
class Loop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("exit for give any number multiple of 10.");
            System.out.print("enter any number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            if(n%3==0){
                
                System.out.println("we skip the multiple of 3");
                continue;
            }
            System.out.println(n);
            n++;
        }while(true);
    }
}

