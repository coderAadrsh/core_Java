import java.util.*;
public class Array2D {
    public static int finder(int search ,int matrix[][]){
        
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==search){
                    System.out.println("item is fond at row of "+ i + "and colmn of"+ j);
                }
            }
        }
        return -1;
    }





    public static void sprileMatrix(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startColumn=0;
        int endColumn=matrix[0].length-1;
        while(startRow <=endRow && startColumn <=endColumn){
         //top
            for(int j=startRow;j<=endColumn;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
         //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

         //bottom
            for(int j=endColumn-1;j>=startColumn;j--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
        //left
            for(int i=endRow-1;i>=startRow+1;i--){
               
                if(startRow==endRow){
                    break;
                }
                 System.out.print(matrix[i][startColumn]+" ");
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;

       }
}

//function of diagonal sum.timecomplexity O(n^2)
  public static void diagonalSum(int matrix[][]){
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        // for(int j=0;j<matrix[0].length;j++){
        //     if(i==j ){
                
        //         sum+=matrix[i][j];
        //     }
        //     else if(i+j==matrix.length-1){
        //         sum+=matrix[i][j];
        //     }
        //  }
     //timecomplexity is O(n)   
        //calculate PD.
        sum+=matrix[i][i];
        //calculate SD.
        if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
        }
    }
    System.out.println("diagonal sum is:"+ sum);

  }
  public static boolean sortedMatrix(int matrix[][],int key){
    int n=0;
    int m=matrix[0].length-1;
    while(n<matrix.length && m>=0){
        if(matrix[n][m]==key){
            System.out.println("found");
            return true;
        }
        //move left

        else if(matrix[n][m]>key){
            m--;

            
        }
        //move bottom
        else if(matrix[n][m]<key){
            n++;
        }
        
        
    }
    System.out.println("not found");
    return false;
  }


        public static void main(String[] args) {
        int matrix[][]={{1,2,3,10},
        
                        {4,5,6,30},
        
                        {7,8,9,50},
        
                        {10,11,12,70}
        
                        };
    //     Scanner sc=new Scanner(System.in);
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             matrix[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //           System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    
    // int search=sc.nextInt();
    // finder(search,matrix);
   // sprileMatrix(matrix);
   // diagonalSum(matrix);
    sortedMatrix(matrix, 70);

           
    
    
}
}
