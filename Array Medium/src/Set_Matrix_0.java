import java.io.StringWriter;

public class Set_Matrix_0 {
    public static void main(String[] args) {
        int[][] arr = {{3,7,2,8,2},{2,2,4,1,8},{0,5,7,6,3},{8,1,0,7,7},{1,3,7,4,1},{6,5,5,6,3},{7,1,0,1,9},{5,4,4,9,7},{2,2,4,1,0},{7,1,1,9,1},{8,0,4,7,6}};
        int n = arr.length;
        int m = arr[0].length;

//        Better Approach: --------------------------------
//        int[] row = new int[n];
//        int[] col = new int[m];
//
//        for (int i=0; i<n; i++){
//            for (int j=0; j<m; j++){
//                if (arr[i][j] == 0){
//                    row[i] = 1;
//                    col[j] = 1;
//                }
//
//            }
//        }
//        for (int i=0; i<n; i++){
//            for (int j=0; j<m; j++){
//                if (row[i]==1 || col[j]==1){
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i=0; i<n; i++){
//            System.out.print("[");
//            for (int j=0; j<m; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.print("]");
//        }

//        My Approach: ---------------------------------
//        Problem occur when arr[0].length>9;

//        String store = "";
//        int x = 0;
//        for (int i=0; i<n; i++){
//            for (int j=0; j<m; j++){
//                if (arr[i][j] == 0){
//                    store += i;
//                    store += j;
//                }
//            }
//            if (i>8){
//                break;
//            }
//        }
//        String store2Dig = "";
//        for (int i=10; i<n; i++){
//            for (int j=0; j<m; j++) {
//                if (arr[i][j] == 0) {
//                    store2Dig += i;
//                    store2Dig += j;
//                }
//            }
//        }
////
////        System.out.println(store);
//        for (int i=0; i<store.length(); i++){
////
//            int val = store.charAt(i)-'0';
//
//            if (i%2 == 0){
//                System.out.print("row: " + val + " ");
//                for (int j=0; j<m; j++){
//                    arr[val][j] = 0;
//                }
//            }else {
//                System.out.print("col: " + val + " ");
//                for (int j = 0; j < n; j++) {
//                    arr[j][val] = 0;
//                }
//            }
//        }
//        if (store2Dig.length() != 0) {
//            int cal = (store2Dig.length() / 2) + 2;
//            for (int i = 0; i < cal - 1; i++) {
//                if (i % 2 == 0) {
//                    int val = Integer.parseInt(store2Dig.charAt(i) + "" + store2Dig.charAt(i + 1));
//                    System.out.print("row: " + val + " ");
//                    for (int j = 0; j < m; j++) {
//                        arr[val][j] = 0;
//                    }
//                } else {
//                    int val = store2Dig.charAt(i + 1) - '0';
//                    System.out.print("col: " + val + " ");
//                    for (int j = 0; j < n; j++) {
//                        arr[j][val] = 0;
//                    }
//                }
//            }
//        }
//        for (int i=0; i<n; i++){
//            System.out.print("[");
//            for (int j=0; j<m; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.print("]");
//        }

//        Optimal Approach: -----------------------------------------



    }
}
