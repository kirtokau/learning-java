package thisdemo;

public class Test2_This2 {
	public static void main(String[] args) {
		Student s=new Student();
		Student s2=new Student("jack");
	}
}
//����Student��
class Student{

	public Student() {
		//���޲ι�����ִ�к��ι���Ĺ���
//		this("rose");
		System.out.println("�޲ι���");
	}
	//������ʽ�Ĺ��췽��
	public Student(String n) {
		//1���ں��ι�����ִ���޲ι��칦��
		//2��this�ؼ��� �ڹ��췽���б����ǵ�һ�����
		this();
		System.out.println("���ι���"+n);
		
	}
	
	
}
