class Solution(object):
    
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        cur=strs[0]
        for s in strs[1:]:
            while s[:len(cur)] != cur:
                cur=cur[:-1]
                if not cur:
                    return ""
        return cur