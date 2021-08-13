package edu.cnm.deepdive.sieve.list

static def sieve(int limit) {
    // TODO Implement with a List<Boolean> for keeping track of the candidates, and return a
    //  List<Integer> of all values found to be prime.
    throw new UnsupportedOperationException();
}

def start = System.currentTimeMillis()
def upperBound = 1_000_000
def primes = sieve(upperBound)
def end = System.currentTimeMillis()
println("""\
    Groovy Sieve with List<Boolean> and List<Integer>: 
    ${primes.size()} primes found between ${primes.first()} and ${primes.last()} (inclusive) in ${end - start} ms.
    """.stripIndent())