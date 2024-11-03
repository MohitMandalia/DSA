package com.mohit.randomquestions


object ComplementBaseTenInteger {

    fun execute(num: Int): Int {
        if (num == 0) {
            return 1  // Special case: complement of 0 is 1
        }

        // Calculate the number of bits in `num`
        val numBits = Integer.toBinaryString(num).length

        // Create a mask with all bits set to 1, of the same length as `num`
        val mask = (1 shl numBits) - 1

        // XOR `num` with the mask to flip its bits
        return num xor mask
    }
}

fun main() {
    val ans = ComplementBaseTenInteger.execute(7)
    println("Your answer is : $ans")
}