package com.mohit.sorting.selectionsort;

import java.util.Arrays;

/*
* Time Complexity : Best Case = O(N^2) || Worst Case = O(N^2)
*/
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {-2, 10, -60, -200, 200, 700, 500};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            // find max element and swap with correct index
            int lastIndex =  arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr , int firstIndex, int lastIndex){
        int max = firstIndex;

        for(int i = firstIndex; i <= lastIndex; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }
}
