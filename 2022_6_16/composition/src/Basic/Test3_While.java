package Basic;

import java.util.Random;
import java.util.Scanner;

public class Test3_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1���ó�����������
		//nextInt(n)����n���ڵ����������0��ʼ
		int random=new Random().nextInt(100)+1;
		System.out.println(random);
		//2������method�������
		method2(random);
	}
	//����method()
	public static void method(int r) {
		while(true) {//��ѭ�� while(true)--���ó���ĳ���
	//1�������û������ֵ
			int input=new Scanner(System.in).nextInt();
	//2���жϺ�������Ĺ�ϵ
			if(input>r) {
				System.out.println("����");
			}else if(input<r){
				System.out.println("С��");
			}else if(input==r){
		        System.out.println("����");
			}
		}
	}
	public static void method2(int r){
		//1�������û������ֵ
	do {
		int input=new Scanner(System.in).nextInt();
		//2���жϺ�������Ĺ�ϵ
		if(input>r) {
			System.out.println("����");
		}
		if(input<r) {
			System.out.println("С��");
		}
		if(input==r) {
			System.out.println("����");
		}
	}while(true);
	
	}
}
