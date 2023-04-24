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

import com.entity.FenxiangqiangEntity;
import com.entity.view.FenxiangqiangView;

import com.service.FenxiangqiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 分享墙
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-16 23:12:05
 */
@RestController
@RequestMapping("/fenxiangqiang")
public class FenxiangqiangController {

    @Autowired
    private FenxiangqiangService fenxiangqiangService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FenxiangqiangEntity fenxiangqiang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fenxiangqiang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FenxiangqiangEntity> ew = new EntityWrapper<FenxiangqiangEntity>();
		PageUtils page = fenxiangqiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenxiangqiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FenxiangqiangEntity fenxiangqiang, 
		HttpServletRequest request){
        EntityWrapper<FenxiangqiangEntity> ew = new EntityWrapper<FenxiangqiangEntity>();
		PageUtils page = fenxiangqiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fenxiangqiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FenxiangqiangEntity fenxiangqiang){
       	EntityWrapper<FenxiangqiangEntity> ew = new EntityWrapper<FenxiangqiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fenxiangqiang, "fenxiangqiang")); 
        return R.ok().put("data", fenxiangqiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FenxiangqiangEntity fenxiangqiang){
        EntityWrapper< FenxiangqiangEntity> ew = new EntityWrapper< FenxiangqiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fenxiangqiang, "fenxiangqiang")); 
		FenxiangqiangView fenxiangqiangView =  fenxiangqiangService.selectView(ew);
		return R.ok("查询分享墙成功").put("data", fenxiangqiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FenxiangqiangEntity fenxiangqiang = fenxiangqiangService.selectById(id);
        return R.ok().put("data", fenxiangqiang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FenxiangqiangEntity fenxiangqiang = fenxiangqiangService.selectById(id);
        return R.ok().put("data", fenxiangqiang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        FenxiangqiangEntity fenxiangqiang = fenxiangqiangService.selectById(id);
        if(type.equals("1")) {
        	fenxiangqiang.setThumbsupnum(fenxiangqiang.getThumbsupnum()+1);
        } else {
        	fenxiangqiang.setCrazilynum(fenxiangqiang.getCrazilynum()+1);
        }
        fenxiangqiangService.updateById(fenxiangqiang);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FenxiangqiangEntity fenxiangqiang, HttpServletRequest request){
    	fenxiangqiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenxiangqiang);
        fenxiangqiangService.insert(fenxiangqiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FenxiangqiangEntity fenxiangqiang, HttpServletRequest request){
    	fenxiangqiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fenxiangqiang);
        fenxiangqiangService.insert(fenxiangqiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FenxiangqiangEntity fenxiangqiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fenxiangqiang);
        fenxiangqiangService.updateById(fenxiangqiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fenxiangqiangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FenxiangqiangEntity> wrapper = new EntityWrapper<FenxiangqiangEntity>();
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

		int count = fenxiangqiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
