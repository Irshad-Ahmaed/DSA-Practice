import java.util.ArrayList;

public class Intersection_2_Arr {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,5,5,6,8,9};
        int[] arr2 = {2,2,3,4,4,5,5,6,7};
        int n = arr1.length;
        int m = arr2.length;

//        Brute Force Method: --------------------------

//        ArrayList<Integer> vis = new ArrayList<>();
//        ArrayList<Integer> temp = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//
//        while (i<n){
//            while (j< m-1){
//                if (arr1[i] != arr2[j]){
//                    j++;
//                } else {
//
//                    if (temp.isEmpty() || j != vis.size() - 1) {
//                        temp.add(arr1[i]);
//                        vis.add(j);
//                        i++;
//                        j++;
//                    }
//                }
//
//                if ( i< m && arr2[j] > arr1[i]){
//                    System.out.println(j);
//                    break;
//                }
//            }
//            i++;
//            j = 0;
//
//        }
//        System.out.println(temp);
//    -----------------------------------------------------------

//        OPTIMAL APPROACH: -------

        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                temp.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(temp);
    }
}
