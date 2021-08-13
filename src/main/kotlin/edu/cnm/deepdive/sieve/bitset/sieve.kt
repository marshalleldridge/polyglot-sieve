package edu.cnm.deepdive.sieve.bitset

import java.util.BitSet
import kotlin.math.sqrt

fun sieve(limit: Int): BitSet {
    val candidates = BitSet(limit + 1)
    candidates.set(2, limit + 1)
    var prime = candidates.nextSetBit(0)
    while (prime <= sqrt(limit.toDouble())) {
        for (multiple in (prime * prime)..limit step prime) {
            candidates.clear(multiple)
        }
        prime = candidates.nextSetBit(prime + 1)
    }
    return candidates
}

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    val upperBound = 1_000_000
    val primes = sieve(upperBound)
    val end = System.currentTimeMillis()
    println(
        """
            Kotlin Sieve with BitSet: 
            ${primes.cardinality()} primes found between ${primes.nextSetBit(0)} and ${
            primes.previousSetBit(
                primes.size() - 1
            )
        } (inclusive) in ${end - start} ms.
        """.trimIndent()
    )
}