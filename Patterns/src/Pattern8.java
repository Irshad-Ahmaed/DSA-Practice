public class Pattern8 {
    public static void main(String[] args) {
        int n= 5;

        int start = 1;

        for (int i=0; i<n; i++){
//            for (int j=0; j<=i; j++){
//                if ((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
//                    System.out.print("1");
//                }
//
//                if ((i%2!=0 && j%2==0) || (i%2==0 && j%2!=0)){
//                    System.out.print("0");
//                }
//            }
//            System.out.println();

//            OR

            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j=i; j>=0; j--){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
}
