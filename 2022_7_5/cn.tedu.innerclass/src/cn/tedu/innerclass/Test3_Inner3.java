package cn.tedu.innerclass;
//������������Գ�Ա�ڲ��౻static����
public class Test3_Inner3 {

	public static void main(String[] args) {
		//���ʹ���ڲ����show()?
		//Outer3.Inner3 oi=new Outer3().new Inner3();
		//new Outer3().new Inner3().show();//�������ڲ����������˾�̬�ڲ����show()
		Outer3.Inner3 oi=new Outer3.Inner3();
		oi.show();
		new Outer3.Inner3().show();//�������ڲ�����������show()
		Outer3.Inner3.show2();//���ʾ�̬�ڲ����еľ�̬��Դ
	}
}
      //������
     class  Outer3{
    	 //�ⲿ��
    	 //�ڲ��౻static����
    	 static class Inner3{
    		 public void show() {
    			 System.out.println("Inner3...show()");
    		 }
    	 
    	 static public void show2() {
    		 System.out.println("Inner3...show2()");
    	 }
    	}
     }
