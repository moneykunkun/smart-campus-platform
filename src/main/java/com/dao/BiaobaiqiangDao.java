package com.dao;

import com.entity.BiaobaiqiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaobaiqiangVO;
import com.entity.view.BiaobaiqiangView;


/**
 * 表白墙
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface BiaobaiqiangDao extends BaseMapper<BiaobaiqiangEntity> {
	
	List<BiaobaiqiangVO> selectListVO(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	BiaobaiqiangVO selectVO(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	List<BiaobaiqiangView> selectListView(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);

	List<BiaobaiqiangView> selectListView(Pagination page,@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	
	BiaobaiqiangView selectView(@Param("ew") Wrapper<BiaobaiqiangEntity> wrapper);
	

}
