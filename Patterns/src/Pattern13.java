public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=0; i<n; i++){
            char ch = 'E';

            for (int j=i; j>0; j--){
                ch--;
            }

            for (int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
