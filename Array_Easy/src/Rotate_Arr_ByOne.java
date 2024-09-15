import java.util.Scanner;

public class Rotate_Arr_ByOne {
//    Optimal Approach Function:
    public static void reverse(int[] nums, int start, int end) {
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4,6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many times you want to shift: ");
        int x = sc.nextInt();
        x = x % arr.length;

//        Approach: Brute force;

//        for (int j=0; j<x; j++){
//            int pick = arr[arr.length-1];
//            for (int i=0; i<arr.length-1; i++){
//                arr[i] = arr[i+1];
//            }
//            arr[0] = pick;
//        }
//       ---------------------------------------
//        Approach: Better

        int n = arr.length-1;
//        int[] temp = new int[x];  // Extra Space Complexity: O(x);
//
//        for (int j=0; j<x; j++){ // Time Complexity: O(x)
//            temp[j] = arr[n-j];
//        }
//
//        for (int i=n; i>=x; i--){  // Time Complexity: O(N-x)
//            arr[i] = arr[i-x];
//        }
//
//        for(int i=0; i<x; i++){  // Time Complexity: O(x)
//            arr[i] = temp[x-i-1];
//        }

//        Total Time Complexity: O(N-x) + O(x) + O(x) == O(N+x)
// ---------------------------------------
//        Optimal Approach: Space Complexity O(1) & Time Complexity: O(2N)

        reverse(arr, 0, n-x);
        reverse(arr, n-x+1, n);
        reverse(arr, 0, n);

        for (int val:arr){
            System.out.println(val);
        }
    }
}
