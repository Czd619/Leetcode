// Suppose a sorted array is rotated at some pivot unknown to you beforehand.

// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

// Find the minimum element.

public class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        if(nums[0] <= nums[nums.length-1])   // key! no Rotated situation!
            return nums[0];

        int start = 0, end = nums.length - 1;

        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[start] ) start = mid;
            if(nums[mid] < nums[start] ) end = mid;
        }

        if(nums[start] < nums[end])
            return nums[start];
        else
            return nums[end];

    }
}
