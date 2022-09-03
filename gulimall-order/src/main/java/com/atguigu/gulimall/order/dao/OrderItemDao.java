package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhanbp
 * @email zhanbp_swufer@163.com
 * @date 2022-03-19 22:31:49
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
