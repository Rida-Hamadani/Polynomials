package com.polynomials;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberTheory {
    public static Boolean isPrime(int n) {
        if (n < 2) return false;
        if (n < 4) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;

        return true;
    }

    public static Integer gcd(ArrayList<Integer> nums) {
        AtomicInteger n = new AtomicInteger(nums.get(0));
        nums.forEach(m -> n.set(gcd(n.get(), m)));
        return n.get();
    }

    public static int gcd(int a, int b) {
        int c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static int power(int a, int b) {
        int pow = 1;

        for (int c = 0; c < b; ++c) {
            pow *= a;
        }

        return pow;
    }
}
