import java.util.*;
public class Longest_SubArray {
    public static void main(String[] args) {
        int[] arr = {8, 15, 17, 0, 11};
        int x = 17;

//        Brute Force :-----------------------------------
//        int len = 0;
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=i; j< arr.length; j++){
//                int sum = 0;
//                for (int k=i; k<=j; k++){
//                    sum += arr[k];
//                }
//                if (sum == x){
//                    if (j-i+1 < arr.length && len < j-i+1){
//                        len = j-i+1;
//                    }
//                }
//            }
//        }
//        System.out.println(len);

//        Little Better than Brute Force:----------------------------------

//        int len = 0;
//        for (int i=0; i<arr.length; i++){
//            int sum = 0;
//            for (int j=i; j< arr.length; j++){
//                sum += arr[j];
//                if (sum == x){
//                    if (len < j-i+1 && j-i+1 < arr.length){
//                        len = j-i+1;
//                    }
//                    if (arr[j+1] != 0){
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(len);

//        Better Approach || Optimal Approach for +ve & -ve numbers: ------------------------------------

//        int maxLen = 0;
//        int sum =0;
//        Map<Integer, Integer> preSumMap = new HashMap<>();
//
//        for (int i=0; i<arr.length; i++){
//            sum += arr[i];
//
//            if (sum == x){
//                maxLen = Math.max(i+1, maxLen);
//            }
//            int remain = sum - x;
//
//            if (preSumMap.containsKey(remain)){
//                int len = i - preSumMap.get(remain);
//                maxLen = Math.max(len, maxLen);
//            }
//
//            if (!preSumMap.containsKey(sum)){
//                preSumMap.put(sum,i);
//            }
//
//        }
//        System.out.println(maxLen);

//        Optimal Approach for all +ve num:------------------------------

        int n= arr.length;
        int sum = arr[0];
        int len = 0;
        int i = 0;
        int j = 0;
        while (i<n){
            while (sum > x){
                sum -= arr[j];
                j++;
            }

            if (sum == x){
                len = Math.max(len, i-j+1);
            }

            i++;

            if (i<n) sum += arr[i];
        }
        System.out.println(len);
    }
}
