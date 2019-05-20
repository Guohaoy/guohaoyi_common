package com.guohaoyi.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//日期工具类
public class DateUtil {
	
	//返回某月结束日期
	public static String getEnd(String date){
		//格式日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//获取工具类
		Calendar c = getCalendar(date);
		//设置当月
		c.add(Calendar.MONTH,1);
		c.set(Calendar.DAY_OF_MONTH,0);
		//得到最后一天
		Date time = c.getTime();
		//返回
		return df.format(time);
	}

	//返回某月开始日期
	public static String getStart(String date){
		//格式日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//获取工具类
		Calendar c = getCalendar(date);
		//设置当月
		c.set(Calendar.DAY_OF_MONTH,1);
		//得到当月第一天
		Date time = c.getTime();
		//返回
		return df.format(time);
	}
	
	//日期工具类
	public static Calendar getCalendar(String date){
		//日期格式化
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar c = Calendar.getInstance();
		//判断传入值是否为空
		if(date!=null && date.length()>0){
			try {
				Date date2 = df.parse(date);
				c.setTime(date2);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return c;
	}
}
