package io.renren.modules.introduction.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ahui
 * @email sunlightcs@gmail.com
 * @date 2019-09-02 09:55:40
 */
@Data
@TableName("introduction")
public class IntroductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private String titile;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private Integer deleteStatus;

}
