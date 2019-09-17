package io.renren.modules.businesscooperation.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.businesscooperation.entity.BusinessCooperationEntity;
import io.renren.modules.businesscooperation.service.BusinessCooperationService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author agen
 * @email sunlightcs@gmail.com
 * @date 2019-09-13 14:04:39
 */
@RestController
@RequestMapping("businesscooperation/businesscooperation")
public class BusinessCooperationController {
    @Autowired
    private BusinessCooperationService businessCooperationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("businesscooperation:businesscooperation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = businessCooperationService.queryPage(params);
        System.out.println(page);
        return R.ok().put("page", page);

    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("businesscooperation:businesscooperation:info")
    public R info(@PathVariable("id") Integer id){
		BusinessCooperationEntity businessCooperation = businessCooperationService.getById(id);

        return R.ok().put("businessCooperation", businessCooperation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("businesscooperation:businesscooperation:save")
    public R save(@RequestBody BusinessCooperationEntity businessCooperation){
		businessCooperationService.save(businessCooperation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("businesscooperation:businesscooperation:update")
    public R update(@RequestBody BusinessCooperationEntity businessCooperation){
		businessCooperationService.updateById(businessCooperation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("businesscooperation:businesscooperation:delete")
    public R delete(@RequestBody Integer[] ids){
		businessCooperationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
