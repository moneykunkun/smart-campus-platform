package com.entity.view;

import com.entity.HuzhuqiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 互助墙
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@TableName("huzhuqiang")
public class HuzhuqiangView  extends HuzhuqiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuzhuqiangView(){
	}
 
 	public HuzhuqiangView(HuzhuqiangEntity huzhuqiangEntity){
 	try {
			BeanUtils.copyProperties(this, huzhuqiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
