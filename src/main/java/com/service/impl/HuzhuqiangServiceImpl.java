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


import com.dao.HuzhuqiangDao;
import com.entity.HuzhuqiangEntity;
import com.service.HuzhuqiangService;
import com.entity.vo.HuzhuqiangVO;
import com.entity.view.HuzhuqiangView;

@Service("huzhuqiangService")
public class HuzhuqiangServiceImpl extends ServiceImpl<HuzhuqiangDao, HuzhuqiangEntity> implements HuzhuqiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuzhuqiangEntity> page = this.selectPage(
                new Query<HuzhuqiangEntity>(params).getPage(),
                new EntityWrapper<HuzhuqiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuzhuqiangEntity> wrapper) {
		  Page<HuzhuqiangView> page =new Query<HuzhuqiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuzhuqiangVO> selectListVO(Wrapper<HuzhuqiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuzhuqiangVO selectVO(Wrapper<HuzhuqiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuzhuqiangView> selectListView(Wrapper<HuzhuqiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuzhuqiangView selectView(Wrapper<HuzhuqiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
