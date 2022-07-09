package com.mohit.sorting.bubblesort;

import java.util.Arrays;
/*
 * Time Complexity : Best Case = O(N) || Worst Case = O(N^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {-2, 10, -60, -200, 200, 700, 500};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        boolean isSwapped;

        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    // swap
                    int first = j;
                    int second = j-1;
                    swap(arr,first,second);
                    isSwapped = true;
                }

            }

            if(!isSwapped){
                break;
            }
        }

    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
