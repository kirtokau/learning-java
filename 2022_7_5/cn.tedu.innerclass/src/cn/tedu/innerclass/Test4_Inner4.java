package cn.tedu.innerclass;
//������������Ծֲ��ڲ���
public class Test4_Inner4 {

	public static void main(String[] args) {
		//���ʹ���ڲ������Դ�أ�--
		new Outer4().show();
	}
}
    class Outer4{
    	public void show() {
    	//�ڲ����λ������ڷ�����--�оֲ��ڲ���
    	class Inner4{
    		String name;
    		int age;
    		public void eat() {
    			System.out.println("Inner4...eat()");
    		}
    	}
    	//ʹ�þֲ��ڲ������Դ��--�����ڲ������
    	Inner4 in=new Inner4();
    	in.eat();
    	System.out.println(in.name);
    	System.out.println(in.age);
    	}
    }
