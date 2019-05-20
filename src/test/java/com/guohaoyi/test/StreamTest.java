package com.guohaoyi.test;
//Stream流测试

import java.io.File;

import org.junit.Test;

import com.guohaoyi.util.FileUtil;
import com.guohaoyi.util.StreamUtil;

public class StreamTest {
	
	/**
	 * 关闭所有流
	 */
	public void test1(){
		
	}

	/**
	 * 传入文本文件对象 ， 返回文件内容 。 之后关闭
	 */
	@Test
	public void test2(){
		File srcFile = new File("E:\\mysql\\a.txt");
		String readTextFile = StreamUtil.readTextFile(srcFile);
		System.out.println(readTextFile);
	}
	
	/**
	 * 重载方法二 还有实现方法一
	 */
	public void test3(){
		File srcFile = new File("E:\\mysql\\a.txt");
		String readTextFile = StreamUtil.readTextFile(srcFile);
		System.out.println(readTextFile);
	}
}
