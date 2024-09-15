public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5};
        int j=0;

        for (int i=1; i<arr.length; i++){
            if (arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }

        }

        System.out.println("Unique Item: " + (j+1));

        for (int i=0; i<j+1; i++){
            System.out.println(arr[i]);
        }
    }
}
