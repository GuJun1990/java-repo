package org.example.java_repo.design_pattern.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * 过滤上下文对象
 * @author gujun@qiyi.com
 * @since 2020/5/25 6:01 下午
 */
public class FilterContext {

    private final Map<String, Object> map;

    public FilterContext() {
        map = new HashMap<>();
    }

    public void logStatus(boolean status) {
        map.put("status", status);
    }

    public void logProcess(Class<?> clazz, Object msg) {
        map.put(clazz.toString(), msg);
    }

    @Override
    public String toString() {
        return "FilterContext{" +
                "map=" + map +
                '}';
    }
}
