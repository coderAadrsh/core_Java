// //PRINT STAR PATTERN
// public class patterns1 {
//     public static void main(String[] args) {
//         //first loop define number of lines
//         for(int i=1;i<=4;i++){
//             //second loop define number of star in line
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//                         System.out.println();

//         }
//     }
// }
// //PRINT INVERTED-STAR PATTERN
// public class patterns1 {
//     public static void main(String[] args) {
//         int n=4;
//         //first loop define number of lines
//         for(int i=1;i<=n;i++){
//             //second loop define number of star in line
//             for(int j=1;j<=n-i+1;j++){

//                 System.out.print("*");
//             }
//                         System.out.println();

//         }
//     }
// }
// //print half pyramid pattern

// public class patterns1 {
//     public static void main(String[] args) {
//         //first loop define number of lines
//         for(int i=1;i<=4;i++){
//             //second loop define number of star in line
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//                         System.out.println();

//         }
//     }
// }
//PRINT CHARACTER PATTERN

public class patterns1 {
    public static void main(String[] args) {
        char ch='A';
        //first loop define number of lines
        for(int i=1;i<=4;i++){
            //second loop define number of star in line
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
                        System.out.println();

        }
    }
}