package com.poja.prime.endpoint.event.gen;

import java.math.BigInteger;
import java.util.Random;

public class PrimeNumberGenerator {
    public static BigInteger generateProbablePrime(int bitLength, int certainty) {
        Random random = new Random();
        return new BigInteger(bitLength, certainty, random);
    }
}
