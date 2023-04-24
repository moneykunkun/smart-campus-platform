package com.entity.view;

import com.entity.XiaoyuanjianzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园兼职
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@TableName("xiaoyuanjianzhi")
public class XiaoyuanjianzhiView  extends XiaoyuanjianzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanjianzhiView(){
	}
 
 	public XiaoyuanjianzhiView(XiaoyuanjianzhiEntity xiaoyuanjianzhiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanjianzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
