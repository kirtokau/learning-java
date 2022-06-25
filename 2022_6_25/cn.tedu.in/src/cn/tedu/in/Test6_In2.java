package cn.tedu.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test6_In2 {

	public static void main(String[] args) {
//		method();//字符流的读取
		method2();//高效的字符流读取
	}
	private static void method2() {
		try {
			//BufferedReader是高效的字符读取流，原因是底层维护了一个char[]，默认的容量也是8*1024字节就是8K
			//1、创建对象
			Reader in2=new BufferedReader(new FileReader("D:\\teach\\1.txt"));
		    //2、开始读取
			int b;//定义变量，记录读取到的数据
			while((b=in2.read())!=-1) {
				//只要有数据，就一直读
				System.out.println(b);
			}
			//3、释放资源
			in2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void method() {
		try {
			//1、创建对象
//			Reader in=new Reader();//Reader是字符流读取的父类，但是是一个抽象类，不能new 
//		    Reader in=new FileReader(new File("D:\\teach\\1.txt"));
		    Reader in2=new FileReader("D:\\teach\\1.txt");
		    
		    //2、开始读取
//		    System.out.println(in2.read());一个字符一个字符读取
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());-1,没数据了
//		    System.out.println(in2.read());-1,没数据了
		    int b;//定义变量，记录读取到的数据
		    while((b=in2.read())!=-1) {
		    	//只要有数据，就一直读
		    	System.out.println(b);
		    }
		    //释放资源
		    in2.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
