package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zwd
 * @email zwd@atguigu.com
 * @date 2021-05-14 00:07:47
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
