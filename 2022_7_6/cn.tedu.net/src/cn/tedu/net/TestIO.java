package cn.tedu.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//�������������һ��һ�ж�ȡ��һ��һ��д��
//��ȡһ������BufferedReader.readLine()
//һ��һ��д��PrintWriter.println()
public class TestIO {

	public static void main(String[] args) {
		try {
			//����BufferedReader����
			BufferedReader in=new BufferedReader(new FileReader("D:\\teach\\1.txt")); 
			String line;//�����������¼ÿ�ж�ȡ��������
			//readLine()��ȡһ��ʱ�����ȡ�����ǣ����з�\r\n
			//ֻҪ�����ݾ�һֱ��ȡ��û����ʱ��readLine()����Null
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			//�ͷ���Դ
			in.close();
			//һ��һ��д�� PrintWriter.println()
			PrintWriter out=new PrintWriter(new FileWriter("D:\\teach\\1.txt"));
			out.print("hello");
			out.print("java");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
