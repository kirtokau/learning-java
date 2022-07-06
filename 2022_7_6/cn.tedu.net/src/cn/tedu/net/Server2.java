package cn.tedu.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//这个类用来做回声案例的服务器端
//启动服务器
//接收客户端的连接请求
//给每个客户端分配对应的话务员
//话务员：主要负责和客户沟通I/O
public class Server2 {
    //创建方法，负责1和2和3
	public void service() {
    //在服务器端，使用多线程开发，让每个客户端之间不用等待
	new Thread() {
		//匿名对象+匿名内部类（重写run方法)
		//把业务写入run()中
		@Override
		public void run() {
			try {
				//启动服务器，并在8000端口处等待客户端连接
				ServerSocket server=new ServerSocket(8000);
				System.out.println("服务器启动成功...");
				while(true) {
					//一直接收所有客户端的连接请求
					Socket socket=server.accept();
					System.out.println("客户端连接成功...");
					//给每个客户端分配对应的话务员
					HuaWuThread t=new HuaWuThread(socket);
					t.start();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}.start();
  }
	//话务员：主要负责和客户沟通I/O
	class HuaWuThread extends Thread{
		Socket socket;//保持通话
		public HuaWuThread(Socket socket) {
			this.socket=socket;
		}
		//把业务放入run(),一直读取客户端发来的数据，并作出回声数据
		@Override
		public void run() {
			try {
				//读取一行BufferedReader,并且写出一行PrintWriter
				BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				//读取客户端发来的一行数据
				String line;//定义变量，记录读取到的一行的数据
				while((line=in.readLine())!=null) {
					//只要有数据就一直读
					System.out.println("客户端发来的数据时："+line);
					System.out.println("请输入您想要给客户端回声的数据：");
					String input=new Scanner(System.in).nextLine();
					out.println(input);//给客户端做的回声数据
					out.flush();//把数据刷出去
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	        public static void main(String[] args) {
		         Server2 s=new Server2();
		         s.service();
	}	
}
			
		
	
	
	

       
	

