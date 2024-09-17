import java.util.*;

public class Merge_Overlap_Interval {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{1,2},{3,6},{8,9},{9,11}};
        int n= arr.length;
        List<List<Integer>> temp = new ArrayList<>();


        for (int i=0; i<n; i++){
            for (int j=0; j<1; j++){
                if (temp.isEmpty()){
                    temp.add(Arrays.asList(arr[i][j], arr[i][j+1]));
                }
                else if (temp.getLast().get(1) < arr[i][j]) {
                    temp.add(Arrays.asList(arr[i][j], arr[i][j+1]));
                }
                else if (temp.getLast().get(1) < arr[i][j+1]) {
                    List<Integer> replace = new ArrayList<>();
                    replace.add(temp.getLast().get(0));
                    replace.add(arr[i][j+1]);
                    temp.set(temp.indexOf(temp.getLast()), replace);
                }
            }
        }
        System.out.println(temp);


    }
}
