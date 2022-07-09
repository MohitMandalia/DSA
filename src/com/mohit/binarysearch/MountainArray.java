package com.mohit.binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {1,3,6,7,8,4,2};
        System.out.println(arr[findPeakOfMountain(arr)]);
    }

    static int findPeakOfMountain(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start) / 2;
            int nextElementAfterMiddle = mid + 1;

            if(arr[mid] > arr[nextElementAfterMiddle]){
                end =  mid;
            }else {
                start = mid + 1;
            }
        }

        return start;
    }
}
