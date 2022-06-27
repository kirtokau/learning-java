package cn.tedu.Serialzable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1_Seria {

	public static void main(String[] args) {
//		 method();//序列化
		method2();//反序列化
	}
	private static void method2(){
		try {
			//创建ObjectInputStream对象完成反序列化
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\teach\\1.txt"));
			//指定要读取的对象
			Object o=in.readObject();
			//默认打印了对象的地址值，我想看对象的属性值，重写了toString()
			//cn.tedu.serial.Student@33909752
			System.out.println(o);
			//释放资源
		  in.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void method() {
		try {
			//创建ObjectOutputStream对象完成序列化
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:\\teach\\1.txt"));
			//指定要输出的独享
			Student obj=new Student("jack",20,"北京");
			out.writeObject(obj);
			//释放资源
			out.close();
			System.out.println("序列化完成！！");
		}catch(IOException e) {
			System.out.println("序列化失败！！");
			e.printStackTrace();
		}
	}

}
