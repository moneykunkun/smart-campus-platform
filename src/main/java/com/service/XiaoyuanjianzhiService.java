package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanjianzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanjianzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanjianzhiView;


/**
 * 校园兼职
 *
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface XiaoyuanjianzhiService extends IService<XiaoyuanjianzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanjianzhiVO> selectListVO(Wrapper<XiaoyuanjianzhiEntity> wrapper);
   	
   	XiaoyuanjianzhiVO selectVO(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
   	
   	List<XiaoyuanjianzhiView> selectListView(Wrapper<XiaoyuanjianzhiEntity> wrapper);
   	
   	XiaoyuanjianzhiView selectView(@Param("ew") Wrapper<XiaoyuanjianzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanjianzhiEntity> wrapper);
   	

}

