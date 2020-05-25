package org.example.java_repo.design_pattern.chain_of_responsibility;

/**
 * @author gujun@qiyi.com
 * @since 2020/5/25 4:42 下午
 */
public interface FilterService {
    boolean filter(Body body, FilterContext context);
}
