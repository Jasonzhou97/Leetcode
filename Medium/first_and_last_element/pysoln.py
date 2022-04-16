class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
    
        def findFirst(nums,target):
            l,r=0,len(nums)-1
            while r>=l:
                mid = l+(r-l)//2
                if nums[mid] == target:
                    if (mid-1 >= 0 and nums[mid-1] != target or mid==0):
                        return mid
                    #not the first occurence of target
                    r = mid-1
                elif nums[mid] > target:
                    r = mid-1
                else:
                    l = mid+1
            return -1
        
        def findLast(nums, target):
            l = 0
            r = len(nums)-1

            while l <= r:
                mid = l+(r-l)//2
                if nums[mid] == target:
                    if mid+1 < len(nums) and nums[mid+1] != target or mid == len(nums)-1:
                        return mid
                    l = mid+1
                elif nums[mid] > target:
                    r = mid-1
                else:
                    l = mid+1

            return -1
        
            
        return[findFirst(nums,target),findLast(nums,target)]
         