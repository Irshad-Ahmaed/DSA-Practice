import java.util.ArrayList;

public class Rearrange_Ele_BySign {
    public static void main(String[] args) {
        int[] arr = {1,-3,-2,5,3,-1};
        int n = arr.length;

//        Brute Approach: ----------------------------------

//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//
//        for (int i=0; i<n; i++){
//            if (arr[i]>0){
//                pos.add(arr[i]);
//            }
//            else {
//                neg.add(arr[i]);
//            }
//        }
//
//        for(int i=0; i<n/2; i++){
//            arr[i*2] = pos.get(i);
//            arr[i*2+1] = neg.get(i);
//        }

//        To much Brute Approach: ------------------------

//        int i = 0;
//        int j = 1;
//
//        while (i<n && j<n){
//            if (i%2==0){
//                if (arr[i]>0){
//                    i++;
//                    j++;
//                } else if (arr[j] > 0){
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                    j--;
//                }
//                else {
//                    j++;
//                }
//            }
//            else {
//                if (arr[i]<0){
//                    i++;
//                    j++;
//                } else if (arr[j] < 0){
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                    j--;
//                }
//                else {
//                    j++;
//                }
//            }
//        }

//      Optimal Approach: -------------------------

        int[] temp = new int[n];
        int pos = 0;
        int neg = 1;

        for (int i=0; i<n; i++){
            if (arr[i] > 0){
                temp[pos] = arr[i];
                pos += 2;
            }
            else {
                temp[neg] = arr[i];
                neg += 2;
            }
        }

        for (int val: temp){
            System.out.print(val + " ");
        }

    }
}
