import java.util.ArrayList;

public class Missing_Num {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

//        Brute Force Approach: ----------------------

//        for (int i=0; i<arr.length; i++){
//            int flag = 0;
//            for(int j=0; j<arr.length; j++){
//                if (arr[i] == j){
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0){
//                System.out.println(i);
//            }
//        }
//        ----------------------------------------------

//        Better Approach:

//        int hash[] = new int[arr.length+1];
//
//        for (int i=0; i<arr.length; i++){
//            hash[arr[i]]++;
//        }
//
//        for (int i=0; i<= arr.length+1; i++){
//            if (hash[i] == 0){
//                System.out.println(i);
//                break;
//            }
//        }

//        ------------------------------------------------
//        Optimal Approach-1:

//        int sum = arr.length*(arr.length+1)/2;
//        int arrSum = 0;
//        for (int i=0; i<arr.length; i++){
//            arrSum += arr[i];
//        }
//        System.out.println(sum-arrSum);

//        Optimal Approach-2: -------------------------

        int Xor1 = 0;
        int Xor2 = 0;

        for(int i=0; i<arr.length; i++){
            Xor1 = Xor1 ^ arr[i];
            Xor2 = Xor2 ^ (i+1);
        }

        System.out.println(Xor1 ^ Xor2);
    }
}
