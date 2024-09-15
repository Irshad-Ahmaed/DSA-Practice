public class Pattern4 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n; i++){
//            for (int y=0; y<2*n+1; y++){
//                int mid = (2*n+1)/2;
//
//                if (i>=1 && y >= mid-i && y <= mid+i){
//                    System.out.print("*");
//                } else if (y == mid) {
//                    if (i == 0){
//                        System.out.print("*");
//                    }
//                } else {
//                    System.out.print(" ");
////                    System.out.print("0");
//                }
//
//            }
//            System.out.println();


//            OR

            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
