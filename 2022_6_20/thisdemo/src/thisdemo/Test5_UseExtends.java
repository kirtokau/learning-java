package thisdemo;

public class Test5_UseExtends {

	public static void main(String[] args) {
		// ��������������
		Zi z=new Zi();
		z.eat();
	}
}
//��������
class Fu{
	int count=0;
	int sum=30;
}
//��������
class Zi extends Fu{
	int sum=20;
	public void eat(){
		int sum =10;
		System.out.println(sum);//10,�ͽ�ԭ��
		System.out.println(this.sum);//this.�����˳�Ա����sum
		System.out.println(count);//ʹ���˸������Դ	
		//��������ʹ�ø����sum�ϰ��ƣ�super���Ե��ø���Ĺ���
		//super�Ǹ�������һ������Fu super=new Fu();
		System.out.println(super.sum);//30,super.���Ե��ø���Ĺ���
	}
}
