import java.util.Scanner;

// public class functional{
//     public static void printHelloWorld(){
//         System.out.println("Hello World!");
    

//     }
//     public static int calculateSum(int a,int b){
//         int sum=a+b;
//         return sum;
    
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(calculateSum(a,b));
//         printHelloWorld();
         
//     }
// }

// //function always work call by value 

// //FACTORIAL OF  A NUMBER ,N/
public class functional {

    

    public static int fact(int n){
        int result=1;
        if(n<0){
            System.out.println("negative number factorial does not exist.");

        }
        else if(n==0){
            System.out.println("0!=1");
        }
        else{
        for(int i=1;i<=n;i++){
            result=result*i;

        }
        
        }
        return result;
    }
    //binomial coefficient
    public static int bincoeff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nr=fact(n-r);
        int bincoeff=fact_n/(fact_r*fact_nr);
        return bincoeff;

    }
    //prime number
    public static boolean  Primeno(int n){
        boolean isprime=true;
        if(n==2){
            isprime=true;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
            else{
                isprime=true;
            }
        }
        }
        return isprime;
    }
    //print all primes in a range
    public static int primeRange(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            

            if(Primeno(i)){
                System.out.print(i+",");
                count++;


            }
            
        }
        return count;
    }
    //convert from binary to decimal
    public static int binToDec(int n){
        int new_num=n;
        int pow=0;
        int decimal=0;
        while(new_num>0){
            int last_digit=new_num%10;
            decimal=decimal+(last_digit*(int)Math.pow(2,pow));
            pow++;
            new_num/=10;

        }
        return decimal;

    }
    //convert decimal to binary.
    public static void decToBin(int n){
        int a=n;
        int bin=0;
        int pow=0;
        while(a>0){
          int  rem=a%2;
          bin=bin+(int)(rem*Math.pow(10,pow));
          pow++;
          a/=2;


        }
        System.out.println(bin);


    }
    

     public static void main(String[] args) {
       // System.out.println(bincoeff(5,2 ));
       // System.out.println(Primeno(10));
       // System.out.println("Total number of prime between 2 to n:"+ primeRange(100));
       //System.out.println(binToDec(101));
       decToBin(7);
    }
}
