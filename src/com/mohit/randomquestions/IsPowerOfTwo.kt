package com.mohit.randomquestions

import kotlin.math.pow

object IsPowerOfTwo {

    fun execute(num: Int): Boolean {
        var ans = 1
        for( i in 0 until 31) {
            if(ans == num) {
                return true
            }
            if(ans < Int.MAX_VALUE/2)
                ans *= 2
        }
        return false
    }

    /**
     * Fastest solution with complexity O(1)
     **/
    fun executeFast(num: Int): Boolean {
        return num > 0 && (num and (num - 1)) == 0
    }
}

fun main() {
    val num = 0
    val ans = IsPowerOfTwo.execute(num)
    println("Is number $num power of 2: $ans")
}