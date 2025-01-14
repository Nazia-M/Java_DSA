package arrayPrograms;

public class Sum2DigitsIs0 {

    public static void main(String[] args) {


        int a[]= {-5,-4,-3,-2,0,2,4,6,8};   //Array index starting with 0
        int len=a.length;                        //Array length = 9

        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(a[i]+a[j] == 0)
                    System.out.println("a[i] "+a[i]+" a[j] "+a[j]+" a[i]+a[j]:"+(a[i]+a[j]));
            }
        }


//        int i=0, j=len-1;
//        //boolean found = false;
//        while(i<j){
//            System.out.println("-----a[i] "+a[i]+" a[j] "+a[j]);
//
//            if(a[i]+a[j]==0){
//                System.out.println("a[i] "+a[i]+" a[j] "+a[j]+" Sum is a[i]+a[j]:"+(a[i]+a[j]));
//               // found = true;
////                break;
//            }
//            if(j==(i+1)){
//                i++;
//                j=len-1;
//            }
//            j--;
//        }





        }
}

