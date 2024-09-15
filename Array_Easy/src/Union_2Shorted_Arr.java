import java.util.ArrayList;

public class Union_2Shorted_Arr {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                if (temp.isEmpty() || temp.getLast() != arr1[i]){   // temp.get(temp.size() -1) = temp.getLast()
                    temp.add(arr1[i]);
                }
                i++;
            }
            else {
                if (temp.isEmpty() || temp.getLast() != arr2[j]){
                    temp.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length){

            if (temp.isEmpty() || temp.getLast() != arr1[i]){
                temp.add(arr1[i]);
            }
            i++;

        }

        while (j < arr2.length){
            if (temp.isEmpty() || temp.getLast() != arr2[j]){
                temp.add(arr2[j]);
            }
            j++;
        }

        System.out.println(temp);
    }
}
