package thisdemo;

public class Test8_Design {

	public static void main(String[] args) {
		// �����������
		BMW b=new BMW();
		b.run();
		b.stop();
		System.out.println(b.color);
		System.out.println(b.model);
		//�������෢������д�����Է�������ôִ��Ҫ��������ôʵ��
		Audi a=new Audi();
		a.run();
		a.stop();
		System.out.println(a.color);
		System.out.println(a.model);
	}	
}
//�ѹ�������������ȡ�����������У��µ��ุ��
class Car{
	//��ɫ���ͺţ�������Ϊ��ֹͣ��Ϊ
	String color;
	int model;
	public void run() {
		System.out.println("run()");
	}
	public void stop() {
		System.out.println("stop()");
	}
}
//��������-java��
//������Լ̳и���Ĺ���
class BMW extends Car{
	//�����Ҫ��Ҫ�޸ĸ���ԭ�еĹ��ܣ�--������д
	public void run() {
		//���Ը���ԭ�й�����ı��޸����� --����Ĺ��ܲ�û�з����ı䣬�ĵ��������Լ��Ĺ���
		//superӦ���������У���ʾ��������һ������
		super.run();
		System.out.println("BMW..run()");
	}
}
//�µ�����
class Audi extends Car{
	public void stop() {
		System.out.println("Audi..stop()");
	}
}
