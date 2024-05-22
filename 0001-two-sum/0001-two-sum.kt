class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, value ->
            val secondNum = target - value
            if (map.containsKey(secondNum)) 
                return intArrayOf(map[secondNum] ?: -1, index)
            else 
                map[value] = index
        }

        return intArrayOf(-1, -1)
    }
}