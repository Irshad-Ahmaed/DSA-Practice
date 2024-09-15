import java.util.*;
public class Result_Of_2_Num {
    public static void findK(int[] arr, int k) {
        int n = arr.length-1;

//        Brute Force: ------------
//        for (int i=0; i<n; i++){
//            for (int j=i+1; j<=n; j++){
//                if ((arr[i] + arr[j]) == k){
//                    System.out.println("index are: " + i +" "+ j);
//                }
//            }
//        }
//        --------------------------
//                Better Approach:

        Map<Integer,Integer> subArrStore = new HashMap<>();
        subArrStore.put(arr[0], 0);

        for (int i = 1; i<=n; i++){
            int val = k-arr[i];

            if (subArrStore.containsKey(val)){
                System.out.println("key is: " + subArrStore.get(val) + ", " + i);
                return;
            }

            if (!subArrStore.containsKey(arr[i])){
                subArrStore.put(arr[i], i);
            }
        }

        System.out.println("k doesn't exist: " + -1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,7};
        int k = 10;

        findK(arr, k);
    }
}
