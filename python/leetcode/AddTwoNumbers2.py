from typing import List


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        s = ""
        cur = l1
        while(cur):
            s = s + str(cur.val)
            cur = cur.next
        str1 = s[::-1]

        s = ""
        cur = l2
        while(cur):
            s = s + str(cur.val)
            cur = cur.next
        str2 = s[::-1]

        return 2

def main():
    l1 = [2,4,3]
    l2 = [5,6,4]

    solution = Solution()
    result = solution.addTwoNumbers(l1, l2)
    print(result)


if __name__ == "__main__":
    main()
