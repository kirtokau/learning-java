package cn.tedu.innerclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//�����������ʾSocket��̵ķ������ˣ����տͻ��˵�����͸��ͻ���������Ӧ
//����������
//���տͻ��˵���������
//���տͻ��˷���������
public class Server {

	public static void main(String[] args) throws Exception {
		// ������������������8000�˿ڣ��ȴ��ͻ�������
		ServerSocket server=new ServerSocket(8000);
		//���տͻ��˵��������󣬲���������ͨ��ͨ��
		Socket socket=server.accept();
		//��ȡ����ȡ������ȡ�ͻ��˷���������
		InputStream in=socket.getInputStream();
		//�Ӷ�ȡ���У���ȡ������hello,��Ҫ��ȡ5��
		for(int i=0;i<5;i++) {
		//int b=in.read();//�����Ӷ�ȡ�ǰ��ַ�ת��������
			char c=(char)in.read();//Ϊ��ֱ�Ӷ�ȡ�ַ�
			System.out.println(c);//ͬ��չʾ
		}
		//���ͻ��˷�������
		OutputStream out=socket.getOutputStream();
		out.write("world".getBytes());
		out.flush();
		//�ͷ���Դ
		in.close();
		server.close();
	
	}

}
