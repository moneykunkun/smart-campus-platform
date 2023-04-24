package com.dao;

import com.entity.FenxiangqiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxiangqiangVO;
import com.entity.view.FenxiangqiangView;


/**
 * 分享墙
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface FenxiangqiangDao extends BaseMapper<FenxiangqiangEntity> {
	
	List<FenxiangqiangVO> selectListVO(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
	
	FenxiangqiangVO selectVO(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
	
	List<FenxiangqiangView> selectListView(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);

	List<FenxiangqiangView> selectListView(Pagination page,@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
	
	FenxiangqiangView selectView(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
	

}
