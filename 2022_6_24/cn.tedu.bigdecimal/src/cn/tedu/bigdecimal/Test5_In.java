package cn.tedu.bigdecimal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test5_In {

	public static void main(String[] args) {
		method();//�ֽ�����ȡ
		method2();//��Ч���ֽ�����ȡ
	}

	private static void method() {
		try {
			  //1�������ֽ����Ķ�ȡ����
			  //InputStream in=new InputStream();//InputStream���ֽڶ�ȡ���ĸ��࣬�����ǳ����࣬����new 
			  //InputStream in=new FileInputStream(new File("D:\\teach\\1.txt"));
			InputStream in2=new FileInputStream("D:\\teach\\1.txt");
			  
			//��ʼ��ȡ��read()��ȡ�����ݵ�ĩβ������-1
   //		System.out.println(in2.read());//һ���ֽ�һ���ֽڿ�ʼ��
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());//-1��û������
//		    System.out.println(in2.read());//-1,û������
			//�����ظ��Ķ�ȡÿ���ֽ�
		    int b;//�����������¼��ȡ��������
		    while((b=in2.read())!=-1) {
		    	//b!=-1��Ҳ���������ݾ�һֱ��ȡ
		    	System.out.println(b);
		    }
		    //�ͷ���Դ
		    in2.close();	
	}catch(IOException e){
		e.printStackTrace();
	}		
}
	private static void method2() {
		try {
			//BufferedInputStream�Ǹ�Ч�Ķ�ȡ����ԭ�����ڵײ�ά����һ��Byte[],Ĭ�ϴ�С��8*1024�ֽ�
			//1�������ֽ����Ķ�ȡ����
			InputStream in2=new BufferedInputStream(new FileInputStream("D:\\teach\\1.txt"));
			
			//2����ʼ��ȡ��read()��ȡ�����ݵ�ĩβ������-1
			//�����ظ��Ķ�ȡÿ���ֽ�
			int b;//�����������¼��ȡ��������
			while((b=in2.read())!=-1) {
				//b!=-1,Ҳ���������ݾ�һֱ��ȡ
				System.out.println(b);
			}
			//�ͷ���Դ
			in2.close();
		} catch (IOException e) {
			e.printStackTrace();		
	}
  }	
}
     
     
