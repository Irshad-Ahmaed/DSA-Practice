public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;

        for (int i= 1; i<=n; i++){

            for (int k=1; k<=i; k++){
                System.out.print(k);
            }

            for (int k=1; k<=2*n-2*i; k++){
                System.out.print(" ");
            }

            for (int k=i; k>=1; k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
