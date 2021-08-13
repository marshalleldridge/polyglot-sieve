package edu.cnm.deepdive.sieve.array;

public class Sieve {

  private static int[] sieve(int limit) {
    // TODO Implement with a boolean[] for keeping track of the candidates, and return an int[] of
    //  all values found to be prime.
    throw new UnsupportedOperationException();
  }

  public static void main(String... args) {
    int upperBound = 1_000_000;
    long start = System.currentTimeMillis();
    int[] primes = sieve(upperBound);
    long end = System.currentTimeMillis();
    System.out.printf("Java Sieve with boolean[] and int[]:%n"
            + "%1$,d primes found between %2$,d and %3$,d in %4$d ms.%n",
        primes.length, primes[0], primes[primes.length - 1], end - start);
  }

}
