package cn.tedu.bigdecimal;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test2_File {

	public static void main(String[] args) throws IOException {
		//测试文件流
		//参数是具体的文件路径，这个路径可以使文件路径也可以是文件夹路径
		File file=new File("D:\\teach\\1.txt");
		//测试常用方法
		//文件、文件夹属性
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		
		//创建、删除
		file=new File("D:\\teach\\2.txt");
		System.out.println(file.createNewFile());//创建不存在的文件！！
		
		file=new File("D:\\teach\\m");
		System.out.println(file.mkdir());//创建不存在的单级文件夹
		file=new File("D:\\teach\\o");
		System.out.println(file.mkdirs());//创建不存在的多级文件夹
		System.out.println(file.delete());//删除文件或者删除空的文件夹
		
		//文件夹列表
		file=new File("D:\\teach");
		String[]names=file.list();
		//列出文件夹中的所有文件的名称
		System.out.println(Arrays.toString(names));
		File[]fs=file.listFiles();
		//列出文件夹中的所有文件的文件对象
		System.out.println(Arrays.toString(fs));
		
		

	}

}
