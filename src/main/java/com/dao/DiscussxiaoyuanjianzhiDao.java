package com.dao;

import com.entity.DiscussxiaoyuanjianzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaoyuanjianzhiVO;
import com.entity.view.DiscussxiaoyuanjianzhiView;


/**
 * 校园兼职评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface DiscussxiaoyuanjianzhiDao extends BaseMapper<DiscussxiaoyuanjianzhiEntity> {
	
	List<DiscussxiaoyuanjianzhiVO> selectListVO(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
	
	DiscussxiaoyuanjianzhiVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
	
	List<DiscussxiaoyuanjianzhiView> selectListView(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);

	List<DiscussxiaoyuanjianzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
	
	DiscussxiaoyuanjianzhiView selectView(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
	

}
