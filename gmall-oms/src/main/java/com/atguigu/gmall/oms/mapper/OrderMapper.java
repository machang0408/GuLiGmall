package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mahongchang
 * @email 15953043387@163.com
 * @date 2022-02-13 16:41:52
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
