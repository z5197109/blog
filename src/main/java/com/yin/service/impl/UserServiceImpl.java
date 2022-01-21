package com.yin.service.impl;

import com.yin.entity.User;
import com.yin.mapper.UserMapper;
import com.yin.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
