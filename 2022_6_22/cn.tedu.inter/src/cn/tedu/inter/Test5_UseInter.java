package cn.tedu.inter;

public class Test5_UseInter {

	public static void main(String[] args) {
		// ���ഴ������ʱ�����Զ����ø���Ĺ��췽�� �����Ǹ��ӿڣ�û�й��췽����������๹�췽���е�super���׷�����ʲô
		//������ʵ��Ĭ�ϼ̳���Object,super()���Զ�����Object���޲ι���
		Inter2 in=new Inter2Impl();
		System.out.println(in.age);
		//�ӿ��еı������Ǿ�̬����������ͨ���ӿ�������
		System.out.println(Inter2.age);
		//�ӿ���ı������ǳ��������ܱ����¸�ֵ����
		//Inter2.age=20;		
	}
}
//�����ӿ�
//��interface�ؼ��ֶ���ӿ�
interface Inter2{
	//�ӿ����й��췽���𣿣� --û��
	//public Inter2(){}
	//�ӿ�������г�Ա������ --�����������У�ʵ����û�У���Ϊ�ӿڻ�Ϊ�����Զ�ƴ��Public stat
    int age=10;
//final static int age=10
    //�ӿ�������г��󷽷� --���Լ�д  --���Զ�ƴ��public abstract
    void eat();
    void add();
    //abstract public void eat();
}
//����ʵ����
//ʵ����ͽӿ�֮���� ʵ�ֹ�ϵimplements
class Inter2Impl extends Object implements Inter2{
	public Inter2Impl() {
		super();//���Զ�����Object���޲ι���
		System.out.println("Inter2Impl...");
	}
	@Override
	public void eat() {
	}
	@Override
	public void add() {

	}
}


