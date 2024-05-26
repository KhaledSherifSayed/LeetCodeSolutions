class Solution {
    fun majorityElement(nums: IntArray): Int {
          val map = mutableMapOf<Int, Int>()

        nums.forEach {
            val toPut = map[it]?.plus(1) ?: 0
            map[it] = toPut
        }
        val maxValue = map.values.max()
        return map.filterValues { it == maxValue }.keys.elementAtOrNull(0) ?: 0
    }
}