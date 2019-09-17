package io.renren.modules.introduction.dao;

import io.renren.modules.introduction.entity.IntroductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-02 09:55:40
 */
@Mapper
public interface IntroductionDao extends BaseMapper<IntroductionEntity> {
	
}
