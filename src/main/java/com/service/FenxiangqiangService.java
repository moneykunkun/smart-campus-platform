package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxiangqiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxiangqiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxiangqiangView;


/**
 * 分享墙
 *
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface FenxiangqiangService extends IService<FenxiangqiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxiangqiangVO> selectListVO(Wrapper<FenxiangqiangEntity> wrapper);
   	
   	FenxiangqiangVO selectVO(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
   	
   	List<FenxiangqiangView> selectListView(Wrapper<FenxiangqiangEntity> wrapper);
   	
   	FenxiangqiangView selectView(@Param("ew") Wrapper<FenxiangqiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxiangqiangEntity> wrapper);
   	

}

