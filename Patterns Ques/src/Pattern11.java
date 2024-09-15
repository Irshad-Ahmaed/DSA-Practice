public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

//        PATTERN 1

//        for (int i=0; i<n; i++){
//            char x = 'A';
//            for (int j=0; j<=i; j++){
//                System.out.print(x + " ");
//                x++;
//            }
//            System.out.println();
//        }

//        PATTERN 2

//        for (int i=0; i<n; i++){
//            for (char j='A'; j <= 'A'+(n-i-1); j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


//        PATTERN 3

        for (char i= 'A'; i< 'A' + n; i++){
            for (char j='A'; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
