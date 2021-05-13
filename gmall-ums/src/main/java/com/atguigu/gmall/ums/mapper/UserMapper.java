package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author zwd
 * @email zwd@atguigu.com
 * @date 2021-05-14 00:15:44
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
