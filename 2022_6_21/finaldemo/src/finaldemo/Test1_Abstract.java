package finaldemo;
//������������Գ���������Ű���
public class Test1_Abstract {

	public static void main(String[] args) {
		//������̬�������
		Animal5 a=new Dog5();//�������� ָ���������
		a.eat();//��д��ִ��������Ĺ��ܣ����п��ұ�
	}
}
//��������
//���һ�����а������󷽷���������������Ϊ��һ��������
abstract class Animal5{
	//�������̳и������Ҫ�Ѹ���Ĺ��ܽ�����д����������Ĺ��ܱ����ǡ�--���಻�ṩ��������
	abstract public void eat();//û�з�����ķ����г��󷽷�����abstract����
	//�������п�������ͨ����
	public void eat2() {
		
	}
	public void sleep() {
		
	}
}
//��������
//����̳��˳���ĸ����������Ҫ�Ѹ�������г��󷽷�����д
class Dog5 extends Animal5{
	//��д�Ĺ��̣���abstractȥ�������ṩ������
	public void eat() {
		System.out.println("������");
	}
	//����̳��˳�������������û�аѸ�������г��󷽷�����д����������Ȼ��һ�����������
abstract class Cat extends Animal5{
		
	}
}