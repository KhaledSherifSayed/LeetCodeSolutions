class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var occurrenceNumber = 0
        var firstPointer = 0
        var secondPointer = nums.size - 1
        while (secondPointer - firstPointer >= 0) {
            if (nums[firstPointer] != `val`)
                firstPointer += 1
            else if (nums[firstPointer] == `val`) {
                nums[firstPointer] = nums[secondPointer]
                nums[secondPointer] = -1
                occurrenceNumber += 1
                secondPointer -= 1
            }
        }
        return nums.size - occurrenceNumber
    }
}