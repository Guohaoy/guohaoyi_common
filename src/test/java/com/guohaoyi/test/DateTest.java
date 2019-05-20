package com.guohaoyi.test;

import org.junit.Test;

import com.guohaoyi.util.DateUtil;

//日期测试类
public class DateTest {

	@Test
	public void test(){
		//获取传入参数当月第一天时间
		String start = DateUtil.getStart(null);
		System.out.println("开始日期："+start);
		//获取传入参数当月最后一天
		String end = DateUtil.getEnd(null);
		System.out.println("结束日期："+end);
	}
}
