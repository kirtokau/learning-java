package cn.tedu.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//��������������������Ŀͻ���
//����ָ���ķ�����
//һֱ����������������
//һֱ���շ���������������
public class Client2 {

	public static void main(String[] args) {
		try {
			//����ָ���ķ�������ͬʱָ����������ip�Ͷ˿ں�
			Socket socket=new Socket("127.0.0.1",8000);
			//һֱ����������������
			while(true) {
			//�������д��һ�����ݣ����Ҷ�ȡ����������������һ������
			PrintWriter out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//һֱ����һֱ��ȡ
			System.out.println("����������Ҫ���������˷��͵����ݣ�");
			String input=new Scanner(System.in).nextLine();
			out.print(input);//�������������ָ������
			out.flush();//������ˢ��ȥ
			
			String line=in.readLine();//��ȡ��������
			System.out.println("�������Ļ��������ǣ�"+line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
