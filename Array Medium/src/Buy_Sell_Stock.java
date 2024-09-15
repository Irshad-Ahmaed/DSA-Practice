public class Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] arr = {2, 100, 150, 120};
        int n = arr.length;

        int buyStock = Integer.MAX_VALUE;
        int sellStock = 0;
        for (int i=0; i<n-1; i++){
            buyStock = Math.min(buyStock, arr[i]);
            sellStock = Math.max(sellStock, arr[i]-buyStock);
        }

        System.out.println("Profit of Stock is: " + sellStock);

    }
}
