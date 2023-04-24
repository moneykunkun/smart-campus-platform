package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaoyuanjianzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaoyuanjianzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaoyuanjianzhiView;


/**
 * 校园兼职评论表
 *
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
public interface DiscussxiaoyuanjianzhiService extends IService<DiscussxiaoyuanjianzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaoyuanjianzhiVO> selectListVO(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
   	
   	DiscussxiaoyuanjianzhiVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
   	
   	List<DiscussxiaoyuanjianzhiView> selectListView(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
   	
   	DiscussxiaoyuanjianzhiView selectView(@Param("ew") Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper);
   	

}

