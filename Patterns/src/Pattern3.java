public class Pattern3 {
    public static void main(String[] args) {
        int n= 6;

        for(int i=1; i<=n; i++){
            for (int y=1; y<=n-i+1; y++){
//                System.out.print("* ");
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
