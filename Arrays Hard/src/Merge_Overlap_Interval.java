import java.util.*;

public class Merge_Overlap_Interval {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {1, 2}, {3, 6}, {8, 9}, {9, 11}};
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

//          Brute Force:
//        List<List<Integer>> temp = new ArrayList<>();

//        for (int i=0; i<n; i++){
//            if (temp.isEmpty()){
//                    temp.add(Arrays.asList(arr[i][0], arr[i][1]));
//                    continue;
//            }
//            for (int j=0; j<1; j++){
//                if (temp.getLast().get(1) < arr[i][j]) {
//                    temp.add(Arrays.asList(arr[i][j], arr[i][j+1]));
//                }
//                else if (temp.getLast().get(1) < arr[i][j+1]) {
//                    List<Integer> replace = new ArrayList<>();
//                    replace.add(temp.getLast().get(0));
//                    replace.add(arr[i][j+1]);
//                    temp.set(temp.indexOf(temp.getLast()), replace);
//                }
//            }
//        }
//        System.out.println(temp);

//        Optimal Approach:
//        List<List<Integer>> temp = new ArrayList<>();

//        for (int i=0; i<n; i++){
//            if (temp.isEmpty() || temp.get(temp.size() - 1).get(1) < arr[i][0]){
//                temp.add(Arrays.asList(arr[i][0], arr[i][1]));
//            }
//            else if (temp.get(temp.size() - 1).get(1) < arr[i][1]) {
//                temp.get(temp.size()-1).set(1, arr[i][1]);
//            }
//        }
//
//        System.out.println(temp);

//        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<int[]> temp = new ArrayList<>();

        if (arr.length == 0 || arr == null){
            temp.toArray(new int[0][]);
            System.out.println("exit");
        }

        int start = arr[0][0];
        int end = arr[0][1];

        for(int i=0; i<n; i++) {
            if(arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            }
            else {
                temp.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        temp.add(new int[]{start, end});
        System.out.println(temp);


    }
}
