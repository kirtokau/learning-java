package finaldemo;
//������������Գ�����ĳ�Ա����
public class Test3_Animal3 {

	public static void main(String[] args) {
		//������̬�������
		Animal4 a=new Dog4();
		System.out.println(a.sum);//10
		System.out.println(a.name);//jack
		a.game();
	}
}
//��������
abstract class Animal4{
	//�������п����г�Ա����
	int sum=10;
	//��������Ҳ�����г�Ա����
	final String name="jack";
	//���һ�����ж�����ͨ��������࣬���Ǳ�����һ���������ԭ���ǣ�---�����������紴�����󣬿��԰���ͨ��������һ��������
	//�������п�������ͨ������?--����
	public void eat() {
		System.out.println("��ɶ����");
	}
	public void eat2() {
		System.out.println("��ɶ����");		
	}
	//���������г��󷽷���--����
	abstract public void game();
}
//��������
//������̳��˸��࣬������һ��������ʱ�����������д���г��󷽷��������������һ����������
//abstract class Dogs extends  Animal3{
class Dog4 extends Animal4{
	public void game() {
		System.out.println("�濴��");
	}
}
