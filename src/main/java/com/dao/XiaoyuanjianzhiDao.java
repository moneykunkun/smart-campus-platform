package com.dao;

import com.entity.XiaoyuanjianzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanjianzhiVO;
import com.entity.view.XiaoyuanjianzhiView;


/**
 * 校园兼职
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface XiaoyuanjianzhiDao extends BaseMapper<XiaoyuanjianzhiEntity> {
	
	List<XiaoyuanjianzhiVO> selectListVO(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
	
	XiaoyuanjianzhiVO selectVO(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
	
	List<XiaoyuanjianzhiView> selectListView(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);

	List<XiaoyuanjianzhiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
	
	XiaoyuanjianzhiView selectView(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
	

}
