package com.wystu.vueblog.service.impl;

import com.wystu.vueblog.entity.User;
import com.wystu.vueblog.mapper.UserMapper;
import com.wystu.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WY
 * @since 2021-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
