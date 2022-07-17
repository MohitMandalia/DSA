package com.mohit.sorting.cyclicsort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int arr[] = {4 ,6, 7, 5, 3, 1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int [] arr){
        int i = 0;
        int length = arr.length;
        while(i < length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int currentIndex, int correctIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
