package cn.tedu.thread2;
//������������Ե������ģʽ --����ʽ
public class Test6_Singleton {

	public static void main(String[] args) {
		Mysingle m=Mysingle.getSingle();
		Mysingle m2=Mysingle.getSingle();
		//����Ƚϵ��������������͵ı������Ƚϵ��ǵ�ֵַ
	}
}
//�����Լ��ĵ�������
class Mysingle{
	//˽�л����췽���������������new 
	private Mysingle() {}
	//������ڲ����ṩһ���Ѿ������õĶ���
	static private Mysingle single=new Mysingle();
	//�����ṩһ��ȫ�ַ��ʵ�
	//static ����Ϊ����Ҫ����get()���Դ���������ʣ�����Ŀǰ�Ѿ��������������ˣ�ֻ��ͨ���������ã��͵�����
	static public Mysingle getSingle() {
		//���ڲ������õĶ��󷵻ص���λ��
		return single;
	}
}
