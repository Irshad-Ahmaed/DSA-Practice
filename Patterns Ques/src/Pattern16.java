public class Pattern16 {
    public static void main(String[] args) {
        int n=5;

        for (int i=0; i<n; i++){
            System.out.print("*");
            String space ="*";
            if (i>0 && i<n-1){
                space = " ";
            }
            for (int j=0; j<n-3; j++){
                System.out.print(space);
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
