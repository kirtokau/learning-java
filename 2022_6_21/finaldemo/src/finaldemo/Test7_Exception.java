package finaldemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//这个类用来测试异常
public class Test7_Exception {

	public static void main(String[] args) {
		// method();//让异常捕获
		//method2();//异常的捕获
	     try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//抛出：在方法上加throws异常类型
	//抛出时，也可以用多态，不管会发生什么样的异常，统统被Exception跑出去
	private static void method3() {
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		//输出除法运算的结果
		System.out.println(a/b);
	}
	//捕获：try{会发生异常的代码}catch(异常类型 异常名）{解决方案}
	private static void method2() {
		//try里面放的是，可能会发生异常的代码
		try {
			//接收用户输入的两个整数
			int a=new Scanner(System.in).nextInt();
			int b=new Scanner(System.in).nextInt();
			//输出除法运算的结果
			System.out.println(a/b);
			//如果发生了被捕获的异常时，就会给出对应的解决方案
		} catch (ArithmeticException ae) {
			System.out.println("第二次输入不能是0");
		}
		//由于程序中，可能存在多种异常，所以catch可以多次配合
		catch(InputMismatchException ime) {
			System.out.println("請您輸入整數");
		
		//如果還有除了上述两种异常之外的异常，会被Exception捕获住，为什么呢？
		//多态：不关心子类的类型，只要是异常，都是Exception的子类，多态会把所有子类当做父类来看，提供通用代码		
		}catch(Exception e) {
	    	System.out.println("请输入正确的整数");
	    }	
	}
	private static void method() {
		//接收用户输入的两个整数
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		//输出除法运算的结果
		System.out.println(a/b);
	}
}
