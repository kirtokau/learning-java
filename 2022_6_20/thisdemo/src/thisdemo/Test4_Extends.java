package thisdemo;
//�̳е����Ű���
public class Test4_Extends {

	public static void main(String[] args) {
		// ����Cat�������
		Cat c=new Cat();
		c.eat();
		//����Huahua�����
		Huahua h=new Huahua();
		h.eat();
//		System.out.println(h.sum);
	}
}
//��������
class Animal{
	public void eat() {
		System.out.println("��ɶ����");
	}
}
//��������
//1������͸���֮���Ǽ̳й�ϵ����extends�ؼ���
//3��javaֻ֧�ֵ��̳У�����ֻ����һ������
class Cat extends Animal{
	private int sum=10;//�����˽����Դ�������޷��̳и���
	//����̳и�����൱�ڰѸ���Ĺ��ܽ����˸���
}
//�̳���is a�Ĺ�ϵ��Ҫ����������Ǹ����һ�ּ̳нṹ�������Էǳ�ǿ-�����ǿ
class Huahua extends Cat{
	//�̳��ǿ��Դ��ݵģ�үү�Ĺ��ܻᴫ�ݸ��ְ֣��ְֵĹ��ܻᴫ�ݸ�����
}