package cn.tedu.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test6_In2 {

	public static void main(String[] args) {
//		method();//�ַ����Ķ�ȡ
		method2();//��Ч���ַ�����ȡ
	}
	private static void method2() {
		try {
			//BufferedReader�Ǹ�Ч���ַ���ȡ����ԭ���ǵײ�ά����һ��char[]��Ĭ�ϵ�����Ҳ��8*1024�ֽھ���8K
			//1����������
			Reader in2=new BufferedReader(new FileReader("D:\\teach\\1.txt"));
		    //2����ʼ��ȡ
			int b;//�����������¼��ȡ��������
			while((b=in2.read())!=-1) {
				//ֻҪ�����ݣ���һֱ��
				System.out.println(b);
			}
			//3���ͷ���Դ
			in2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void method() {
		try {
			//1����������
//			Reader in=new Reader();//Reader���ַ�����ȡ�ĸ��࣬������һ�������࣬����new 
//		    Reader in=new FileReader(new File("D:\\teach\\1.txt"));
		    Reader in2=new FileReader("D:\\teach\\1.txt");
		    
		    //2����ʼ��ȡ
//		    System.out.println(in2.read());һ���ַ�һ���ַ���ȡ
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());
//		    System.out.println(in2.read());-1,û������
//		    System.out.println(in2.read());-1,û������
		    int b;//�����������¼��ȡ��������
		    while((b=in2.read())!=-1) {
		    	//ֻҪ�����ݣ���һֱ��
		    	System.out.println(b);
		    }
		    //�ͷ���Դ
		    in2.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
