package cn.tedu.innerclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//这个类用来表示Socket编程的客户端：接收服务器发来的数据和给服务器发送数据的服务器
//指定要连接的服务器
//给服务器发送hello
public class Client {

	public static void main(String[] args) throws Exception {
		//指定要连接的服务器，并同时指定服务器的ip地址（如果是本机ip地址是固定值，如下）和端口号
		Socket socket=new Socket("127.0.0.1",8000);
		//获取到输出流，并给服务器发送hello
		OutputStream out=socket.getOutputStream();
		//把hello字符串变成字节数组byte[]进行写出
		out.write("hello".getBytes());
		out.flush();//把数据刷出去，但是不关流
		//读取从服务器发回来的数据
		InputStream in=socket.getInputStream();
		for(int i=0;i<5;i++) {
		//int b=in.read();
		//一个一个读取流中的字符
		char b=(char)in.read();
		System.out.println(b);//同行展示
		}
		//释放资源
		in.close();
		socket.close();

	}

}
