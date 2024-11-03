package com.mohit.binarysearch

object RemoveDuplicateElementsInSortedArray {

    fun execute(array: IntArray): Int {
        if (array.isEmpty()) return 0

        var k = 1

        for (i in 1 until array.size) {
            if (array[i - 1] != array[i]) {
                array[k] = array[i]
                k++
            }
        }

        return k
    }

}

fun main() {
    val array = intArrayOf(1,2,2,3,3,4,4,5)
    val total = RemoveDuplicateElementsInSortedArray.execute(array)
    println("Removed elements : $total")

    for (i in 0 until total) {
        print("${array[i]} ") // Output: 1 2 3 4
    }
}