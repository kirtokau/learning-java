package cn.tedu.out;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Test3_Demo {

	public static void main(String[] args) {
		//����˼·����ȡԴ�ļ���д����Ŀ���ļ���
		System.out.println("������Դ�ļ�·��");
		String f=new Scanner(System.in).nextLine();
		File from=new File(f);
		
		System.out.println("������Ŀ���ļ�·����");
		String t=new Scanner(System.in).nextLine();
		File to=new File(t);
		
		//ZFcopy(from,to);//����ļ�����--�ַ���--ֻ�ܲ����ַ��ļ�
		ZJcopy(from,to);//����ļ�����--�ֽ���--����ɶ����
	}

	private static void ZJcopy(File from, File to) {
		InputStream in=null;
		OutputStream out=null;
		try {
			//��ȡfrom�ļ�--�ֽ���
			in=new BufferedInputStream(new FileInputStream(from));
			//д��to�ļ�--�ֽ���
			out=new BufferedOutputStream(new FileOutputStream(to));
			//�߶���д
			int b=0;//�����������¼��ȡ��������
			while((b=in.read())!=-1){
				//�����������¼��ȡ��������
				out.write(b);//д�����ļ���
			}
			System.out.println("�ļ�������ɣ���");	
		} catch (IOException e) {
			System.out.println("�ļ�����ʧ�ܣ���");
			e.printStackTrace();//������ӡ������Ϣ
		}finally {
			//�ͷ���Դ���ŵ�finally����
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	private static void ZFcopy(File from,File to) {
		Reader in=null;
		Writer out=null;
		try {
			//��ȡfrom�ļ� --�ַ���
			in=new BufferedReader(new FileReader(from));
			//д��to�ļ�--�ַ���
			out=new BufferedWriter(new FileWriter(to));
			//�߶���д
			int b=0;
			while((b=in.read())!=-1) {
				out.write(b);//д�����ļ���
			}
			System.out.println("�ļ�������ɣ���");
		} catch (IOException e) {
			System.out.println("�ļ�����ʧ�ܣ���");
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
