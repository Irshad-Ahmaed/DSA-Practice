import java.util.Scanner;

public class highest_product {
    public static void main(String[] args) {
        System.out.print("Assign the value of k: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int maxProduct = 1;
        if (k<=3){
            System.out.println("K is: " + k);
        }

        while(k > 4){
            maxProduct *= 3;
            k -= 3;
        }

        maxProduct *= k;

        System.out.println("highest product value of k is: " + maxProduct);
    }
}
