public class Move_Zeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length-1;

//        int i = 0;
//        int pointer = 0;
//        while(pointer <= n && i <= n){
//            if (arr[i] != 0) {
//                i++;
//                pointer++;
//            } else if (arr[pointer] == 0) {
//                pointer++;
//            }
//            else {
//                int temp = arr[pointer];
//                arr[pointer] = arr[i];
//                arr[i] = temp;
//            }
//        }
//  ----------------  OR  --------------------

        int j = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i=j+1; i<=n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

//        ----------------------------
        for (int val: arr){
            System.out.println(val);
        }
    }
}
