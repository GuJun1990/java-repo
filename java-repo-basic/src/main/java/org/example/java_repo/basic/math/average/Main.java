package org.example.java_repo.basic.math.average;

import java.util.stream.IntStream;

/**
 * @author gujun@qiyi.com
 * @since 2020/5/26 11:08 上午
 */
public class Main {

    /**
     * 返回两个或两个以上数字的平均值
     * @param arr 数组
     * @return 平均值
     */
    public static double average(int[] arr) {
        return IntStream.of(arr)
                .average()
                .orElseThrow(()-> new IllegalArgumentException("Array is empty"));
    }

}
