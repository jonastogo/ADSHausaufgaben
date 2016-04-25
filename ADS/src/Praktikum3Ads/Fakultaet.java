package Praktikum3Ads;

import java.math.BigInteger;

public class Fakultaet {

	public Fakultaet() {

	}

	public static void main(String[] args) {
		System.out.println(fakultaet3(2000));
	}

	public static int fakultaet(int var) {
		int varOdd = 1;

		if (var == 0)
			return 1;
		if (var == 1)
			return 1;
		if (var == 2)
			return 2;
		for (int i = 2; i <= var; i++) {
			varOdd *= i;
			System.out.println(i + ": " + varOdd);
		}
		return varOdd;
	}

	public static long fakultaet2(int var) {
		long array[] = new long[var + 1];

		for (int i = 0; i <= var; i++) {
			if (i == 0) {
				array[i] = 0;
			} else if (i == 1) {
				array[i] = 1;
			} else if (i == 2) {
				array[i] = 2;
			} else {
				array[i] = array[i - 1] * i;
				System.out.println(i + ": " + array[i]);
			}
		}
		return array[var];
	}

	public static BigInteger fakultaet3(int n) {
		BigInteger result = BigInteger.ONE;

		if (n == 0 || n == 1)
			return result;

		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
				System.out.println(i + ": " + result);
			}
		}
		return result;
	}
}
