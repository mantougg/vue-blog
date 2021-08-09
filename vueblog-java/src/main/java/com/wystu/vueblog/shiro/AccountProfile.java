package com.wystu.vueblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WY
 * @description: AccountProfile
 * @date 2021/8/9 20:10
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
