package com.entity.model;

import com.entity.BiaobaiqiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 表白墙
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public class BiaobaiqiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 表白内容
	 */
	
	private String biaobaineirong;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 表白时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biaobaishijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：表白内容
	 */
	 
	public void setBiaobaineirong(String biaobaineirong) {
		this.biaobaineirong = biaobaineirong;
	}
	
	/**
	 * 获取：表白内容
	 */
	public String getBiaobaineirong() {
		return biaobaineirong;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：表白时间
	 */
	 
	public void setBiaobaishijian(Date biaobaishijian) {
		this.biaobaishijian = biaobaishijian;
	}
	
	/**
	 * 获取：表白时间
	 */
	public Date getBiaobaishijian() {
		return biaobaishijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
