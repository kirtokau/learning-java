package finaldemo;
//������������̬��ʹ��
public class Test6_DuoTai2 {

	public static void main(String[] args) {
		// ��������������
		Dog2 d=new Dog2();
		System.out.println(d.sum);//20
		//������̬�������
		//��������ָ���������
		Animal2 a=new Dog2();
		//���뿴��ߣ����õĹ��ܱ����Ǹ����ṩ��
		//��̬�У���Ա�����õ��Ǹ����
		System.out.println(a.sum);//10
		//��̬�У���Ա����ʹ�õ��Ǹ����ṩ�ķ��������������ṩ�ķ�����
		a.eat();//������
		//��̬�У���̬��Դʹ�õ��Ǹ����
		a.game();//Animal2...game()
		}
}
//��������
class Animal2{
	int sum=10;
	static public void game() {
		System.out.println("Animal...game");
	}
	public void eat() {
		System.out.println("��ɶ����");
	}
}
//��������
//��̬ǰ�᣺�̳�+��д
class Dog2 extends Animal2{
	int sum=20;
	//��д
	public void eat() {
		System.out.println("������");
	}
	//��̬��Դ������������д����...
	static public void game() {
		System.out.println("Dog2...game");
	}
}
