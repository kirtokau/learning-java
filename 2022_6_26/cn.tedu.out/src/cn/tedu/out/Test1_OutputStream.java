package cn.tedu.out;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//��������������ֽ������
//Ч�����⣺BufferedOutputStream>FileOututStream
//��ΪBufferedOutputStream�ײ�Ϊһ��byte[],Ĭ��������8*1024�ֽ��൱��8K
//���Լ��ٺʹ��̵Ľ������������ִ��Ч��
public class Test1_OutputStream {

	public static void main(String[] args) {
		method();//ʹ����ͨ���ֽ�����������������FileOutputStream
//		method2();//ʹ�ø߼����ֽ�����������������BufferedOutputStream
	}
	private static void method2(){
		OutputStream out=null;//����out��������ΪfinalҪ��
		try {
			//�������������
			out=new BufferedOutputStream(new FileOutputStream("D:\\teach\\a.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method() {
		OutputStream out2=null;
		try {
			//�������������
//			OutputStream out2=new OutputSream();//��������ΪOutputStream�ǳ����಻��new
		    //OutputStream out=new FileOutputStream(new File("D:\\teach\\a.txt");
		      out2=new FileOutputStream("D:\\teach\\a.txt");
		    //��ʼд������
		      out2.write(97);
		      out2.write(97);
		      out2.write(98);
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//Ҫ��֤����һ����ִ�оͷ���finally����
			try {
				//�ͷ���Դ --�������finally�У���֤��Դһ�����ͷ�
				out2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	    
	}
}

