package com.mohit.sorting.cyclicsort.examplequestions;

/*
*   https://leetcode.com/problems/missing-number/
*   Find Missing Number from an array with n distinct numbers from [0,n]
*   Amazon Question
*/
public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = {4, 0, 2, 1};
        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int arr[]){
        int length = arr.length;
        sort(arr, length);
        for (int index = 0; index < length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return length;
    }

    static void sort(int[] arr, int length){
        int i = 0;
        while(i < length) {
            int correctIndex = arr[i];
            if(arr[i] < length && arr[i] != arr[correctIndex]) {
                swap(arr, i , correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
