package io.renren.modules.message.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.message.entity.MessageEntity;
import io.renren.modules.message.service.MessageService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-10 14:22:18
 */
@RestController
@RequestMapping("message/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("message:message:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = messageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("message:message:info")
    public R info(@PathVariable("id") Integer id){
		MessageEntity message = messageService.getById(id);

        return R.ok().put("message", message);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("message:message:save")
    public R save(@RequestBody MessageEntity message){
        messageService.save(message);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("message:message:update")
    public R update(@RequestBody MessageEntity message){
		messageService.updateById(message);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("message:message:delete")
    public R delete(@RequestBody Integer[] ids){
		messageService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
