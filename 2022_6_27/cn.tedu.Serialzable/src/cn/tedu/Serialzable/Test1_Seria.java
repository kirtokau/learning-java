package cn.tedu.Serialzable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1_Seria {

	public static void main(String[] args) {
//		 method();//���л�
		method2();//�����л�
	}
	private static void method2(){
		try {
			//����ObjectInputStream������ɷ����л�
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\teach\\1.txt"));
			//ָ��Ҫ��ȡ�Ķ���
			Object o=in.readObject();
			//Ĭ�ϴ�ӡ�˶���ĵ�ֵַ�����뿴���������ֵ����д��toString()
			//cn.tedu.serial.Student@33909752
			System.out.println(o);
			//�ͷ���Դ
		  in.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void method() {
		try {
			//����ObjectOutputStream����������л�
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:\\teach\\1.txt"));
			//ָ��Ҫ����Ķ���
			Student obj=new Student("jack",20,"����");
			out.writeObject(obj);
			//�ͷ���Դ
			out.close();
			System.out.println("���л���ɣ���");
		}catch(IOException e) {
			System.out.println("���л�ʧ�ܣ���");
			e.printStackTrace();
		}
	}

}
