import sys
from typing import List


def maxSubArray(nums):
    if len(nums) == 1:
        return nums[0]

    largestSum = sys.float_info.min

    for i in range(len(nums)):
        currentSum = 0
        for j in nums[i:]:
            currentSum += j
            largestSum = max(largestSum, currentSum)

    return largestSum


def main():
    result = maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])
    print(str(result))


main()
