package cn.tedu.innerclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//这个类用来表示Socket编程的服务器端：接收客户端的请求和给客户端做出响应
//启动服务器
//接收客户端的连接请求
//接收客户端发来的数据
public class Server {

	public static void main(String[] args) throws Exception {
		// 启动服务器，并且在8000端口，等待客户端连接
		ServerSocket server=new ServerSocket(8000);
		//接收客户端的连接请求，并建立数据通信通道
		Socket socket=server.accept();
		//获取到读取流，读取客户端发来的数据
		InputStream in=socket.getInputStream();
		//从读取流中，获取发来的hello,需要读取5次
		for(int i=0;i<5;i++) {
		//int b=in.read();//这样子读取是把字符转成数字了
			char c=(char)in.read();//为了直接读取字符
			System.out.println(c);//同行展示
		}
		//给客户端发送数据
		OutputStream out=socket.getOutputStream();
		out.write("world".getBytes());
		out.flush();
		//释放资源
		in.close();
		server.close();
	
	}

}
