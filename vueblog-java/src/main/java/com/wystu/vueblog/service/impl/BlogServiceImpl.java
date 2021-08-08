package com.wystu.vueblog.service.impl;

import com.wystu.vueblog.entity.Blog;
import com.wystu.vueblog.mapper.BlogMapper;
import com.wystu.vueblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
