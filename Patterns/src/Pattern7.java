public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=2*n-1; i++){
            int star = i;

            if (i>n-1){
                star = 2*n-i;
            }

            for (int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
