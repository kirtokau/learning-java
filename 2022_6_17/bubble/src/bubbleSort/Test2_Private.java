package bubbleSort;
//������������Է�װ
public class Test2_Private {

	public static void main(String[] args) {
		// ͨ��new�ؼ��ִ���ѧ�����󣬲���
		Student s=new Student();
		
		//��������ֵ
//		s.name="�ܴ�";2����private���Σ��޷�����
		s.setName("�ܴ�");//���ù�����set()����ֵ
		s.sno=1;
		s.subject="java";
		
		//���ù���
//		System.out.println(s.name);��private���Σ��޷�����
		System.out.println(s.getName());
		System.out.println(s.sno);
		System.out.println(s.subject);
		
		//s.study();1����Դ��private���Σ��޷�����
		s.eat();
		//
	}
}
 class Student{
	//����--��Ա����
	//1����װ�������Դ��private���Σ�����Ȩ��ֻ���ڱ����пɼ������ṩ�����ķ��ʷ���
	 private String name;
	 //�ṩ���������÷�ʽ --setxxx()
	 public void setName(String n) {
		 name=n;
	 }
	 //�ṩ�����Ĳ鿴��ʽ --getxxx()
	 public String getName() {
		 return name;
	 }
	 int sno;
	 String subject;
	 //��Ϊ --��Ա����
	 //1����װ�������Դ��private���Σ�����Ȩ��ֻ���ڱ����пɼ�
	 private void study() {
		 System.out.println("����ѧϰ");
	 }
	 public void eat() {
		 System.out.println("���ڳԷ�");
	 }
}
