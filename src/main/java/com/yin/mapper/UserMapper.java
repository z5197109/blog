package com.yin.mapper;

import com.yin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MarkerHub
 * @since 2022-01-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
