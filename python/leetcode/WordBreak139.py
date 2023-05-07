from typing import List


class Solution(object):
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        dp = [False] * (len(s) + 1)
        dp[len(s)] = True
        for i in range(len(s) - 1, -1, -1):
            for w in wordDict:
                if (i + len(w)) <= len(s) and s[i: i + len(w)] == w:
                    dp[i] = dp[i + len(w)]
                    if dp[i]:
                        break

        return dp[0]


def main():
    s = "leetcode"
    wordDict = ["leet", "code"]
    solution = Solution()
    result = solution.wordBreak(s, wordDict)
    print(result)


if __name__ == "__main__":
    main()
