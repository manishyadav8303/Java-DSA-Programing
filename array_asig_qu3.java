public class array_asig_qu3 {
    public static int stock_profit(int price[]){
        int BuyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int Maxprofit=0;
        for (int i = 0 ; i<price.length; i++){
            if (BuyPrice<price[i]){
                profit= price[i]-BuyPrice; 
                Maxprofit = Math.max(profit, Maxprofit);
            }else{
                BuyPrice = price[i];
            }
        }return Maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        System.out.println(stock_profit(price));
    }
}
