package Basic;

public class Test1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���أ������д��ڶ��ͬ������+ÿ�������Ĳ����б�ͬ��������ͬ/���Ͳ�ͬ��
		method(10,5);//������ָ������
		method(10);
		method("jack",10);
	}
	//����method��"jack",10);
	public static void method(String name,int age) {
		//+����1�������ַ�����ƴ�� ����2�����ּ�����
		System.out.println(name+age);
	}
	//����method(10)
	public static void method(int m) {
		System.out.println(m*m);
	}
	//����method(10,5)
	public static void method(int a,int b) {
		System.out.println(a+b);
	}

}
