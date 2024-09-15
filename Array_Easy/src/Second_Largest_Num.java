public class Second_Largest_Num {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

//        int max = arr[0];
//        for (int i=0; i< arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        for (int j=0; j< arr.length; j++){
//            int maxVal = max;
//            max = Integer.MIN_VALUE;
//            if (arr[j] > max && arr[j] != maxVal){
//                max = arr[j];
//            }
//        }
//
//        System.out.println(max);

//        Optimized Approach: --------

        int max = arr[0];
        int max2 = -1;

        int i = 0;

        while(i < arr.length){
            if (arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > max2){
                max2 = arr[i];
            }
            i++;
        }
        System.out.println(max2);
    }
}
