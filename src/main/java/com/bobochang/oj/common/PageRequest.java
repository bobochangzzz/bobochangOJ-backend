package com.bobochang.oj.common;

import com.bobochang.oj.constant.CommonConstant;
import lombok.Data;

/**
 * 分页请求
 *
* @author <a href="https://github.com/bobochangzzz">啵啵肠</a>
* @from <a href="https://blog.bobochang.work">bobochang's BLOG</a>
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
