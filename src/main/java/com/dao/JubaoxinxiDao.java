package com.dao;

import com.entity.JubaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubaoxinxiVO;
import com.entity.view.JubaoxinxiView;


/**
 * 举报信息
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface JubaoxinxiDao extends BaseMapper<JubaoxinxiEntity> {
	
	List<JubaoxinxiVO> selectListVO(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	JubaoxinxiVO selectVO(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	List<JubaoxinxiView> selectListView(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);

	List<JubaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	JubaoxinxiView selectView(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	

}
