package mezo;

class Solution2 {
    public int solution(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            // 최소가격 갱신
            if(price < minPrice) {
                minPrice = price;
            }
            else {
                //현재 가격에서 최소 가격을 빼고 계산하여 최대 이익 갱신
                int profit = price - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
