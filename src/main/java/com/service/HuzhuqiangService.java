package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuzhuqiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuzhuqiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuzhuqiangView;


/**
 * 互助墙
 *
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface HuzhuqiangService extends IService<HuzhuqiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuzhuqiangVO> selectListVO(Wrapper<HuzhuqiangEntity> wrapper);
   	
   	HuzhuqiangVO selectVO(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
   	
   	List<HuzhuqiangView> selectListView(Wrapper<HuzhuqiangEntity> wrapper);
   	
   	HuzhuqiangView selectView(@Param("ew") Wrapper<HuzhuqiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuzhuqiangEntity> wrapper);
   	

}

