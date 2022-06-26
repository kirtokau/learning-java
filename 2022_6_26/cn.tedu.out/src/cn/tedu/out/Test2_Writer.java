package cn.tedu.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//这个类用来测试字符流输出数据
//效率问题：BufferedWriter>FileWriter,因为BufferedWriter底层为一个char[],默认大小是8*1024字节相当于8K
//写出时，把数据填满数组后一把保存在磁盘中，比一个一个给要快，减少了程序和磁盘的交互次数，提高程序的执行效率
public class Test2_Writer {

	public static void main(String[] args) throws IOException {
		method();//普通的字符流输出数据
//		method2();//高效的字符流输出数据
	}
	private static void method2() throws IOException {
		Writer out=null;
		try {
			//创建字符输出流对象
			//out=new BufferedWriter(new FileWriter("D:\\iotest\\a.txt"));//在覆盖数据
			 out = new BufferedWriter(new FileWriter("D:\\teach\\a.txt",true));
			//开始写出数据
			 out.write(90);
			 out.write(91);
			 out.write(92);
			 out.write("io");
			 out.write("test");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//释放资源，放入finally中，保证资源一定会被释放
			try {
				out.close();
			    } catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void method() throws IOException {
		Writer out2=null;//声明变量，因为finally要用
		try {
			//创建字符输出流对象
			//Writer out=new Writer();//报错，因为Writer是抽象类不能new
			//Writer out=new FileReader(new File(D:\\iotest\\a.txt");
			//out2=new FileWrier("D:\\teach\\a.txt");//默认就是覆盖数据的模式
			//需求保持原有数据，在原有数据的末尾处追加数据
			out2=new FileWriter("D:\\teach\\a.txt",true);//true表示要追加数据
			//开始写出数据
			out2.write(100);
			out2.write("hello");
			out2.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			//释放资源，放入fianlly块中，保证资源一定会被释放
			out2.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

 }
}
