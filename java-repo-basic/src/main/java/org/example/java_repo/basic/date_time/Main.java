package org.example.java_repo.basic.date_time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Java8 新增的日期API
 * ZoneId: 时区ID，用来确定Instant和LocalDateTime互相转换的规则
 * Instant: 用来表示时间线上的一个点
 * LocalDate: 表示没有时区的日期, LocalDate是不可变并且线程安全的
 * LocalTime: 表示没有时区的时间, LocalTime是不可变并且线程安全的
 * LocalDateTime: 表示没有时区的日期时间, LocalDateTime是不可变并且线程安全的
 * Clock: 用于访问当前时刻、日期、时间，用到时区
 * Duration: 用秒和纳秒表示时间的数量
 * 最常用的就是LocalDate、LocalTime、LocalDateTime了，从它们的名字就可以看出是操作日期
 * 和时间的。这些类是主要用于当时区不需要显式地指定的上下文。
 *
 * @author gujun@qiyi.com
 * @since 2020/5/26 11:27 上午
 */
public class Main {

    @Test
    public void demoLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate.toString()); // LocalDate: 2020-05-26
    }

    @Test
    public void demoLocalDate2() {
        {
            LocalDate localDate = LocalDate.of(2020, 5, 20);
            System.out.println("LocalDate: " + localDate.toString()); // LocalDate: 2020-05-20
        }
        {
            LocalDate localDate = LocalDate.parse("2020-05-26");
            System.out.println("LocalDate: " + localDate.toString()); // LocalDate: 2020-05-26
        }
    }

    @Test
    public void demoLocalDate3() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString()); // 2020-05-26
        LocalDate tomorrow = localDate.plusDays(1); // 加一天
        System.out.println(tomorrow.toString()); // 2020-05-27
        LocalDate prevMonth = localDate.minus(1, ChronoUnit.MONTHS); // 减一个月
        System.out.println(prevMonth.toString()); // 2020-04-26
    }

    @Test
    public void demoLocalDate4() {
        System.out.println(LocalDate.of(2020, 5, 20).isBefore(LocalDate.of(2020, 5, 21)));
        System.out.println(LocalDate.of(2020, 5, 21).isAfter(LocalDate.of(2020, 5, 20)));
    }

}
