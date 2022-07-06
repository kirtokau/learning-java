package cn.tedu.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//这个类用来做回声案例的客户端
//连接指定的服务器
//一直给服务器发送数据
//一直接收服务器回声的数据
public class Client2 {

	public static void main(String[] args) {
		try {
			//连接指定的服务器，同时指定服务器的ip和端口号
			Socket socket=new Socket("127.0.0.1",8000);
			//一直给服务器发送数据
			while(true) {
			//向服务器写出一行数据，并且读取服务器回声回来的一行数据
			PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//一直发送一直读取
			System.out.println("请输入您想要给服务器端发送的数据：");
			String input=new Scanner(System.in).nextLine();
			out.print(input);//向服务器发送了指定数据
			out.flush();//把数据刷出去
			
			String line=in.readLine();//读取回声数据
			System.out.println("服务器的回声数据是："+line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
