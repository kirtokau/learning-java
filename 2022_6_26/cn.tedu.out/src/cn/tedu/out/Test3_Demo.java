package cn.tedu.out;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Test3_Demo {

	public static void main(String[] args) {
		//开发思路：读取源文件，写出到目标文件中
		System.out.println("请输入源文件路径");
		String f=new Scanner(System.in).nextLine();
		File from=new File(f);
		
		System.out.println("请输入目标文件路径：");
		String t=new Scanner(System.in).nextLine();
		File to=new File(t);
		
		//ZFcopy(from,to);//完成文件复制--字符流--只能操作字符文件
		ZJcopy(from,to);//完成文件复制--字节流--操作啥都行
	}

	private static void ZJcopy(File from, File to) {
		InputStream in=null;
		OutputStream out=null;
		try {
			//读取from文件--字节流
			in=new BufferedInputStream(new FileInputStream(from));
			//写到to文件--字节流
			out=new BufferedOutputStream(new FileOutputStream(to));
			//边读边写
			int b=0;//定义变量，记录读取到的数据
			while((b=in.read())!=-1){
				//定义变量，记录读取到的数据
				out.write(b);//写出到文件中
			}
			System.out.println("文件复制完成！！");	
		} catch (IOException e) {
			System.out.println("文件复制失败！！");
			e.printStackTrace();//正常打印报错信息
		}finally {
			//释放资源，放到finally块中
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	private static void ZFcopy(File from,File to) {
		Reader in=null;
		Writer out=null;
		try {
			//读取from文件 --字符流
			in=new BufferedReader(new FileReader(from));
			//写出to文件--字符流
			out=new BufferedWriter(new FileWriter(to));
			//边读编写
			int b=0;
			while((b=in.read())!=-1) {
				out.write(b);//写出到文件中
			}
			System.out.println("文件复制完成！！");
		} catch (IOException e) {
			System.out.println("文件复制失败！！");
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
