package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author zwd
 * @email zwd@atguigu.com
 * @date 2021-05-13 23:13:02
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
