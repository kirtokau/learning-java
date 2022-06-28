package cn.tedu.encoding;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//这个类用来测试编码转换流
//测试写出的编码转换流：OutputStreamWriter用来把字节流转换成字符流
//总结：
//编码转换流OutputStreamWriter用来把字节流转换成字符流
//最大的目的是害怕中文汉字从字节流变成字符流时，出现乱码
//可以通过转换流设置编码集，来防止中文乱码
public class Test2_Encode {

	public static void main(String[] args) {
		try {
			//创建OutputStreamWriter对象--是使用了平台的默认编码gbk编码，保存和打开的方式都是一张表gbk不会乱码
			//OutputStreamWriter out=new OutputStreamWriter(
			//1.txt文件㐊磁盘的路径，而是直接写出在工程下面和src统计(需要f5刷新出来)
//			      new FileOutputStream("1.txt"),"gbk");
			OutputStreamWriter out=new OutputStreamWriter(
					//第二个参数"gbk",用来解决乱码，如果参数和保存时用的是一张表就不会乱码，否则就乱码)
					//比如默认保存时用的编码gbk,参数也是gbk就不乱码，如果参数是utf-8、iso-8859-1就会乱码
					new FileOutputStream("D:\\teach\\1.txt"),"gbk");
			//写出数据
			out.write("蔡徐坤");
			//释放资源
			out.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
