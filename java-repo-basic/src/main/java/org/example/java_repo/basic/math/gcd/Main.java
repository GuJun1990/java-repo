package org.example.java_repo.basic.math.gcd;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author gujun@qiyi.com
 * @since 2020/5/26 11:11 上午
 */
public class Main {

    public static OptionalInt gcd(int[] nums) {
        return Arrays.stream(nums).reduce(Main::gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}
