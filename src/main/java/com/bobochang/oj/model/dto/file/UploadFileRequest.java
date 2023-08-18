package com.bobochang.oj.model.dto.file;

import java.io.Serializable;
import lombok.Data;

/**
 * 文件上传请求
 *
* @author <a href="https://github.com/bobochangzzz">啵啵肠</a>
* @from <a href="https://blog.bobochang.work">bobochang's BLOG</a>
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}