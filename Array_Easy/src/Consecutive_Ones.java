import java.util.ArrayList;

public class Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,0,1};
        int n = arr.length-1;
        int count = 0;
        int max = 0;

        for (int i=0; i<=n; i++){
            if(arr[i] == 1){
                count++;
            }
            else {
                if(count > max){
                    max = count;
                }
                count = 0;
            }

            if(count > max){
                max = count;
            }
        }
        System.out.println("max: " + max);


    }
}
