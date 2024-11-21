package patternPrograms;

public class RightTraingleStart {
    public static void main(String[] args) {


//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }


//        for(int i=1;i<=4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//
//        for(int i=4; i>=1; i--)       //Rows
//        {
//            for(int j=1 ;j<=i; j++)      //Columns
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i=1; i<=4; i++)
//        {
//            for(int j=4 ;j>=i; j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//            for(int i=1;i<=4;i++){
//
//                for(int j=4;j>=i;j--){
//                    System.out.print("  ");
//                }
//                for(int k=1;k<=i;k++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }


//        for(int i=1;i<=4;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print("  ");
//            }
//
//            for(int k=4;k>=i;k--){
//                System.out.print("* ");
//            }
//
//
//            System.out.println();
//
//        }




//        for(int i=1;i<=4;i++){
//            for(int j=3;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int k=3;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        for(int i=1;i<=4;i++){
//
//            for(int j=4;j>=1;j--){
//                if(j>i)
//                    System.out.print(" ");
//                else
//                    System.out.print(" *");
//            }
//            System.out.println();
//        }


        for(int i=1;i<=4;i++){

            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=5;i>=1;i--){

            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
