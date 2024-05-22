/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var listOneIterator = list1
        var listTwoIterator = list2
        val result = ListNode(0)
        var cur = result
        while (listOneIterator != null && listTwoIterator != null) {
            if (listOneIterator.`val` < listTwoIterator.`val`) {
                cur.next = listOneIterator
                listOneIterator = listOneIterator.next
            } else {
                cur.next = listTwoIterator
                listTwoIterator = listTwoIterator.next
            }
            cur = cur.next!!
        }

        if (listOneIterator != null) {
            cur.next = listOneIterator
        }
        if (listTwoIterator != null) {
            cur.next = listTwoIterator
        }
        return result.next
    }
}