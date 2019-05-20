package com.guohaoyi.util;

import java.io.File;

//File工具类
public class FileUtil {

	/**
	 * 给定一个文件名字，返回该文件的扩展名
	 */
	public static String getExtendName(String FileName){
		String str = FileName;
		int i = str.indexOf(".");
		str=  str.substring(i);
		return str;
	}
	
	/**
	 * 返回系统临时目录
	 */
	public static String getTempDirectory(){
		return System.getProperty("java.io.tmpdir");
	}
	
	/**
	 * 返回系统用户目录
	 */
	public static String getUserDirectory(){
		return System.getProperty("user.home");
	}
	
	/**
	 * 当前工作目录
	 */
	public static String getUserPath(){
		return System.getProperty("user.dir");
	}
	
	/**
	 * 当前文件目录
	 */
	public static String getClassPath(){
		return System.getProperty("java.class.path");
	}
}
