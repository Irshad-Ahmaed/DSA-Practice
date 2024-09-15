import java.util.*;

public class Majority_Ele_nBy3 {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {1,2,2,3,2,3,3,3,2};

//        Better Approach: --------------------------------

//        List<Integer> temp = new ArrayList<>();
//        Map<Integer,Integer> mpp = new HashMap<>();
//
//        for (int i=0; i<n; i++){
//            int val = mpp.getOrDefault(arr[i], 0);
//            mpp.put(arr[i], val+1);
//            if (mpp.get(arr[i]) > n/3){
//                temp.add(arr[i]);
//            }
//
//            if (temp.size() == 2) break;
//        }
//        System.out.print(temp);

//        Better than Better Approach: -------------------------

//        List<Integer> temp = new ArrayList<>();
//        Arrays.sort(arr);
//        int count = 0;
//        int val = arr[0];
//        int min = (n/3)+1;
//
//        for (int i=0; i<n; i++){
//            if (arr[i] == val) count++;
//            else {
//                count=1;
//                val = arr[i];
//            }
//
//            if (count == min) temp.add(arr[i]);
//
//            if (temp.size() == 2) break;
//        }
//        System.out.print(temp);

//        Optimal Approach: -------------------------------------

        List<Integer> temp = new ArrayList<>();
        int ele1 = 0;
        int count1 = 0;
        int ele2 = 0;
        int count2 = 0;

        for (int i=0; i<n; i++){
            if (count1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                count1++;
            } else if (count2 == 0 && arr[i] != ele1) {
                ele2 = arr[i];
                count2++;
            } else if (arr[i] == ele1) {
                count1++;
            } else if (arr[i] == ele2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0; i<n; i++){
            if(ele1 == arr[i]){
                count1++;
            }
            else if(ele2 == arr[i]){
                count2++;
            }
        }
        if(count1 > n/3) temp.add(ele1);
        if(count2 > n/3) temp.add(ele2);

        System.out.println(temp);

    }
}
