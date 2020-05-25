package org.example.java_repo.design_pattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试代码
 * @author gujun@qiyi.com
 * @since 2020/5/25 5:52 下午
 */
public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("org.example.java_repo.design_pattern.chain_of_responsibility.FilterA");
        strings.add("org.example.java_repo.design_pattern.chain_of_responsibility.FilterB");
        FilterChain filterChain = new FilterChain(strings);
        {
            Body body = new Body();
            FilterContext filterContext = new FilterContext();
            body.setParam1(1);
            body.setParam2(true);
            System.out.println(filterChain.doFilter(body, filterContext));
            System.out.println(filterContext);
        }
        {
            Body body = new Body();
            FilterContext filterContext = new FilterContext();
            body.setParam1(1);
            body.setParam2(false);
            System.out.println(filterChain.doFilter(body, filterContext));
            System.out.println(filterContext);
        }
        {
            Body body = new Body();
            FilterContext filterContext = new FilterContext();
            body.setParam1(-1);
            body.setParam2(true);
            System.out.println(filterChain.doFilter(body, filterContext));
            System.out.println(filterContext);
        }
        {
            FilterChain emptyFilterChain = new FilterChain(Collections.emptyList());
            Body body = new Body();
            FilterContext filterContext = new FilterContext();
            System.out.println(filterChain.doFilter(body, filterContext));
            System.out.println(filterContext);
        }
    }
}
