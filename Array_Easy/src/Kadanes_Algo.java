import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kadanes_Algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;

        int maxSum = arr[0];
        int sum = arr[0];
//        Map<Integer, Integer> temp = new HashMap<>();

        int start = -1;
        int end = -1;

        for (int i=0; i<n; i++){
//            Count start after sum is 0
            if (sum == 0){
                start = i;
            }

            sum += arr[i];


            if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }

            if (sum<0){
                sum=0;
//                temp.clear();
            }
        }

        for (int i=start; i<=end; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("MaxSum: " + maxSum);
    }
}
