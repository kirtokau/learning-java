package finaldemo;
//������������Գ�������÷�
public class Test2_Abstract2 {

	public static void main(String[] args) {
		//������̬�������
		Animal3 a=new Dog3();
		//�������ܲ��ܴ������� --����!!
		//Animal2 a2=new Animal2();
		}
}
//��������
abstract class Animal3{
	//�������еĹ��췽���� --���Դ��ڣ�Ŀ�Ĳ���Ϊ�˴������������������Ϊ�˴����������ʹ�õ�
	public Animal3() {
    	System.out.println("Animal2...���췽��");
    }
}
//��������
class Dog3 extends Animal3{
	//�޲ι���Ĭ�ϴ���
	public Dog3() {
		super();//������super();//�ȷ��ʸ���Ĺ��췽������ִ���Լ��Ĺ���
	    System.out.println("Dog2..���췽��");
	}
}
