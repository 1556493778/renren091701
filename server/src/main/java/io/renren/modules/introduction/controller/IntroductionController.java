package io.renren.modules.introduction.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.introduction.entity.IntroductionEntity;
import io.renren.modules.introduction.service.IntroductionService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-02 09:55:40
 */
@RestController
@RequestMapping("introduction/introduction")
public class IntroductionController {
    @Autowired
    private IntroductionService introductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("introduction:introduction:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = introductionService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("introduction:introduction:info")
    public R info(@PathVariable("id") Integer id){
		IntroductionEntity introduction = introductionService.getById(id);

        return R.ok().put("introduction", introduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("introduction:introduction:save")
    public R save(@RequestBody IntroductionEntity introduction){
		introductionService.save(introduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("introduction:introduction:update")
    public R update(@RequestBody IntroductionEntity introduction){
		introductionService.updateById(introduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("introduction:introduction:delete")
    public R delete(@RequestBody Integer[] ids){
		introductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
