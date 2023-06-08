package com.example.miniGame.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.miniGame.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangyu
 * 用户类mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
