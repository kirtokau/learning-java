package cn.tedu.api;

public class Test3_StringBuffer {

	public static void main(String[] args) {
		// method();//���+ƴ���ַ���
		method2();//�Ż�+ƴ��
	}
	private static void method2() {
		//�����ַ���
		String str ="abcdefghijklmnopqrstuvwxyz";
		//��ָ�����ַ���ƴ��10000��
		StringBuffer sb=new StringBuffer();//�ù�����ƴ��
		
		//��ʱ��ʼ
		long s=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			sb.append(str);//�������ṩ�Ŀ���ƴ���ַ���
		}
		long s2=System.currentTimeMillis();//��ȡϵͳ�ĵ�ǰʱ��ms
		//��ʱ����
		//3����ӡƴ�Ӻ���ַ���
		System.out.println(s2 - s);//4ms
	}
	private static void method() {
		//�����ַ���
		String str="abcdefghijklmnopqrstuvwxyz";
		//��ָ�����ַ���ƴ��10000��
		String result=" ";//�����������¼���յ�ƴ�ӽ��
		//��ʱ��ʼ
		long s=System.currentTimeMillis();//��ȡϵͳ�ĵ�ǰʱ��ms
		for(int i=0;i<10000;i++) {
			result=result+str;//+��ƴ���ַ���
		}
		long s2=System.currentTimeMillis();//��ȡ��ǰϵͳ����Ӧʱ��ms
		//��ʱ����
		//3����ӡƴ�Ӻ���ַ���
		System.out.println(s2-s);//
	}
}
