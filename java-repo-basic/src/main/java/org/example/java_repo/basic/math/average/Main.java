package org.example.java_repo.basic.math.average;

import java.util.stream.IntStream;

/**
 * @author gujun@qiyi.com
 * @since 2020/5/26 11:08 上午
 */
public class Main {

    /**
     * 返回两个或两个以上数字的平均值
     * @param nums 数组
     * @return 平均值
     */
    public static double average(int[] nums) {
        return IntStream.of(nums)
                .average()
                .orElseThrow(()-> new IllegalArgumentException("Array is empty"));
    }

}
