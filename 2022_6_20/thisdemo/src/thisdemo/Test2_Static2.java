package thisdemo;
//����������⾲̬�ĵ��ù�ϵ
//��ֻ̬�ܵ��þ�̬���Ǿ�̬���Ե��÷Ǿ�̬Ҳ���Ե��þ�̬
public class Test2_Static2 {

	public static void main(String[] args) {
	}
}
//����Teacher��
class Teachers{
	//��ͨ����Դ
	String name;
	public void teach() {
		//��ͨ��Դ�ܷ���þ�̬��Դ  --�ܣ�����
		eat();
		System.out.println(age);
		System.out.println("teach()...");
	}
	//��̬��Դ
	static int age;
	static public void eat() {
		//��̬��Դ�ܷ������ͨ��Դ  --���ܣ�������
		//teach();
//		System.out.println(name);
		System.out.println("eat()...");
	}
}
