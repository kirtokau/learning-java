package finaldemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//��������������쳣
public class Test7_Exception {

	public static void main(String[] args) {
		// method();//���쳣����
		//method2();//�쳣�Ĳ���
	     try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�׳����ڷ����ϼ�throws�쳣����
	//�׳�ʱ��Ҳ�����ö�̬�����ܻᷢ��ʲô�����쳣��ͳͳ��Exception�ܳ�ȥ
	private static void method3() {
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		//�����������Ľ��
		System.out.println(a/b);
	}
	//����try{�ᷢ���쳣�Ĵ���}catch(�쳣���� �쳣����{�������}
	private static void method2() {
		//try����ŵ��ǣ����ܻᷢ���쳣�Ĵ���
		try {
			//�����û��������������
			int a=new Scanner(System.in).nextInt();
			int b=new Scanner(System.in).nextInt();
			//�����������Ľ��
			System.out.println(a/b);
			//��������˱�������쳣ʱ���ͻ������Ӧ�Ľ������
		} catch (ArithmeticException ae) {
			System.out.println("�ڶ������벻����0");
		}
		//���ڳ����У����ܴ��ڶ����쳣������catch���Զ�����
		catch(InputMismatchException ime) {
			System.out.println("Ո��ݔ������");
		
		//���߀�г������������쳣֮����쳣���ᱻException����ס��Ϊʲô�أ�
		//��̬����������������ͣ�ֻҪ���쳣������Exception�����࣬��̬����������൱�������������ṩͨ�ô���		
		}catch(Exception e) {
	    	System.out.println("��������ȷ������");
	    }	
	}
	private static void method() {
		//�����û��������������
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		//�����������Ľ��
		System.out.println(a/b);
	}
}
