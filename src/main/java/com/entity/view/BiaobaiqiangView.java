package com.entity.view;

import com.entity.BiaobaiqiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 表白墙
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@TableName("biaobaiqiang")
public class BiaobaiqiangView  extends BiaobaiqiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiaobaiqiangView(){
	}
 
 	public BiaobaiqiangView(BiaobaiqiangEntity biaobaiqiangEntity){
 	try {
			BeanUtils.copyProperties(this, biaobaiqiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
