package cn.tedu.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Test4_Batch {

	public static void main(String[] args) throws IOException {
		// 开发思路：读取源文件，写出到目标文件中
		System.out.println("请输入源文件路径");
		String f=new Scanner(System.in).nextLine();
		File from=new File(f);
		
		System.out.println("请输入目标文件路径");
		String t=new Scanner(System.in).nextLine();
		File to=new File(t);
		
		ZJcopy(from,to);//完成文件复制--字节流--操作啥都行			
	}
	
	private static void ZJcopy(File from,File to) throws IOException  {
		InputStream in=null;
		OutputStream out=null;
		try {
			//读取from文件--字节流
			in=new BufferedInputStream(new FileInputStream(from));
			out=new BufferedOutputStream(new FileOutputStream(to));
		
			//边读边写
			int b=0;
			//read()是使用的字节流读取的，所以目前是一个字节一个字节的读
			//想实现批量读，使用read(byte[]bs)的重载形式，可以按照数组的方式去读
			byte[]bs=new byte[8*1024];//可以自定义，建议像源码里一样的容量，8*1024字节8K
			while((b=in.read(bs))!=-1) {
				//没数据读取时就返回-1
				//想批量写，使用write(byte[]bs)的重载形式，可以按照数组的方式去写
				out.write(bs);//写出到文件中
			}
			System.out.println("文件复制完成!!");		
		}catch(IOException e){
			System.out.println("文件复制失败!!");
			e.printStackTrace();//正常打印报错信息
		}finally {
			//释放资源，放到finally块中
			try {
				in.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		   try {
			     out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	}

}
