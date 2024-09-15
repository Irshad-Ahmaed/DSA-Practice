public class Rotate_Arr_90deg {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};


//        Brute Force:--------------------------------
//        int[][] temp = new int[4][4];
//        for (int i=0; i<4; i++){
//            for (int j=0; j<4; j++){
//                temp[j][4-1-i] = arr[i][j];
//            }
//        }
//
//        for (int i=0; i<4; i++){
//            System.out.print("[");
//            for (int j=0; j<4; j++){
//                System.out.print(temp[i][j] + ",");
//            }
//            System.out.print("]");
//        }

//        Optimal Approach: --------------------------------

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr[0].length; j++){

                int val = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = val;

            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length/2; j++){

                int val = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = val;

            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print("[");
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("]");
        }

    }
}
