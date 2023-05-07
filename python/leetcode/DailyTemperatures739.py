from typing import List


class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        stack = []  # pair: [temp, index]

        for i, t in enumerate(temperatures):
            tmp = stack[-1][0]
            # is temp greater than the temp at the top of stack
            while stack and t > stack[-1][0]:
                stackT, stackInd = stack.pop()
                # index of cur temp at - index of temp that we popped = num day to find a greater temp
                res[stackInd] = i - stackInd
            # append temp were cur at and ind of that temp
            stack.append((t, i))
        return res


def main():
    temperatures = [73, 74, 75, 71, 69, 72, 76, 73]

    solution = Solution()
    result = solution.dailyTemperatures(temperatures)
    print(result)


if __name__ == "__main__":
    main()
