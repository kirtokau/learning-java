package thisdemo;
//�������ִ��˳�򣺾�̬����飬�������飬�ֲ������
//��̬����������ڶ�����أ���������ļ��ؾͻ��һʱ����ؽ����ڴ棬��һֱ���ڣ�ר���������һЩ��Ҫ��һʱ����ز���ֻ��Ҫ����һ��
//�����������ڴ�������ʱ�Żᴥ����ר��������ȡ���췽���Ĺ���
//�ֲ�������Ƿ�������ʱ�Żᴥ����ר���������Ʊ��������÷�Χ
public class Test9_Block {

	public static void main(String[] args) {
		// �ڴ�������ǰ����ȥ�Զ�ִ�о�̬�����
		//�ڴ�������ʱ�����Զ����ù�������͹��췽��
		Person p=new Person();
		//������show()ʱ���Żᴥ���ֲ������
		p.show();
		Person p2=new Person();
		//������show()ʱ���Żᴥ���ֲ������
		p2.show();
	}
}
//����Person��
class Person{
	//��̬����飬λ�ã������﷽����+�ص㣺������ļ��ض����أ�����ֻ�����һ��
	static {
		System.out.println("��̬�����...");
	}
	//������룬λ�������﷽����+�����ڵ㣺��������ʱ
	{
		System.out.println("��������...");
	}
	public Person(){
		System.out.println("���췽��");
	}
	//�ֲ����룬λ���ڷ�����
	public void show() {
		{
			System.out.println("�ֲ������...");
		}
	}
}