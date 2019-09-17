package io.renren.modules.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.message.entity.MessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-10 14:22:18
 */
public interface MessageService extends IService<MessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

