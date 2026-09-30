class Solution(object):
    def maxDepth(self, root):
        """
        :type root: Node
        :rtype: int
        """
        # Base case: if the tree is empty, the depth is 0
        if root is None:
            return 0
            
        # Base case: if the node is a leaf, its depth is 1
        if not root.children:
            return 1
            
        # Recursively find the depth of all subtrees and take the maximum
        return 1 + max(self.maxDepth(child) for child in root.children)
