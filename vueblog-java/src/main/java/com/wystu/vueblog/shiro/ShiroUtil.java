package com.wystu.vueblog.shiro;

import org.apache.shiro.SecurityUtils;

/**
 * @author WY
 * @description: ShiroUtil
 * @date 2021/8/11 20:39
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
