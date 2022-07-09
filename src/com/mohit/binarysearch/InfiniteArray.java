package com.mohit.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3,5,9,10,90,100,1300,140,160,170};
        int target = 10;

        System.out.println(ans(arr,target));
    }

    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            //end = previousEnd + sizeofBox * 2
            end  = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int [] arr, int target, int start , int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
