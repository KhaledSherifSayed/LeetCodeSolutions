class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProf = 0
        var minPrice = prices[0]

        for (i in prices.indices) {
            maxProf = max(maxProf, prices[i] - minPrice)
            minPrice = min(prices[i], minPrice)
        }
        return maxProf
    }
}