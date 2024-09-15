import java.util.ArrayList;

public class Rearrange_Ele_Unequal_order_Sign {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,-3,1};
        int n = arr.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i=0; i<n; i++){
            if (arr[i]>0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }

        int min = Math.min(pos.size(), neg.size());

        for (int i=0; i<min; i++){
            arr[i*2] = pos.get(i);
            arr[i*2+1] = neg.get(i);
        }

        for (int i=min*2; i<n; i++){
            arr[i] = pos.get(i-min);
        }

        for (int val: arr){
            System.out.print(val + " ");
        }


    }
}
