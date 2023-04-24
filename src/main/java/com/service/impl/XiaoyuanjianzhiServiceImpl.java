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


import com.dao.XiaoyuanjianzhiDao;
import com.entity.XiaoyuanjianzhiEntity;
import com.service.XiaoyuanjianzhiService;
import com.entity.vo.XiaoyuanjianzhiVO;
import com.entity.view.XiaoyuanjianzhiView;

@Service("xiaoyuanjianzhiService")
public class XiaoyuanjianzhiServiceImpl extends ServiceImpl<XiaoyuanjianzhiDao, XiaoyuanjianzhiEntity> implements XiaoyuanjianzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanjianzhiEntity> page = this.selectPage(
                new Query<XiaoyuanjianzhiEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanjianzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanjianzhiEntity> wrapper) {
		  Page<XiaoyuanjianzhiView> page =new Query<XiaoyuanjianzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanjianzhiVO> selectListVO(Wrapper<XiaoyuanjianzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanjianzhiVO selectVO(Wrapper<XiaoyuanjianzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanjianzhiView> selectListView(Wrapper<XiaoyuanjianzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanjianzhiView selectView(Wrapper<XiaoyuanjianzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
