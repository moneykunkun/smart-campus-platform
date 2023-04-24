package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiaoyuanjianzhiEntity;
import com.entity.view.XiaoyuanjianzhiView;

import com.service.XiaoyuanjianzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 校园兼职
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@RestController
@RequestMapping("/xiaoyuanjianzhi")
public class XiaoyuanjianzhiController {
    @Autowired
    private XiaoyuanjianzhiService xiaoyuanjianzhiService;

    @Autowired
    private StoreupService storeupService;



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaoyuanjianzhiEntity xiaoyuanjianzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xiaoyuanjianzhi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaoyuanjianzhiEntity> ew = new EntityWrapper<XiaoyuanjianzhiEntity>();
		PageUtils page = xiaoyuanjianzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanjianzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaoyuanjianzhiEntity xiaoyuanjianzhi, 
		HttpServletRequest request){
        EntityWrapper<XiaoyuanjianzhiEntity> ew = new EntityWrapper<XiaoyuanjianzhiEntity>();
		PageUtils page = xiaoyuanjianzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanjianzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaoyuanjianzhiEntity xiaoyuanjianzhi){
       	EntityWrapper<XiaoyuanjianzhiEntity> ew = new EntityWrapper<XiaoyuanjianzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaoyuanjianzhi, "xiaoyuanjianzhi")); 
        return R.ok().put("data", xiaoyuanjianzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaoyuanjianzhiEntity xiaoyuanjianzhi){
        EntityWrapper< XiaoyuanjianzhiEntity> ew = new EntityWrapper< XiaoyuanjianzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaoyuanjianzhi, "xiaoyuanjianzhi")); 
		XiaoyuanjianzhiView xiaoyuanjianzhiView =  xiaoyuanjianzhiService.selectView(ew);
		return R.ok("查询校园兼职成功").put("data", xiaoyuanjianzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaoyuanjianzhiEntity xiaoyuanjianzhi = xiaoyuanjianzhiService.selectById(id);
        return R.ok().put("data", xiaoyuanjianzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaoyuanjianzhiEntity xiaoyuanjianzhi = xiaoyuanjianzhiService.selectById(id);
        return R.ok().put("data", xiaoyuanjianzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoyuanjianzhiEntity xiaoyuanjianzhi, HttpServletRequest request){
    	xiaoyuanjianzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanjianzhi);
        xiaoyuanjianzhiService.insert(xiaoyuanjianzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoyuanjianzhiEntity xiaoyuanjianzhi, HttpServletRequest request){
    	xiaoyuanjianzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanjianzhi);
        xiaoyuanjianzhiService.insert(xiaoyuanjianzhi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaoyuanjianzhiEntity xiaoyuanjianzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaoyuanjianzhi);
        xiaoyuanjianzhiService.updateById(xiaoyuanjianzhi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaoyuanjianzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XiaoyuanjianzhiEntity> wrapper = new EntityWrapper<XiaoyuanjianzhiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xiaoyuanjianzhiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}


}
