package com.mohit.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int arr[] = {1,2,4,5,77,88,90};
        int arr[] = {90,88,87,66,4,3,-1};
        int target = 3;
        System.out.println(orderAgnosticBS(arr,target));
    }

    static int orderAgnosticBS(int [] arr, int target ){

        int start = 0;
        int end = arr.length -1;

        // find if array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
