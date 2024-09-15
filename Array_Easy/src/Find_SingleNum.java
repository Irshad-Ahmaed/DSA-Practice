public class Find_SingleNum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,5,5};

//        Brute Force:-------------------------

//        int count = 0;
//        int j=0;
//        int singleNum = 0;
//        int i=0;
//
//        while (i<arr.length){
//            if (arr[i] == arr[j]){
//                count++;
//            }
//            j++;
//
//            if (j == arr.length){
//                if (count == 1){
//                    singleNum = arr[i];
//                    break;
//                }
//                i++;
//                j = 0;
//                count = 0;
//            }
//            else {
//                singleNum = arr[i];
//            }
//        }
//        System.out.println(singleNum);
//        --------------------------------------------

//        Optimal Approach:

        int Xor = 0;

        for(int i=0; i< arr.length; i++){
            Xor = Xor ^ arr[i];
            System.out.println(Xor);
        }


    }
}
