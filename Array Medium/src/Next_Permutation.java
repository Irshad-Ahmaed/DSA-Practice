public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        int n = arr.length;
        int breakpoint = -1;

        for (int i=n-2; i>=0; i--){
            if (arr[i] < arr[i+1]){
                breakpoint = i;
                break;
            }
        }

        if(breakpoint != -1){
            for (int i=n-1; i>0; i--){
                if (arr[i] > arr[breakpoint]){
                    int temp = arr[i];
                    arr[i] = arr[breakpoint];
                    arr[breakpoint] = temp;
                    break;
                }
            }

            int j = n-1;
            breakpoint = breakpoint+1;
            while (breakpoint<=j){
                int temp = arr[breakpoint];
                arr[breakpoint] = arr[j];
                arr[j] = temp;
                breakpoint++;
                j--;
            }
        }
        else{
            int j = n-1;
            breakpoint = 0;
            while (breakpoint<=j){
                int temp = arr[breakpoint];
                arr[breakpoint] = arr[j];
                arr[j] = temp;
                breakpoint++;
                j--;
            }
        }

        for (int val: arr){
            System.out.print(val + " ");
        }
    }
}
