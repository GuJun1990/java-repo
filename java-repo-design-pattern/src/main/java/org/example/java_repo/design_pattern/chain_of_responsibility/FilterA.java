package org.example.java_repo.design_pattern.chain_of_responsibility;

/**
 * 过滤器A
 * @author gujun@qiyi.com
 * @since 2020/5/25 4:56 下午
 */
public class FilterA implements FilterService {
    @Override
    public boolean filter(Body body, FilterContext context) {
        context.logProcess(FilterA.class, body.getParam1() > 0);
        return body.getParam1() > 0;
    }
}
