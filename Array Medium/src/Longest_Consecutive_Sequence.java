import java.util.*;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {4,100,1,102,101,3,2,1,1};
        int n = arr.length;

//        Brute Force: ----------------------------------

//        int maxLen = 1;
//        for (int i=0; i<n; i++){
//            int x = arr[i];
//            int count = 1;
//            int j=0;
//            x++;
//            while (j<n){
//                if (arr[j] == x){
//                    x++;
//                    count++;
//                    j=-1;
//                }
//                j++;
//            }
//            maxLen = Math.max(maxLen, count);
//        }
//        System.out.print(maxLen + " ");

//        Better Approach: -----------------------------

//        int maxLen = 1;
//
//        Arrays.sort(arr);
//        int i = 0;
//        int count = 0;
//        int x= arr[0];
//        while (i<n){
//            if (arr[i] == x){
//                count++;
//                x++;
//                maxLen = Math.max(maxLen, count);
//                i++;
//            } else if (arr[i] == arr[i - 1]) {
//                i++;
//            } else {
//                count = 0;
//                x = arr[i];
//            }
//        }
//        System.out.print(maxLen + " ");

//        Optimal Approach: -------------------------
        int maxLen = 1;

        Set<Integer> set = new HashSet<>();

        for (int i: arr){
            set.add(i);
        }

        for (int i: arr){
            if (!set.contains(i-1)){
                int count = 1;
                int x = i;

                while (set.contains(x+1)){
                    x++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        System.out.print(maxLen + " ");

    }
}
