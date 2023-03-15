from typing import List


class Solution(object):
    def combinationSum4(self, nums: List[int], target: int) -> int:
        dp = {0: 1}

        for total in range(1, target + 1):
            dp[total] = 0
            for n in nums:
                dp[total] += dp.get(total - n, 0)

        return dp[target]


def main():
    target = 4
    nums = [1, 2, 3]

    solution = Solution()
    result = solution.combinationSum4(nums, target)
    print(result)


if __name__ == "__main__":
    main()
