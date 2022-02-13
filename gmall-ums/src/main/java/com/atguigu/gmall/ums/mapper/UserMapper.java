package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author mahongchang
 * @email 15953043387@163.com
 * @date 2022-02-13 16:45:18
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
