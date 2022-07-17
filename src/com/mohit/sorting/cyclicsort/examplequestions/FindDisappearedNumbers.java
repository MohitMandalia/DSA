package com.mohit.sorting.cyclicsort.examplequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *   https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *   448. Find All Numbers Disappeared in an Array
 *   Google Question
 */

class FindDisappearedNumbers {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDisappearedNumbers(nums).toArray()));
    }
    
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        cyclicSort(nums, length);
        System.out.println(Arrays.toString(nums));
        List<Integer> missingNums = new ArrayList<>();
        for(int index = 0; index < length; index++) {
            if(nums[index] != index + 1){
                missingNums.add(index + 1);
            }
        }
        return missingNums;
    }
    
    static void cyclicSort(int [] nums, int length) {
        int i = 0;
        while(i < length) {
            int correctIndex = nums[i] - 1;
            if( nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        } 
    }

    private static void swap(int[] nums, int first, int second) {
        
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}