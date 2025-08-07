class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        count = 1
        longest = 0
        nums = list(set(nums))

        if (len(nums) == 1):
             return 1
        if (len(nums) == 0):
             return 0

        nums.sort()
        
        for i in range(len(nums) - 1):
            if (nums[i + 1] - nums[i] == 1):
                count +=1
            else:
                count = 1
            if (count >= longest):
                    longest = count
                
        return longest

        