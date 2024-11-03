package com.mohit.randomquestions

object RemoveElements {

    fun execute(array: Array<Int>, target: Int): Int {
        var k = 0

        array.forEach {
            if(it != target) {
                k++
            }
        }

        return k
    }
}

fun main() {
    val array = arrayOf(1,2,2,2,3,3)
    val remove = 2
    println("Elements removed count: ${RemoveElements.execute(array, remove)}")
}