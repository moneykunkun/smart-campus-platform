package com.entity.view;

import com.entity.DiscussxiaoyuanjianzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园兼职评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@TableName("discussxiaoyuanjianzhi")
public class DiscussxiaoyuanjianzhiView  extends DiscussxiaoyuanjianzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxiaoyuanjianzhiView(){
	}
 
 	public DiscussxiaoyuanjianzhiView(DiscussxiaoyuanjianzhiEntity discussxiaoyuanjianzhiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxiaoyuanjianzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
