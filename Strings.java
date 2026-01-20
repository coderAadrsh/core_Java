 import java.util.*;
 public class Strings {
    //PRINT NUMBER IS PALINDROME
    public static boolean palindrome(String str){
        int start=0;
        int last=str.length()-1;
        while(start<last){
            if(str.charAt(start)!=str.charAt(last)){
                return false;
            }
            
          start++;
          last--;

        }
        return true;

    }
        //PRINT NUMBER IS PALINDROME

    public static boolean palindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    //FIND SHORTEST PATH
    public static void shortpath(String str){
        int x=0;
        int  y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='E'){
                x++;

            }
            else if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
        }


        
      float Path=(float)Math.sqrt(((x*x)+(y*y)));
      System.out.println(Path);


    }

    //COMPARISION OF TWO STRING  and use equal() function
    public static void comparisionString(   ){
        String s1="tony";
        String s2="tony";//s2 point s1 then is return true it does not create a new string.
        String s3=new String("tony");//it creates a new string.then it return false when do we use double equal to (==)operator.
        // if(s1==s2){//(==) operator check both are same on object level or not.
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        // if(s1==s3){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        if(s1.equals(s3)){//it  checks on value level and gives a boolean value.
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        
    }
    //SUBSTRING : Same as arraysubstring.
    public static void subString(String str,int si,int ei){
        String newSub="";
        for(int i=si;i<ei;i++){
            newSub+=str.charAt(i);

        }
        System.out.println(newSub);
    }
    //SUBSTRING USING STRING BUILDER.
    public static void stringBuilder(String str ,int si,int ei){
        StringBuilder sb=new StringBuilder("");
        for(int i=si;i<ei;i++){
            char ch=str.charAt(i);
            sb.append(ch);

        }
        
        System.out.println(sb.toString());
    }
    // find largest sting in lexicography order.
    public static void compareString(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
           if( largest.compareToIgnoreCase(fruits[i])<0){
            largest=fruits[i];

           }          
         }
         System.out.println(largest);
    }
    //First letter od each word to uppercase.
        public static void main(String[] args){
        //String str ="WNEENESENNNNNN";
        //System.out.println( palindrome(str));
        //System.out.println( palindrom(str));
        //shortpath(str);
        //comparisionString();
       // subString("helloWorld", 3, 5);
       stringBuilder("helloWorld",3,5);
    //    String fruits[]={"apple","mango","banana","apple"};
    //    compareString(fruits);
    //    upperLetter("hi, i am adarsh");
    }}

        
