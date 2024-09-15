import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,2,4,2,2};
        int n = arr.length;

//          Better Approach: ------------------

//        Map<Integer,Integer> mapp = new HashMap<>();
//
//        for (int i=0; i<n; i++){
//            int val = mapp.getOrDefault(arr[i], 0);
//            mapp.put(arr[i], val+1);
//        }
//
//        for (Map.Entry<Integer, Integer> it: mapp.entrySet()){
//            if (it.getValue() > (n/2)){
//                System.out.println(it.getKey());
//            }
//        }

//        Optimal Approach: ------------------------

        int i = 0;
        int count = 0;
        int ele=0;
        while (i<n){
            if (count == 0){
                ele = arr[i];
                count++;
            } else if (ele == arr[i]){
                count++;
            }
            else {
                count--;
            }
            i++;
        }

        int check = 0;
        for (int j: arr){
            if (j == ele) check++;
        }

        if (check > n/2){
            System.out.println(ele);
        }

    }
}
