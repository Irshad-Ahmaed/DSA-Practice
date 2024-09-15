public class Pascals_Triangle {
    public static void main(String[] args) {
//        Variety 1: ----------------
//        Q: You have give row number and element number of this row, you have to find the value of element
        // nCr = n!/(r!*(n-r)!)
//        int n = 4;
//        int r = 3;
//
//        int res = 1;
//        for (int i=1; i<r; i++){
//            res = res * (n-i);    // n!/(r!*(n-r)!) => (n-i) length == r length
//            res = res / (i);    // If r = 3, then (n-i) == 3
//        }
//        System.out.println(res);

//        Variety 2: -----------------------

//        int n = 4;
//        int res = 1;
//        System.out.print(res + " ");
//        for (int i=1; i<n; i++){
//            res = res * (n-i);
//            res = res / i;
//            System.out.print(res + " ");
//        }

//        Variety 3: Optimal Approach: ------------------------------
        int n = 4;
        int res = 1;

        for (int i=1; i<=n; i++){
            res = 1;
            int[] temp = new int[i];
            temp[0] = res;

            for (int j=1; j<i; j++){
                res = res * (i-j);
                res = res / j;
                temp[j] = res;
            }

            for (int k=0; k<i; k++){
                System.out.print(temp[k] + " ");
            }
            System.out.println();
        }

    }
}
