package io.renren.modules.businesscooperation.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.businesscooperation.dao.BusinessCooperationDao;
import io.renren.modules.businesscooperation.entity.BusinessCooperationEntity;
import io.renren.modules.businesscooperation.service.BusinessCooperationService;


@Service("businessCooperationService")
public class BusinessCooperationServiceImpl extends ServiceImpl<BusinessCooperationDao, BusinessCooperationEntity> implements BusinessCooperationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BusinessCooperationEntity> page = this.page(
                new Query<BusinessCooperationEntity>().getPage(params),
                new QueryWrapper<BusinessCooperationEntity>()
        );

        return new PageUtils(page);
    }

}