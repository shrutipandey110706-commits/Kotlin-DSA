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
    fun isPalindrome (head:ListNode?): Boolean {
        var curr = head
        var str = ""
        while (curr!=null){
            str += curr.`val`
            curr=curr.next
        }
    return str == str.reversed()    
    }
}