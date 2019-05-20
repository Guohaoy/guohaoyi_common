package com.guohaoyi.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Stream流工具类
public class StreamUtil {

	/**
	 * 批量关闭流
	 * @throws IOException 
	 */
	public static void closeAll(File srcFile,File destFile) throws IOException{
		
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		
			int c;
			while(-1!=(c=in.read())){
				out.write(c);
				out.flush();
			}
			in.close();
			out.close();
	}
	
	/**
	 * 传入文本文件对象 ， 返回文件内容 。 之后关闭
	 */
	public static String readTextFile(File srcFile){
		String str = null;
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileInputStream = new FileInputStream(srcFile);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String data = null;
			while(null != (data=bufferedReader.readLine())){
				str +=  data;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return str;
	}
	
	/**
	 * 传入文本文件对象 ， 重载->返回文件内容,  之后关闭
	 */
	public static String readText(File srcFile){
		String str = null;
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileInputStream = new FileInputStream(srcFile);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String data = null;
			while(null != (data=bufferedReader.readLine())){
				str +=  data;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return str;
	}
}
