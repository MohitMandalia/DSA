package com.mohit.binarysearch;


// Facebook Question
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {

    public static void main(String[] args) {

    }

    static int bs(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
