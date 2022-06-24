package cn.tedu.bigdecimal;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test2_File {

	public static void main(String[] args) throws IOException {
		//�����ļ���
		//�����Ǿ�����ļ�·�������·������ʹ�ļ�·��Ҳ�������ļ���·��
		File file=new File("D:\\teach\\1.txt");
		//���Գ��÷���
		//�ļ����ļ�������
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		
		//������ɾ��
		file=new File("D:\\teach\\2.txt");
		System.out.println(file.createNewFile());//���������ڵ��ļ�����
		
		file=new File("D:\\teach\\m");
		System.out.println(file.mkdir());//���������ڵĵ����ļ���
		file=new File("D:\\teach\\o");
		System.out.println(file.mkdirs());//���������ڵĶ༶�ļ���
		System.out.println(file.delete());//ɾ���ļ�����ɾ���յ��ļ���
		
		//�ļ����б�
		file=new File("D:\\teach");
		String[]names=file.list();
		//�г��ļ����е������ļ�������
		System.out.println(Arrays.toString(names));
		File[]fs=file.listFiles();
		//�г��ļ����е������ļ����ļ�����
		System.out.println(Arrays.toString(fs));
		
		

	}

}
