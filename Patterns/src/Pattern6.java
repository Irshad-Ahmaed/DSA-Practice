public class Pattern6 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n; i++){

            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int k=0; k<n; k++){
            for (int j=0; j<k; j++){
                System.out.print(" ");
            }

            for (int j=0; j<2*n-(2*k+1); j++){
                System.out.print("*");
            }
            for (int j=0; j<k; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
