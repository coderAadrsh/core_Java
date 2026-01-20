public class AdvancePattern {
    public static void wholeSquare(){
        for(int i=0;i<=4;i++){
            int row=i;
            for(int j=0;j<=4;j++){
                int col=j;
                if(col==0||row==4||row==0||col==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void pramid(){
        for(int i=0;i<=4;i++){
            int row=i;
            for(int j=0;j<=4;j++){
                int col=j;
                if(col==2||row==4||row==0||col==row ||row+col==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
     public static void butter(){
        for(int i=0;i<=4;i++){
            int row=i;
            for(int j=0;j<=4;j++){
                int col=j;
                if(col==0||col==4||row==2||col==row ||row+col==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      //  wholeSquare();
      //  pramid();
      butter();
        
    }

}
