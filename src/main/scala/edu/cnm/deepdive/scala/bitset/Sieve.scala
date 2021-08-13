package edu.cnm.deepdive.scala.bitset

import scala.collection.mutable

object Sieve {

  def sieve(limit: Int): mutable.BitSet = {
    // TODO Implement with a BitSet for keeping track of the candidates.
    throw new UnsupportedOperationException()
  }

  def main(args: Array[String]): Unit = {
    val start = System.currentTimeMillis()
    val upperBound = 1_000_000
    val primes = sieve(upperBound)
    val end = System.currentTimeMillis()
    println(
      s"""Scala Sieve with BitSet and Seq<Int>:
         |${primes.size} primes found between ${primes.firstKey} and ${primes.lastKey} (inclusive) in ${end - start} ms.""".stripMargin
    )
  }

}
