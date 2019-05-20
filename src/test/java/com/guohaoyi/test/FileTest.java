package com.guohaoyi.test;

import org.junit.Test;

import com.guohaoyi.util.FileUtil;

//File测试类
public class FileTest {

	@Test
	public void test1(){
		/**
		 * 返回扩展名
		 */
		String extendName = FileUtil.getExtendName("a.ord");
		System.out.println("当前文件扩展名："+extendName);
		
		/**
		 *返回系统临时目录
		 */
		String tempDirectory = FileUtil.getTempDirectory();
		System.out.println("系统临时目录:"+tempDirectory);
		
		/**
		 * 返回系统用户目录
		 */
		String userDirectory = FileUtil.getUserDirectory();
		System.out.println("操作系统用户目录："+userDirectory);
		
		/**
		 * 返回当前目录
		 */
		String userPath = FileUtil.getUserPath();
		System.out.println("当前工作目录："+userPath);
		
		/**
		 * 当前文件目录
		 */
		String classPath = FileUtil.getClassPath();
		System.out.println("当前文件目录："+classPath);
	}
}
