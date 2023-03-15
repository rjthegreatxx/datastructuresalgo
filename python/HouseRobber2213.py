from typing import List


class Solution(object):
    def rob(self, nums: List[int]) -> int:
        return max(nums[0], self.helper(nums[1:]), self.helper(nums[:-1]))

    def helper(self, nums: List[int]) -> int:
        rob1, rob2 = 0, 0

        for n in nums:
            temp = max(n + rob1, rob2)
            rob1 = rob2
            rob2 = temp
        return rob2


def main():
    nums = [2, 3, 2]

    solution = Solution()
    result = solution.rob(nums)
    print(result)


if __name__ == "__main__":
    main()
