package Basic;

import java.util.Arrays;
import java.util.Random;

public class Test5_Array2 {

	public static void main(String[] args) {
	         method();
	         method2();
	         method3();
	}
	public static void method(){
		//1����������
		int a[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		//2�����ÿ��������1����31��
		//����������Ԫ�ص��±����
		//int i=0 ָ���±�Ϊ0��Ԫ�ؿ�ʼ��������i��ʾ�����±�
		//i<=a.length-1ָ�±�����ֵ�����鳤��-1
		//i++ָ�±�����
		for(int i=0;i<=a.length-1;i++) {
			//a[i]ָ�����±��ȡa������Ԫ�ص�ֵ i+1 ��ָ�±�+1
			System.out.println((i+1)+"����"+a[i]+"��");
		}
	}
	public static void method2(){
		//1����������--��̬
		int a[]=new int[10];
		//2���������飬��Ԫ�ظ�ֵ
		//int i=0 ��ָ���±�Ϊ0��λ�ÿ�ʼ
		//i<a.length��ָ�±����ֵ������ĳ���-1
		//i++��ָ�±�����
		for(int i=0;i<a.length;i++){
			//a[i]��ָ�����±��ȡԪ�� i+1��ÿ��Ԫ�ظ�ֵ��iȡֵ��0-9��+1��ȡֵ����1-10
			a[i]=i+1;
	   }
		//��ӡ�����е�Ԫ��
		System.out.println(a);
		//Arrays������Ĺ����࣬toString(m)-m��Ҫ���ĸ������Ԫ����ʾ��һ���ַ���
		System.out.println(Arrays.toString(a));
	}
	//����method3
	public static void method3() {
		//1���������鶯̬
		int a[]=new int[10];
		//2���������飬��Ԫ�ظ�ֵ
		//i<a.length��ָ�±����ֵ������ĳ���-1
		//i++��ָ�±�����
		for(int i=0;i<a.length;i++){
			//a[i]��ָ���������±��ȡԪ�أ�����100���ڵ������
			a[i]=new Random().nextInt(100);
		}
		//3����ӡ�����е�Ԫ��
		System.out.println(a);
		//Arrays������Ĺ����࣬toString(m)-m��Ҫ���ĸ������Ԫ����ʾ��һ���ַ���
		System.out.println(Arrays.toString(a));
	}
}
