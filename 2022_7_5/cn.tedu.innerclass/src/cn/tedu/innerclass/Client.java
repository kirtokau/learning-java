package cn.tedu.innerclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//�����������ʾSocket��̵Ŀͻ��ˣ����շ��������������ݺ͸��������������ݵķ�����
//ָ��Ҫ���ӵķ�����
//������������hello
public class Client {

	public static void main(String[] args) throws Exception {
		//ָ��Ҫ���ӵķ���������ͬʱָ����������ip��ַ������Ǳ���ip��ַ�ǹ̶�ֵ�����£��Ͷ˿ں�
		Socket socket=new Socket("127.0.0.1",8000);
		//��ȡ�����������������������hello
		OutputStream out=socket.getOutputStream();
		//��hello�ַ�������ֽ�����byte[]����д��
		out.write("hello".getBytes());
		out.flush();//������ˢ��ȥ�����ǲ�����
		//��ȡ�ӷ�����������������
		InputStream in=socket.getInputStream();
		for(int i=0;i<5;i++) {
		//int b=in.read();
		//һ��һ����ȡ���е��ַ�
		char b=(char)in.read();
		System.out.println(b);//ͬ��չʾ
		}
		//�ͷ���Դ
		in.close();
		socket.close();

	}

}
