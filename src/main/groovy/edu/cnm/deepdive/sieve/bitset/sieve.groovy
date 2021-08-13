package edu.cnm.deepdive.sieve.bitset

static def sieve(int limit) {
    // TODO Implement with a BitSet for keeping track of the candidates.
    throw new UnsupportedOperationException();
}

def start = System.currentTimeMillis()
def upperBound = 1_000_000
def primes = sieve(upperBound)
def end = System.currentTimeMillis()
println("""\
    Groovy Sieve with BitSet: 
    ${primes.cardinality()} primes found between ${primes.nextSetBit(0)} and ${primes.previousSetBit(primes.size() - 1)} (inclusive) in ${end - start} ms.
    """.stripIndent())