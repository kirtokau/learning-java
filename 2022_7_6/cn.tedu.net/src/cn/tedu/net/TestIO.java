package cn.tedu.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//这个类用来测试一行一行读取，一行一行写出
//读取一行数据BufferedReader.readLine()
//一行一行写出PrintWriter.println()
public class TestIO {

	public static void main(String[] args) {
		try {
			//创建BufferedReader对象
			BufferedReader in=new BufferedReader(new FileReader("D:\\teach\\1.txt")); 
			String line;//定义变量，记录每行读取到的数据
			//readLine()读取一行时，或读取特殊标记：换行符\r\n
			//只要有数据就一直读取，没数据时，readLine()返回Null
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			//释放资源
			in.close();
			//一行一行写出 PrintWriter.println()
			PrintWriter out=new PrintWriter(new FileWriter("D:\\teach\\1.txt"));
			out.print("hello");
			out.print("java");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
