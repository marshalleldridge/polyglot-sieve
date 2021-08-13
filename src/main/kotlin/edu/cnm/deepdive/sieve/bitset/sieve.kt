package edu.cnm.deepdive.sieve.bitset

import java.util.BitSet

fun sieve(limit: Int): BitSet {
    // TODO Implement with a BitSet for keeping track of the candidates.
    throw UnsupportedOperationException()
}

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    val upperBound = 1_000_000
    val primes = sieve(upperBound)
    val end = System.currentTimeMillis()
    println(
        """
            Kotlin Sieve with BitSet: 
            ${primes.cardinality()} primes found between ${primes.nextSetBit(0)} and ${primes.previousSetBit(primes.size() - 1)} (inclusive) in ${end - start} ms.
        """.trimIndent()
    )
}