package finaldemo;
//�������������final
public class Test4_Final {

	public static void main(String[] args) {
		Zi z=new Zi();
		//final�������γ�Ա������ֵ���ܱ��޸�--����
		//The final field Fu.name cannot be assigned
		//z.name="rose"
		System.out.println(z.name);
		z.eat();
	}
}
//��������
//final���������࣬�������ཫ�޷�����final�ĸ���
//The type Zi cannot subclass the final class Fu
//final class Fu{
class Fu{
	//final�������γ�Ա������ֵ���ܱ��޸�--����
	final String name="jack";
	//final�������γ�Ա�������������ཫ�޷���д
	final public void eat() {
		System.out.println("Fu...eat()");
	}
}
//��������
class Zi extends Fu{
	//��д��Ϊ���޸ĸ���ԭ�еĹ���
	//final�������γ�Ա�������������ཫ�޷���д
	//cannot override the final method from Fu
	//public void eat(){
	//System.out.println("Zi..eat()");
	//}
}
	

