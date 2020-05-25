package org.example.java_repo.design_pattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 过滤器链
 * @author gujun@qiyi.com
 * @since 2020/5/25 4:43 下午
 */
public class FilterChain {

    private final List<FilterService> FILTER_SERVICES;

    public FilterChain(Collection<String> classNames) {
        FILTER_SERVICES = new ArrayList<>();
        for (String className : classNames) {
            try {
                Class<?> clazz = Class.forName(className);
                FILTER_SERVICES.add((FilterService)clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean doFilter(Body body, FilterContext context) {
        int index = 0;
        boolean ret = true;
        while (index < FILTER_SERVICES.size() && ret) {
            ret = FILTER_SERVICES.get(index).filter(body, context);
            ++index;
        }
        context.logStatus(ret ? "succeed" : "failed");
        return ret;
    }

}
