/*
// Definition for a Node.
class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
    
}
*/

class Solution {
    fun maxDepth(root: Node?): Int {
        // Base case: if the tree is empty, depth is 0
        if (root == null) {
            return 0
        }
        
        // Base case: if the node is a leaf, depth is 1
        if (root.children.isEmpty()) {
            return 1
        }
        
        // Find the maximum depth among all children recursively
        var maxChildDepth = 0
        for (child in root.children) {
            if (child != null) {
                maxChildDepth = maxOf(maxChildDepth, maxDepth(child))
            }
        }
        
        return 1 + maxChildDepth
    }
}
