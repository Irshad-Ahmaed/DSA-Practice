public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;

        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                System.out.print("*");
            }

            char x = 'A';

            for (int j=0; j<=2*i; j++){
                System.out.print(x);
                if (j>=i){
                    x--;
                }
                else {
                    x++;
                }
            }

            for (int j=0; j<n-i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
