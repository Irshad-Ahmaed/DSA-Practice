import java.util.HashMap;
import java.util.Map;

public class Count_SubArr_SumK {
    public static void main(String[] args) {
//        Optimal Approach: -------------------------
//        Time complexity: O(NLogN)
//        Space Complexity: O(N)

        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int n = arr.length;
        int s = 3;
        int prefixSum = 0;
        int count = 0;

        Map<Integer,Integer> temp = new HashMap<>();
        temp.put(prefixSum, 1);

        for (int i=0; i<n; i++){
            prefixSum += arr[i];
            int remove = prefixSum-s;
            count += temp.getOrDefault(remove, 0);

            temp.put(prefixSum, temp.getOrDefault(prefixSum, 0) + 1);

        }
        System.out.print(count);
    }
}
