package thisdemo;

public class Test3_Block {

	public static void main(String[] args) {
		// ����Teacher����
		//1���ڴ�������ʱ������й������飬����ִ�й���������ִ�й��췽��
		Teacher t=new Teacher();
		//2��ÿ��new����ִ��һ�ι�������
		Teacher t2=new Teacher();
		Teacher t3=new Teacher("jack");
		t.eat();
	}
}
//����Teacher��
class Teacher{
	//������Ա���������÷�Χ������������Ч
	String country;
	//�������飺λ�������﷽����
	{
		//�����ڳ�ȡ���췽���Ĺ��Թ���
		country="�й���";
		System.out.println("��������");
	}
	//���췽��
	public Teacher() {
		System.out.println("�޲ι��췽��"+country);
	}
	public Teacher(String n) {
		System.out.println("���ι��췽��"+n+country);
	}
	public void eat() {
		//�ֲ�����飺λ�����ڷ�����+��Ҫ�������Ʊ��������÷�Χ����ΧԽСԽ��ȫ��
		{
			int i=10;
			System.out.println("�ֲ������"+i);
		}
//		System.out.println(i);//������i�����÷�Χ
	}
	
	
}
