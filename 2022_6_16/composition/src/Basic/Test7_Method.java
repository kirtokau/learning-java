package Basic;

public class Test7_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method();//����ָ����method()
        method2(10);//�����Ĳ���
        method3("jack",20);
	}
	//����method3()
	public static void method3(String n,int a) {
		System.out.println(n);
		System.out.println(a);
        
	}
	//����method2
	public static void method2(int num) {
		System.out.println(num*num);
	}
	//����method
	//���������η� �����ķ���ֵ ������ ��[�����б�...]){�����壻}
	public static void method() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
	}

}
