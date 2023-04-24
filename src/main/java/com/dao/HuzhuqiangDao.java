package com.dao;

import com.entity.HuzhuqiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuzhuqiangVO;
import com.entity.view.HuzhuqiangView;


/**
 * 互助墙
 * 
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface HuzhuqiangDao extends BaseMapper<HuzhuqiangEntity> {
	
	List<HuzhuqiangVO> selectListVO(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
	
	HuzhuqiangVO selectVO(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
	
	List<HuzhuqiangView> selectListView(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);

	List<HuzhuqiangView> selectListView(Pagination page,@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
	
	HuzhuqiangView selectView(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
	

}
