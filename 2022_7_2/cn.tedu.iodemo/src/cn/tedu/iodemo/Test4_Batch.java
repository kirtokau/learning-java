package cn.tedu.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Test4_Batch {

	public static void main(String[] args) throws IOException {
		// ����˼·����ȡԴ�ļ���д����Ŀ���ļ���
		System.out.println("������Դ�ļ�·��");
		String f=new Scanner(System.in).nextLine();
		File from=new File(f);
		
		System.out.println("������Ŀ���ļ�·��");
		String t=new Scanner(System.in).nextLine();
		File to=new File(t);
		
		ZJcopy(from,to);//����ļ�����--�ֽ���--����ɶ����			
	}
	
	private static void ZJcopy(File from,File to) throws IOException  {
		InputStream in=null;
		OutputStream out=null;
		try {
			//��ȡfrom�ļ�--�ֽ���
			in=new BufferedInputStream(new FileInputStream(from));
			out=new BufferedOutputStream(new FileOutputStream(to));
		
			//�߶���д
			int b=0;
			//read()��ʹ�õ��ֽ�����ȡ�ģ�����Ŀǰ��һ���ֽ�һ���ֽڵĶ�
			//��ʵ����������ʹ��read(byte[]bs)��������ʽ�����԰�������ķ�ʽȥ��
			byte[]bs=new byte[8*1024];//�����Զ��壬������Դ����һ����������8*1024�ֽ�8K
			while((b=in.read(bs))!=-1) {
				//û���ݶ�ȡʱ�ͷ���-1
				//������д��ʹ��write(byte[]bs)��������ʽ�����԰�������ķ�ʽȥд
				out.write(bs);//д�����ļ���
			}
			System.out.println("�ļ��������!!");		
		}catch(IOException e){
			System.out.println("�ļ�����ʧ��!!");
			e.printStackTrace();//������ӡ������Ϣ
		}finally {
			//�ͷ���Դ���ŵ�finally����
			try {
				in.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		   try {
			     out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	}

}
