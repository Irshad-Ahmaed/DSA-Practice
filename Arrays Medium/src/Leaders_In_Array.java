import java.util.*;

public class Leaders_In_Array {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int n = arr.length;

//        Brute Force Approach: ------------------------------------

//        ArrayList<Integer> temp = new ArrayList<>();
//
//        for (int i=0; i<n; i++){
//            int trigger = -1;
//            for (int j=i+1; j<n; j++){
//                if (arr[i] < arr[j]){
//                    trigger = 0;
//                    break;
//                }
//            }
//            if (trigger == -1){
//                temp.add(arr[i]);
//            }
//        }
//
//        System.out.println(temp);

//        Optimal Approach: ---------------------------

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=n-1; i>=0; i--){
            if (temp.isEmpty()){
                temp.add(arr[i]);
            } else if (arr[i] > temp.getLast()) {
                temp.add(arr[i]);
            }
        }
        temp.sort(Collections.reverseOrder());
        System.out.println(temp);
    }
}
