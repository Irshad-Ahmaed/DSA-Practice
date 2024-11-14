import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {10,5,9,1,11,8,6,15,3,12,2};

        HashMap<Integer, Boolean> mpp = new HashMap<>();

//        First assume all elements are consecutive
        for (int val: arr){
            mpp.put(val, true);
        }

//        Now check if element are really consecutive, if they have their previous value in map
        for (int val: arr){
            if (mpp.containsKey(val-1)){
                mpp.put(val, false);
            }
        }

        int maxLen = 0;

        for (int i=0; i< arr.length; i++){
//        Only checking for element which are true in map
            if (mpp.get(arr[i])){
                int len = 1;
                System.out.println(arr[i]);
                while (mpp.containsKey(arr[i] + len)){
                    len++;
                }
                if (len>maxLen) maxLen = len;
            }
        }

        System.out.println("maxLen " + maxLen);
    }
}
