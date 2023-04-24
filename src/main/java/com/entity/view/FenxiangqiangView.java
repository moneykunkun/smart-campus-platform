package com.entity.view;

import com.entity.FenxiangqiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分享墙
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@TableName("fenxiangqiang")
public class FenxiangqiangView  extends FenxiangqiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenxiangqiangView(){
	}
 
 	public FenxiangqiangView(FenxiangqiangEntity fenxiangqiangEntity){
 	try {
			BeanUtils.copyProperties(this, fenxiangqiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
