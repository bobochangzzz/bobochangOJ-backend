package com.bobochang.oj.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
* @author <a href="https://github.com/bobochangzzz">啵啵肠</a>
* @from <a href="https://blog.bobochang.work">bobochang's BLOG</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}