public class Bits {
    //function of check Even or odd.
    public static void evenOrOdd(int n){
        int bitMask=1<<0;
        if((n & bitMask)==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
    //function of get iTh bit.
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        return n&bitmask;
    }
    //function of set ith bit.
    public static int setIthBit(int n ,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    //function of clear ith bit.
    public static int clearithBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    //update ith bit
    public static int updateithBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return(clearithBit(n, i));
        // }
        // else{
        //     return(setIthBit(n, i));
        // }
        n=clearithBit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    //clear last i bits.
    public static int clearLastIthBit(int n,int i){
        int bitMask=(-1)<<i;
        return n&bitMask;
        
    }
    //clear range(i,j) of bits
    public static int clearRangeBits(int n,int i,int j){
        int bitMask_a=((~0)<<(j+1));
        int bitmask_b=(1<<i)-1;
        int final_bitMask=bitMask_a|bitmask_b;
        return n&final_bitMask;
    }
    //Question 2:
    public static boolean powerTwo(int n){
        return ((n&(n-1))==0);
        

        // if((num&(num-1))==0){
        //     return true;
        // }
        // return false;
    }
    //Question 3: count number of set bits.
     public static int countSetBit(int n){
        int count=0;

        while(n>0){
            if((n&1)!=0){
                count++;
            }
         n=n>>1;

        }
     return count;

     }
     //question 4:fast exponentions

    // ----------------------------------------------------------//assignment Question-----------------------------------------------
    //Q1: what is value of x^x for any value of x?: ans-0 because XOR gives 0 when boths bits are same.
    //Q2:Swap two variable without using third variable.
    public static void swapTowVar(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
    System.out.println( "x is:"+x+" "+" y is:"+y);

}

    


    public static void main(String args[]){
        // evenOrOdd(10);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearithBit(10, 2));
        // System.out.println(updateithBit(10, 2, 0));
        // System.out.println(clearLastIthBit(15, 2));

        // System.out.println(clearRangeBits(2515,2,7));
        // System.out.println(powerTwo(4));
        // System.out.println(countSetBit(10));
        // System.out.printl(5&6);
        // System.out.println(5|6);
        swapTowVar(3, 4);
        // System.out.println(~6);
        
    }
    
}
