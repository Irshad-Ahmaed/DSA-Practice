import java.util.HashMap;
import java.util.Map;

public class Largest_SubArr_Sum_0 {
    public static void main(String[] args) {
        int[] arr = {-1, 1, -1, 1};
//        int sum = 0;
//        Map<Integer,Integer> mpp = new HashMap<>();
//        int min = 0;
//
//        for (int i=0; i<arr.length; i++){
//            sum += arr[i];
//            if (sum == 0){
//                min = i+1;
//            }
//            else {
//                if (mpp.get(sum) != null){
//                    min = Math.max(min, i - mpp.get(sum));
//                }
//                else {
//                    mpp.put(sum,i);
//                }
//            }
//
//        }
//        System.out.println(min);

        int n = arr.length;
        int sum=0;
        int len=0;
        int maxlen=0;
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i=0; i<n; i++){

            sum += arr[i];
//            if (sum == 0){
//                maxlen = i + 1;
//            }

            if (!mpp.containsKey(sum)){
                mpp.put(sum, i);
                System.out.println(mpp.get(sum) + " get");
                System.out.println(i + " index");
            }
            else {
                System.out.println(mpp.get(sum) + " sum");
                len = i-mpp.get(sum);
                maxlen = Math.max(maxlen, len);
            }

        }
        System.out.println(maxlen);
        System.out.println(mpp);
    }
}
