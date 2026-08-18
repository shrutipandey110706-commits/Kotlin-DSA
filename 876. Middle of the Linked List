class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head //slow= 1step
        var fast = head //fast= 2 step forward

        while (fast!=null && fast.next!=null){ //till fast.next is not null
            slow= slow?.next //moves 1 step forward
            fast= fast.next?.next //moves 2 step forward
        }
        return slow //returns from middle if fast.next becomes null
    }
}
