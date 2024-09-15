import java.util.*;

public class Spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 60}};
        int n = arr.length;
        int m = arr[0].length;

        ArrayList<Integer> temp = new ArrayList<>();
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                temp.add(arr[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                temp.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    temp.add(arr[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    temp.add(arr[i][left]);
                }
            }
            left++;
        }

        System.out.print(temp);
    }
}
