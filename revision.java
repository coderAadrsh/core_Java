// //--------------------------------------2D Array-------------------------------------------------------
// import java.util.*;
// public class revision {
//     public static void spiral(int matrix[][]){
//         int startRow=0;
//         int endRow=matrix.length-1;
//         int startCol=0;
//         int endCol=matrix[0].length-1;
//         while (startRow<=endRow && startCol<=endCol) {
//             //top
//             for(int j=startRow;j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             }
//             //right
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(matrix[i][endRow]+" ");
//             }
//             //bottom
//             for(int j=endCol-1;j>=startCol;j--){
//                 System.out.print(matrix[endRow][j]+" ");
//                 if(startCol==endCol){
//                     break;
//                 }
//             }
//             //left
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 System.out.print(matrix[i][startCol]+" ");
//                 if(startRow==endRow){
//                     break;
//                 }
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
        
//     }
//     //print sum of seccond row in two dimensional array.
//     public static void SecondArray(int matrix[][]){
//       int   sum=0;
//       for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(i!=1){
//                 continue;
//             }
//             sum+=matrix[i][j];

//         }
//       }
//       System.out.println(sum);

//     }
//     //print sum of nth number row in two dimensional array.

   
// public static void SecondArray(int matrix[][],int row){

//       int   sum=0;
      
//       for(int j=0;j<matrix[0].length;j++){
//         sum+=matrix[row][j];
        
//       }
//       System.out.println(sum);


//     }
//     //print transpose matrix.
//     public static void transposeMatrix(int matrix[][]){
//         int newMatrix[][]=new int[matrix.length][matrix[0].length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 newMatrix[j][i]=matrix[i][j];
//             }
//         }
//          System.out.println("transpose matrix is:");
//         display(newMatrix);
        
        
//     }
// public static void display(int matrix[][]){
//     for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
// }
    
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         //create 2D array
//         //int matrix[][]=new int[4][4];
//         int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//        // spiral(matrix);
//     //    System.out.print("enter row no. want to add:");
//     //    int row=sc.nextInt();
//     //    SecondArray(matrix,row);
//     transposeMatrix(matrix);
   
    
//     System.out.println("actual matrix");    
//     display(matrix);
//         // //input
//         // for(int i=0;i<matrix.length;i++){
//         //     for(int j=0;j<matrix[0].length;j++){
//         //         matrix[i][j]=sc.nextInt();
//         //     }
//         // }
//         //output
        
        
//     }
// }
// //--------------------------------------------------------------String revision-------------------------------------------------
public class revision{
    // Q1:
    // palindrome  string
    public static  boolean palindromString(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    // Q2:find shortest path to reach the destination.
    public static void sortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='E'){
                x+=1;
            
            }
            else if(ch=='W'){
                x-=1;
            }
            else if(ch=='N'){
                y+=1;
            }
            else if(ch=='S'){
                y-=1;
            }
        }
        float shortpath=(float)(Math.sqrt((x*x)+(y*y)));
        System.out.println(shortpath);
    }

    public static void main(String[] args){
        String str="WNEENESENNN";
        sortestPath((str));
        

    }
}
