// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
// You may assume no duplicates in the array.
//
// Here are few examples.
// [1,3,5,6], 5 → 2
// [1,3,5,6], 2 → 1
// [1,3,5,6], 7 → 4
// [1,3,5,6], 0 → 0

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;

        if(target <= nums[start]) return start;
        if(target > nums[end]) return end + 1;

        while(start + 1 < end){

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid;
            else start = mid;
        }
        return end;
    }
}
