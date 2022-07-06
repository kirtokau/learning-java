package cn.tedu.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//��������������������ķ�������
//����������
//���տͻ��˵���������
//��ÿ���ͻ��˷����Ӧ�Ļ���Ա
//����Ա����Ҫ����Ϳͻ���ͨI/O
public class Server2 {
    //��������������1��2��3
	public void service() {
    //�ڷ������ˣ�ʹ�ö��߳̿�������ÿ���ͻ���֮�䲻�õȴ�
	new Thread() {
		//��������+�����ڲ��ࣨ��дrun����)
		//��ҵ��д��run()��
		@Override
		public void run() {
			try {
				//����������������8000�˿ڴ��ȴ��ͻ�������
				ServerSocket server=new ServerSocket(8000);
				System.out.println("�����������ɹ�...");
				while(true) {
					//һֱ�������пͻ��˵���������
					Socket socket=server.accept();
					System.out.println("�ͻ������ӳɹ�...");
					//��ÿ���ͻ��˷����Ӧ�Ļ���Ա
					HuaWuThread t=new HuaWuThread(socket);
					t.start();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}.start();
  }
	//����Ա����Ҫ����Ϳͻ���ͨI/O
	class HuaWuThread extends Thread{
		Socket socket;//����ͨ��
		public HuaWuThread(Socket socket) {
			this.socket=socket;
		}
		//��ҵ�����run(),һֱ��ȡ�ͻ��˷��������ݣ���������������
		@Override
		public void run() {
			try {
				//��ȡһ��BufferedReader,����д��һ��PrintWriter
				BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				//��ȡ�ͻ��˷�����һ������
				String line;//�����������¼��ȡ����һ�е�����
				while((line=in.readLine())!=null) {
					//ֻҪ�����ݾ�һֱ��
					System.out.println("�ͻ��˷���������ʱ��"+line);
					System.out.println("����������Ҫ���ͻ��˻��������ݣ�");
					String input=new Scanner(System.in).nextLine();
					out.println(input);//���ͻ������Ļ�������
					out.flush();//������ˢ��ȥ
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
			
		
	
	
	

       
	

