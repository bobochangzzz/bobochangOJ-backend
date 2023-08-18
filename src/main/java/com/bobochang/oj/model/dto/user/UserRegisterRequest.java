package com.bobochang.oj.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户注册请求体
 *
* @author <a href="https://github.com/bobochangzzz">啵啵肠</a>
* @from <a href="https://blog.bobochang.work">bobochang's BLOG</a>
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
