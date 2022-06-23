package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_BigDecimal {

	public static void main(String[] args) {
//		method();//使用+-*完成运算，暴露浮点数运算不精确问题
		method2();//使用工具类BigDecimal解决浮点数运算不精确现象
	}
	private static void method2() {
		//接收用户输入的两个小数
		double a=new Scanner(System.in).nextDouble();
		double b=new Scanner(System.in).nextDouble();
		//创建工具类对象
		BigDecimal bd1=new BigDecimal(a+"");//最后不要使用double作为参数的构造方法，最好使用Sring参数的构造方法
		BigDecimal bd2=new BigDecimal(b+"");
		//做运算
		BigDecimal bd3;
		bd3=bd1.add(bd2);//加法运算
		System.out.println(bd3);
		
		bd3=bd1.subtract(bd2);//减法运算
		System.out.println(bd3);
		
		bd3=bd1.multiply(bd2);//乘法运算
		System.out.println(bd3);
		//java.lang.ArithmeticException因为除法运算，当发生了除不尽的现象就无法产生精确的结果
		//bd3=bd1.divide(bd2);//除法运算，当除不尽时会抛出异常
		//divide(m,n,o)--m是要除以那个对象保存的值，n是要保留几位小数，o是舍入方式是四舍五入
		bd3=bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);//除法运算
		System.out.println(bd3);
	}
		private static void method() {
			//接收用户输入当的两个小数
			double a=new Scanner(System.in).nextDouble();
			double b=new Scanner(System.in).nextDouble();
			//做运算
			System.out.println(a+b);//不精确
		    System.out.println(a-b);//不精确
		    System.out.println(a*b);//不精确
		    System.out.println(a/b);//不精确
		}
		
		
	}


