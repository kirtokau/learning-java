package Basic;

import java.util.Random;
import java.util.Scanner;

public class Test3_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1、让程序产生随机数
		//nextInt(n)产生n以内的随机数，从0开始
		int random=new Random().nextInt(100)+1;
		System.out.println(random);
		//2、调用method方法完成
		method2(random);
	}
	//创建method()
	public static void method(int r) {
		while(true) {//死循环 while(true)--设置程序的出口
	//1、接收用户输入的值
			int input=new Scanner(System.in).nextInt();
	//2、判断和随机数的关系
			if(input>r) {
				System.out.println("大了");
			}else if(input<r){
				System.out.println("小了");
			}else if(input==r){
		        System.out.println("中了");
			}
		}
	}
	public static void method2(int r){
		//1、接收用户输入的值
	do {
		int input=new Scanner(System.in).nextInt();
		//2、判断和随机数的关系
		if(input>r) {
			System.out.println("大了");
		}
		if(input<r) {
			System.out.println("小了");
		}
		if(input==r) {
			System.out.println("中了");
		}
	}while(true);
	
	}
}
