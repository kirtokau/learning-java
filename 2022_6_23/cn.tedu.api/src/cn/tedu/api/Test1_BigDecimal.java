package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_BigDecimal {

	public static void main(String[] args) {
//		method();//ʹ��+-*������㣬��¶���������㲻��ȷ����
		method2();//ʹ�ù�����BigDecimal������������㲻��ȷ����
	}
	private static void method2() {
		//�����û����������С��
		double a=new Scanner(System.in).nextDouble();
		double b=new Scanner(System.in).nextDouble();
		//�������������
		BigDecimal bd1=new BigDecimal(a+"");//���Ҫʹ��double��Ϊ�����Ĺ��췽�������ʹ��Sring�����Ĺ��췽��
		BigDecimal bd2=new BigDecimal(b+"");
		//������
		BigDecimal bd3;
		bd3=bd1.add(bd2);//�ӷ�����
		System.out.println(bd3);
		
		bd3=bd1.subtract(bd2);//��������
		System.out.println(bd3);
		
		bd3=bd1.multiply(bd2);//�˷�����
		System.out.println(bd3);
		//java.lang.ArithmeticException��Ϊ�������㣬�������˳�������������޷�������ȷ�Ľ��
		//bd3=bd1.divide(bd2);//�������㣬��������ʱ���׳��쳣
		//divide(m,n,o)--m��Ҫ�����Ǹ����󱣴��ֵ��n��Ҫ������λС����o�����뷽ʽ����������
		bd3=bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);//��������
		System.out.println(bd3);
	}
		private static void method() {
			//�����û����뵱������С��
			double a=new Scanner(System.in).nextDouble();
			double b=new Scanner(System.in).nextDouble();
			//������
			System.out.println(a+b);//����ȷ
		    System.out.println(a-b);//����ȷ
		    System.out.println(a*b);//����ȷ
		    System.out.println(a/b);//����ȷ
		}
		
		
	}


