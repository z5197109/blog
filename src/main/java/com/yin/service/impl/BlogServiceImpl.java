package com.yin.service.impl;

import com.yin.entity.Blog;
import com.yin.mapper.BlogMapper;
import com.yin.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MarkerHub
 * @since 2022-01-17
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
