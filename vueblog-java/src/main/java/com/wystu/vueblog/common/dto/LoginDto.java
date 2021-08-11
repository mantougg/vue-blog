package com.wystu.vueblog.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author WY
 * @description: LoginDto
 * @date 2021/8/11 19:50
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不可为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

}
