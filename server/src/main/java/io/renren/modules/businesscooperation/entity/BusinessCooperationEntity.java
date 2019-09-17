package io.renren.modules.businesscooperation.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author agen
 * @email sunlightcs@gmail.com
 * @date 2019-09-13 14:04:39
 */
@Data
@TableName("business_cooperation")
public class BusinessCooperationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 商务客服
	 */
	private String businessCo;
	/**
	 * 技术支持
	 */
	private String technicalSu;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 跳转链接
	 */
	private String url;

}
