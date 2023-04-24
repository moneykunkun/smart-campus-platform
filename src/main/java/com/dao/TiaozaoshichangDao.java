package com.dao;

import com.entity.TiaozaoshichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiaozaoshichangVO;
import com.entity.view.TiaozaoshichangView;


/**
 * 跳蚤市场
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface TiaozaoshichangDao extends BaseMapper<TiaozaoshichangEntity> {
	
	List<TiaozaoshichangVO> selectListVO(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	TiaozaoshichangVO selectVO(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	List<TiaozaoshichangView> selectListView(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);

	List<TiaozaoshichangView> selectListView(Pagination page,@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	TiaozaoshichangView selectView(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	

}
