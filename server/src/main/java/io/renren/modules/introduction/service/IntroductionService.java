package io.renren.modules.introduction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.introduction.entity.IntroductionEntity;

import java.util.Map;

/**
 * 
 *
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-02 09:55:40
 */
public interface IntroductionService extends IService<IntroductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

