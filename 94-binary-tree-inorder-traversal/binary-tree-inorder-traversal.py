class Solution(object):
    lst=[]
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        return self.inorder(root)

    def inorder(self,root):
        return  self.inorder(root.left) + [root.val] + self.inorder(root.right) if root else []