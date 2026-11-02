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
    fun getDecimalValue(head: ListNode?): Int {
        var current = head
        var result = 0

        while (current != null) {
            result = result * 2 + current.`val`
            current = current.next
        }

        return result
    }
}