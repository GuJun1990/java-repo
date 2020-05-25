package org.example.java_repo.design_pattern.chain_of_responsibility;

/**
 * 过滤器B
 * @author gujun@qiyi.com
 * @since 2020/5/25 5:51 下午
 */
public class FilterB implements FilterService {
    @Override
    public boolean filter(Body body, FilterContext context) {
        context.logProcess(FilterB.class, body.isParam2() ? "true" : "false");
        return body.isParam2();
    }
}
