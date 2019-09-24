package tabelaSimbolos;

import java.math.BigInteger;

public class Prime {

	// Function to get nextPrimeNumber
	static long nextPrime(Integer n) {
		BigInteger b = new BigInteger(String.valueOf(n));
		return Long.parseLong(b.nextProbablePrime().toString());
	}
}