package cn.tedu.innerclass;
//������������Գ�Ա�ڲ��౻private����
public class Test2_Inner2 {

	public static void main(String[] args) {
		// ��ôʹ���ڲ���Inner2����Դ--���Inner2��private�˾�û��ֱ�Ӵ���������
		//Outer2.Inner2 oi=new Outer2().new Inner2();
		//oi.eat();
		//�����ڲ���Ķ��󣬼�ӷ����ڲ������Դ
		new Outer2().show();
	}
}
    //������
     class Outer2{
    	 //�ṩ������show(),�����ڲ�����󣬵����ڲ����eat()
    	 public void show() {
    		 Inner2 in=new Inner2();
    		 in.eat();
    	 }
    	 //��Աλ�õ��ڲ���-��Ա�ڲ��࣬��private���κ��޷������ʹ��
    	 private class Inner2{
    		 public void eat() {
    			 System.out.println("Inner2...eat()");
    		 }
    	 }
     }
