package finaldemo;

public class Test5_DuoTai {
//������������Զ�̬�����Ű���
	public static void main(String[] args) {
		// ��������������
		Dog d=new Dog();
		d.eat();
		//������̬�������
		//�ھ����������� ָ���������
		Animal a=new Dog();
		//���루���棩����ߣ����У����ԣ����ұ�
		a.eat();//eat()��ʹ�õĸ��������������ʹ�õ������ʵ�ַ�ʽ
		//��̬�ĳ��֣���Ϊ��ͳһ���õı�׼�����࿴�룬�����ṩ�Ĺ��ܲ����ã��������й����ò���
		//a.show();
		Animal b=new Animal();
		b.eat();
	}
}
        //��������
        class Animal{
        	public void eat() {
        		System.out.println("��ɶ����");
        	}
        }
        //��������
        //��̬��ǰ�᣺��Ҫ�����̳й�ϵ
        class Dog extends Animal{
        	//��̬��ǰ�᣺��Ҫ����������д
        	public void eat() {
        		System.out.println("������");
        	}
        }
