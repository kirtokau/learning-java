package cn.tedu.bigdecimal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test5_In {

	public static void main(String[] args) {
		method();//字节流读取
		method2();//高效的字节流读取
	}

	private static void method() {
		try {
			  //1、创建字节流的读取对象
			  //InputStream in=new InputStream();//InputStream是字节读取流的父类，但是是抽象类，不能new 
			  //InputStream in=new FileInputStream(new File("D:\\teach\\1.txt"));
			InputStream in2=new FileInputStream("D:\\teach\\1.txt");
			  
			//开始读取，read()读取到数据的末尾，返回-1
   //		System.out.println(in2.read());//一个字节一个字节开始读
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());//-1，没数据了
//		    System.out.println(in2.read());//-1,没数据了
			//需求：重复的读取每个字节
		    int b;//定义变量，记录读取到的数据
		    while((b=in2.read())!=-1) {
		    	//b!=-1，也就是有数据就一直读取
		    	System.out.println(b);
		    }
		    //释放资源
		    in2.close();	
	}catch(IOException e){
		e.printStackTrace();
	}		
}
	private static void method2() {
		try {
			//BufferedInputStream是高效的读取流：原因在于底层维护了一个Byte[],默认大小是8*1024字节
			//1、创建字节流的读取对象
			InputStream in2=new BufferedInputStream(new FileInputStream("D:\\teach\\1.txt"));
			
			//2、开始读取，read()读取到数据的末尾，返回-1
			//需求：重复的读取每个字节
			int b;//定义变量，记录读取到的数据
			while((b=in2.read())!=-1) {
				//b!=-1,也就是有数据就一直读取
				System.out.println(b);
			}
			//释放资源
			in2.close();
		} catch (IOException e) {
			e.printStackTrace();		
	}
  }	
}
     
     
