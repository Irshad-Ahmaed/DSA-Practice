public class NumberOfSubArray_Xor_K {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int len = 0;
        int Xor = arr[0];
        int n= arr.length;

        for (int i=1; i<=n; i++){
            if (Xor == 6 && i>len){
                len = i;
            }

            if (i<n){
                Xor = Xor ^ arr[i];
            }

        }
        System.out.println(len);
    }
}
