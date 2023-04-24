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


import com.dao.FenxiangqiangDao;
import com.entity.FenxiangqiangEntity;
import com.service.FenxiangqiangService;
import com.entity.vo.FenxiangqiangVO;
import com.entity.view.FenxiangqiangView;

@Service("fenxiangqiangService")
public class FenxiangqiangServiceImpl extends ServiceImpl<FenxiangqiangDao, FenxiangqiangEntity> implements FenxiangqiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxiangqiangEntity> page = this.selectPage(
                new Query<FenxiangqiangEntity>(params).getPage(),
                new EntityWrapper<FenxiangqiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxiangqiangEntity> wrapper) {
		  Page<FenxiangqiangView> page =new Query<FenxiangqiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxiangqiangVO> selectListVO(Wrapper<FenxiangqiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxiangqiangVO selectVO(Wrapper<FenxiangqiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxiangqiangView> selectListView(Wrapper<FenxiangqiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxiangqiangView selectView(Wrapper<FenxiangqiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
