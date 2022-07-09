package com.mohit.sorting.insertionsort;

import java.util.Arrays;

/*
* Time Complexity : Best Case = O(N) || Worst Case = O(N^2)
*/
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {-2, 10, -60, -200, 200, 700, 500};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
