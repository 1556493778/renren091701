package io.renren.modules.businesscooperation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.businesscooperation.entity.BusinessCooperationEntity;

import java.util.Map;

/**
 * 
 *
 * @author agen
 * @email sunlightcs@gmail.com
 * @date 2019-09-13 14:04:39
 */
public interface BusinessCooperationService extends IService<BusinessCooperationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

