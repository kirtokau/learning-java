package bubbleSort;
//������������Թ��췽��
public class Test3_Constructor {

	public static void main(String[] args) {
		// ����Person���󣬲���
		//1��ÿ��newʱ/ʵ����ʱ�����Զ����ù��췽��
		Person p=new Person();
		Person p2=new Person();
		//2�����������ֻ������Զ����ù��췽�������һ�֪��ƥ��ʹ���Ǹ����صĹ��췽��
		Person p3=new Person("jack");
		Person p4=new Person("Rose",20,"����");
		}
}
    //����Person�࣬������������
class Person{
	//����
	String name;
	int age;
	String address;
	//Ĭ�ϴ����޲ι��췽�� --���η� ��(){}
	//3����ֻ�ṩ���ι���ʱ���޲ι���ᱻ���ǣ�û����
	//��new Person()ʱ���Զ������޲ι���
	public Person() {
		System.out.println("���췽��");
	}
	//���صĹ��췽��
	//��new person(" ")ʱ���Զ��������ι���
	public Person(String n) {
		//���ù��췽������Ա����name��ֵ
		//���̣��ڴ�������ʱ���Ѳ������ݸ�n,��n�õ�ֵ֮���name���Ը�ֵ
		name=n;
		System.out.println("���췽��"+name);
	}
	//ȫ�ι���
	public Person(String n, int a, String addr) {
		name=n;//n�Ǿֲ�������name�ǳ�Ա����
		age=a;//a�Ǿֲ�������age�ǳ�Ա����
		address=addr;//addr�Ǿֲ�������address�ǳ�Ա����
		System.out.println(name+age+address);
	}
	//��Ϊ
	public void eat() {
		System.out.println("���ڳԷ�");
	}
	
}
