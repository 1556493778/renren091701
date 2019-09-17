package io.renren.modules.message.dao;

import io.renren.modules.message.entity.MessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-10 14:22:18
 */
@Mapper
public interface MessageDao extends BaseMapper<MessageEntity> {
	
}
