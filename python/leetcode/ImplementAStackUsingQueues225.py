# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    class MyStack:
        def __init__(self):
            self.q = deque()

        def push(self, x: int) -> None:
            self.q.append(x)

        def pop(self) -> int:
            for i in range(len(self.q) - 1):
                self.push(self.q.popleft())
            return self.q.popleft()

        def top(self) -> int:
            for i in range(len(self.q) - 1):
                self.push(self.q.popleft())
            res = self.q[0]
            self.push(self.q.popleft())
            return res

        def empty(self) -> bool:
            return len(self.q) == 0
