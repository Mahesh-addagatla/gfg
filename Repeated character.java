class Solution:
    def firstRep(self, s):
        for i in range(len(s)):
            if s[i] in s[i+1:]:
                return s[i]
        return -1
