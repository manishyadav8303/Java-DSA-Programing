public class buy_sell_stock {

    // public static int stock(int price[]){
    //     int BuyPrice = Integer.MAX_VALUE;
    //     int Maxprofit = 0;
    //     for(int i = 0 ; i<price.length ; i++){
    //         if (BuyPrice < price[i]){
    //         int profit = price[i] - BuyPrice;
    //         Maxprofit = Math.max(Maxprofit, profit);
    //     }else{
    //         BuyPrice = price[i];
    //     }
    //     }
    //     return Maxprofit;
    // }
    // public static int stock(int price[]){
    //     int BuyPrice = Integer.MAX_VALUE;
    //     int Maxprofit = 0;
    //     for (int i = 0 ; i< price.length ; i++ ){
    //         if(BuyPrice < price[i]){
    //             int profit = price[i] - BuyPrice;
    //             Maxprofit = Math.max(Maxprofit, profit);
    //         }else{
    //             BuyPrice = price[i];
    //         }
    //     }
    //     return Maxprofit;
    // }
    public static int stock (int price[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for(int i = 0 ; i<price.length ; i++){
            if(BuyPrice < price[i]){
                int profit = price[i]-BuyPrice;
                Maxprofit = Math.max(Maxprofit, profit);
            }else{
                BuyPrice = price[i];
            }
        }
        return Maxprofit;
        
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(stock(price));
    }
    
}
