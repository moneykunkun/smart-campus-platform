package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxiaoyuanjianzhiDao;
import com.entity.DiscussxiaoyuanjianzhiEntity;
import com.service.DiscussxiaoyuanjianzhiService;
import com.entity.vo.DiscussxiaoyuanjianzhiVO;
import com.entity.view.DiscussxiaoyuanjianzhiView;

@Service("discussxiaoyuanjianzhiService")
public class DiscussxiaoyuanjianzhiServiceImpl extends ServiceImpl<DiscussxiaoyuanjianzhiDao, DiscussxiaoyuanjianzhiEntity> implements DiscussxiaoyuanjianzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoyuanjianzhiEntity> page = this.selectPage(
                new Query<DiscussxiaoyuanjianzhiEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoyuanjianzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper) {
		  Page<DiscussxiaoyuanjianzhiView> page =new Query<DiscussxiaoyuanjianzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoyuanjianzhiVO> selectListVO(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoyuanjianzhiVO selectVO(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoyuanjianzhiView> selectListView(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoyuanjianzhiView selectView(Wrapper<DiscussxiaoyuanjianzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
