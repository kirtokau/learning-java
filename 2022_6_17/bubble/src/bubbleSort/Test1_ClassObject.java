package bubbleSort;
//���������������Ͷ���Ĵ�����ʹ��
//һ��java�ļ��У����Դ��ڶ����
//����ֻ����һ���౻public���Σ�������������java���ļ���
public class Test1_ClassObject {

	public static void main(String[] args) {
		// ͨ��new�ؼ��ִ����ֻ����󣬲���
		Phone p=new Phone();
		//ͨ����ɵ��ö���Ĺ���
		p.call();//���ڴ�绰
		p.message();//���ڷ����ţ�
		p.music();//����������
		
		System.out.println(p.color);//null
		System.out.println(p.size);//null
		System.out.println(p.model);//null
		System.out.println(p.price);//0.0
		System.out.println();//����
		
		//�����ڶ�������
		Phone p2=new Phone();
		//����ģ����Ĺ���
		p2.call();
		p2.message();
		p2.music();
		
		//���������������ֵ
		p2.color="red";
		p2.size="5.9";
		p2.model="HUAWEI";
		p2.price=8888;
		
		System.out.println(p2.color);
		System.out.println(p2.size);
		System.out.println(p2.model);
		System.out.println(p2.price);
		}
}
//ͨ��class�����ֻ���--���������ֻ���һ������--����+��Ϊ
//����һ������ĳ���ֻ����Ĺ涨һ��������ص����Ϊ
class Phone{
	//����--��ĳ�Ա����/�����ܹ�--λ���������﷽����
	String color;
	String size;
	String model;
	int price;
	
	//��Ϊ--��ĳ�Ա����
	//���η� ����ֵ �������������б�{������}
	public void call() {
		System.out.println("���ڴ�绰");
	}
	public void message() {
		System.out.println("���ڷ�����");
	}
	public void music() {
		System.out.println("����������");
	}
}
