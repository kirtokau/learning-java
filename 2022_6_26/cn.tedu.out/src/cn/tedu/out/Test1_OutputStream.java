package cn.tedu.out;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//这个类用来测试字节输出流
//效率问题：BufferedOutputStream>FileOututStream
//因为BufferedOutputStream底层为一个byte[],默认容量是8*1024字节相当于8K
//可以减少和磁盘的交互次数，提高执行效率
public class Test1_OutputStream {

	public static void main(String[] args) {
		method();//使用普通的字节输出流对象输出数据FileOutputStream
//		method2();//使用高级的字节输出流对象输出数据BufferedOutputStream
	}
	private static void method2(){
		OutputStream out=null;//声明out变量，因为final要用
		try {
			//创建输出流对象
			out=new BufferedOutputStream(new FileOutputStream("D:\\teach\\a.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method() {
		OutputStream out2=null;
		try {
			//创建输出流对象
//			OutputStream out2=new OutputSream();//报错是因为OutputStream是抽象类不能new
		    //OutputStream out=new FileOutputStream(new File("D:\\teach\\a.txt");
		      out2=new FileOutputStream("D:\\teach\\a.txt");
		    //开始写出数据
		      out2.write(97);
		      out2.write(97);
		      out2.write(98);
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//要保证代码一定会执行就放在finally块中
			try {
				//释放资源 --必须放入finally中，保证资源一定会释放
				out2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	    
	}
}

