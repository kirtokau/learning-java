package cn.tedu.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//��������������ַ����������
//Ч�����⣺BufferedWriter>FileWriter,��ΪBufferedWriter�ײ�Ϊһ��char[],Ĭ�ϴ�С��8*1024�ֽ��൱��8K
//д��ʱ�����������������һ�ѱ����ڴ����У���һ��һ����Ҫ�죬�����˳���ʹ��̵Ľ�����������߳����ִ��Ч��
public class Test2_Writer {

	public static void main(String[] args) throws IOException {
		method();//��ͨ���ַ����������
//		method2();//��Ч���ַ����������
	}
	private static void method2() throws IOException {
		Writer out=null;
		try {
			//�����ַ����������
			//out=new BufferedWriter(new FileWriter("D:\\iotest\\a.txt"));//�ڸ�������
			 out = new BufferedWriter(new FileWriter("D:\\teach\\a.txt",true));
			//��ʼд������
			 out.write(90);
			 out.write(91);
			 out.write(92);
			 out.write("io");
			 out.write("test");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//�ͷ���Դ������finally�У���֤��Դһ���ᱻ�ͷ�
			try {
				out.close();
			    } catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void method() throws IOException {
		Writer out2=null;//������������ΪfinallyҪ��
		try {
			//�����ַ����������
			//Writer out=new Writer();//������ΪWriter�ǳ����಻��new
			//Writer out=new FileReader(new File(D:\\iotest\\a.txt");
			//out2=new FileWrier("D:\\teach\\a.txt");//Ĭ�Ͼ��Ǹ������ݵ�ģʽ
			//���󱣳�ԭ�����ݣ���ԭ�����ݵ�ĩβ��׷������
			out2=new FileWriter("D:\\teach\\a.txt",true);//true��ʾҪ׷������
			//��ʼд������
			out2.write(100);
			out2.write("hello");
			out2.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			//�ͷ���Դ������fianlly���У���֤��Դһ���ᱻ�ͷ�
			out2.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

 }
}
