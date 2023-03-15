import array as arr

class Solution(object):
    def twoSum(self, nums, target):
        for i in range(0, len(nums)):
            print("We're on time %d" % (i))

def main():
    print("I'm in main")
    b = arr.array('d', [2.5, 3.2, 3.3, 3.3])
    solution = Solution()
    solution.twoSum(b, 1)

if __name__ == "__main__":
    main()