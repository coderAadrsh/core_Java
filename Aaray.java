// import java.util.*;
// public class Aaray {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Size of array:");
//         int n=sc.nextInt();
//         //array decelaration
//         int marks[]=new int[n];
//         for(int i=0;i<n;i++){
//             //input in array
//         marks[i]=sc.nextInt();

//         }
//         for(int j=0; j<n;j++){
//             //output in array
//             System.out.println(marks[j]);
//         }

//     }
// }
//linear search
public class Aaray{
    public static int LinearSearch(int arry[],int search){
        for(int i=0;i<arry.length;i++){
            if(arry[i]==search){
                
                return i;

            }
            
        }
        return -1;
        
               
            
    }
    //function of largest element in array
    public static void largest( int arry[]){
        int larg=Integer.MIN_VALUE;
 
        
        for(int i=0;i<arry.length;i++){
            
            if(larg<arry[i]){
                larg=arry[i];

            }
            
             
             

        }
        System.out.println(larg);
    
       
       

    }
    //function of binary search
    public static int binarySearch(int arry[],int key){
        int start=0;
        int end=arry.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arry[mid]==key){
             return mid; 
             
            }
            else if(arry[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;

    }
    //function of print reverse an array
    public static void  reverseArray(int arry[]){
        int first=0; 
        int last=arry.length-1;
        while(first<last){
            //swap
            int temp=arry[last];
            arry[last]=arry[first];
            arry[first]=temp;
            first++;
            last--;
        }


        
        
            
        }
        //PRINT  PAIR OF ARRAY
        public static void pairArray(int arry[]){
            for(int i=0;i<arry.length;i++){
                for(int j=i+1;j<arry.length;j++){
                    System.out.print("("+arry[i]+","+arry[j]+")"+" ");
                }
                System.out.println();
            }
        }
        //PRINT SUB ARRAY
        public static void subArray(int arry[]){
            int tp=0;
            int sum=0;
            for(int i=0;i<arry.length;i++){
                int start=i;
                
                 for(int j=i;j<arry.length;j++){
                    int end=j;

                    for(int k=start;k<=end;k++){
                    System.out.print(arry[k]+" ");
                    sum= sum+arry[k];
                    
                    

                    
                        
                    }

                      System.out.print("sum="+sum+") ");
                      tp++;
                      sum=0;

                    
                    
                }
                System.out.println();
            }
            System.out.println("Total number of subarray:"+tp);
        }


        //--------------------------------------------------------ARRAY PART 2----------------------------------------------------

        //PRINT MAX SUB ARRAY timecomplexity n3
        public static void maxSubArray(int arry[]){
            int sum=0;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arry.length;i++){
                for(int j=i;j<arry.length;j++){
                    for(int k=i;k<=j;k++){
                       
                        
                     sum+=arry[k];
                        
                     if(maxsum<sum){
                        maxsum=sum;
                        
                            
                    }
                    
                   
                }
                
                    
                    
                sum=0;
                    
                
               
            }
            
        
            
            
        }
        System.out.println("="+maxsum);
    }
    
    //PRINT MAX SUB ARRAY using prefix array time complexity=n2
        public static void maxSubArrayTime(int arry[]){
            int sum=0;

            
            int newArry[]=new int[arry.length];
             newArry[0]=arry[0];
            
            int maxsum=Integer.MIN_VALUE;
            for(int i=1;i<newArry.length;i++){
                newArry[i]=newArry[i-1]+arry[i];
                System.out.print(newArry[i]+" ");
            }

            for(int i=0;i<arry.length;i++){
                for(int j=i;j<arry.length;j++){
                    sum=i==0?newArry[j]:newArry[j]-newArry[i-1];//ternary operator

                   if(maxsum<sum){
                    maxsum=sum;
                    
                  }
                    
                  

                }
                
                    
                
                    
               
        }
        System.out.println(maxsum);
            
        
            
               }
        
    //Print max Subarray(kadane's Algorithm)time complexity=n
    public static void kadanalgo(int arry[]){
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;
        boolean ispostive=false;
        for (int i=0;i<arry.length;i++){
            if(arry[i]>0){
                ispostive=true;
                break;

            }

        }
        if(ispostive==true){
        for(int i=0;i<arry.length;i++){
            currentSum+=arry[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxsum=Math.max(maxsum, currentSum);
            }
            System.out.println(maxsum); 
        }
        else{
            for(int i=0;i<arry.length;i++){
                currentSum+=arry[i];
                maxsum=Math.max(currentSum,maxsum);
            }
            System.out.println(maxsum);
        }
        }



    //DSA question no.22:-trapping rainWater
    public static int trapping(int height[]) {
        //calculate left max boundry
        

        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
            
            }

        //calculate right max boundry
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){

              rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }  
        //loop
        //waterLevel=min(leftMax,rightMax)
        //trappedWater=(waterlevel-height)*width


        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        

        }
        return trappedWater;
         
        
    }

    //SELL & BUY STOCKS
    public static void stocks(int price[]){
     int   minBuyPrice=Integer.MAX_VALUE;
     int maxProfit=0;
    
     

     for(int i=0;i<price.length;i++){
        if(minBuyPrice<price[i]){
            int profit=price[i]-minBuyPrice;
            maxProfit=Math.max(maxProfit,profit);
            
        }
        else{
            minBuyPrice=price[i];
        }
     }
     System.out.println(maxProfit);

     
    } 


    //hw
    public static boolean twice(int arr[]){
        
        
        for(int i=0;i<arr.length;i++){
            int find=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(find==arr[j]){
                    return true;
                    
                }
               
                
            }

            }
            
            return false;
        }

        // //optimize code
        // public static boolean optimizeTwice(int arr[]){
        //     int n=arr.length-1;
        //     while (n>=0) {
        //         int find=arr[n];
        //         if(find==arr[n)
        //     }
        // }
    
        //Question:2
        public static int rotared(int search, int num[]){
               
        int target=search;
        int left=0;
        int right=0;
        //find left boundry
        for(int i=0;i<num.length;i++){
            if(num[i]>target){
                left=i ;
            }
        }
         //find right boundry
        for(int i=num.length-1;i<=0;i--){
            if(num[i]>target){
                right=i ;
            }
        }
        //find mid
     
        for(int i=0;i<num.length;i++){
        int mid=(left+right)/2;
        if(num[mid]==target){
            return i;
        }
        else if(num[mid]>target){
            left=mid+1;
        }
        else{
            right=mid;
        }
       
        }


        return -1;
    }
 
     



    
    public static void main(String[] args) {
    //     //FUNCTION CALL FOR LINEAR SEARCH
    //     int arry[]={10,50,30,80,90};
       
       
    //     int search=91;
    //    int result= LinearSearch(arry, search);
    //    if(result==1){
    //     System.out.println("item is found");

    //    }
    //    else{
    //     System.out.println("does not found");
    //    }
    //    //FUNCTION CALL FOR LARGEST ELEMENT IN  ARRAY
    //    largest(arry);
    //    //FUNCTION CALL FOR BINARY SEARCH
    //    int bin[]={1,2,3,4,5,6,7};
    //    int key=10;
    //    System.out.println("item is found at index:"+" "+binarySearch(bin, key));
    //    //function call for reverse array
    //    reverseArray(bin);
    //    for(int i=0;i<bin.length-1;i++){
    //     System.out.print(bin[i]+" ");
    //    }
    //    //function call for pair of array
      //int number[]={-1,-2,-3,-4};
    //    System.out.println();
     //  pairArray(number);
//-------------------------------------------array part :2--------------------------
 //function call of max sub array
     int number[]={-2,-3,-4,1};
    //  maxSubArray(number);
    //  subArray(number);
    //    maxSubArrayTime(number);
        kadanalgo(number);
    // int height[]={4,2,0,6,3,2,5};
    //   System.out.println(trapping(height) ); 
    //   int price[]={7,1,5,3,6,4};
    // stocks(price);


    // System.out.println(twice(price));
     
// int num[]={4,5,6,0,1,2,3};
// int search=0;
// System.out.println( rotared(search,num));
 }

}


