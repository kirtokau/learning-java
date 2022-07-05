package cn.tedu.innerclass;

//������������� �����ڲ��࣬ͨ���������������ʹ��
public class Test5_Inner5 {

	public static void main(String[] args) {
		// new Inner1()�������󣬾��൱�ڴ�����һ���ӿڵ�ʵ���࣬��Ҫ��д�ӿ�������г��󷽷�
		new Inner1(){
			public void save() {
				System.out.println("save()");
			};
		    public void get() {
		    	System.out.println("get()");
		    };
			
		}.get();//����ָ���ķ�����ֻ��һ����
        //new Inner2()���������൱�ڴ����˳���������࣬������д���г��󷽷�
		new Inner2() {
			@Override
			public void eat() {
				System.out.println("eat()");
			}
		}.eat();
		//��ͨ�����������û��ǿתҪ����������ڲ�������д����
		//���ʹ�ö���ֻ��Ҫ��һ����--ֱ���������󣬼���ʡ��
		new Inner3().game();
		//���ʹ�ö���ֻ��Ҫ��һ����--ֱ���������󣬼���ʡ�¡�
		Inner3 in=new Inner3();
		in.game();
		in.code();		
	}
}
       class Inner3{
    	   public void game() {
    		   System.out.println("game()");
    	   }
    	   public void code() {
    		   System.out.println("code()");
    	   }
       }
       abstract class Inner2{
    	   abstract public void eat();
    	   public void play() {
    		   System.out.println("play()");
    	   }
       }
       interface Inner1{
    	   void save();
    	   void get();
       }
