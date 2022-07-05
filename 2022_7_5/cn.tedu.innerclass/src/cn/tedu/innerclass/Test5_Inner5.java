package cn.tedu.innerclass;

//这个类用来测试 匿名内部类，通常结合着匿名对象使用
public class Test5_Inner5 {

	public static void main(String[] args) {
		// new Inner1()匿名对象，就相当于创建了一个接口的实现类，需要重写接口里的所有抽象方法
		new Inner1(){
			public void save() {
				System.out.println("save()");
			};
		    public void get() {
		    	System.out.println("get()");
		    };
			
		}.get();//触发指定的方法，只干一件事
        //new Inner2()匿名对象，相当于创建了抽象类的子类，必须重写所有抽象方法
		new Inner2() {
			@Override
			public void eat() {
				System.out.println("eat()");
			}
		}.eat();
		//普通类的匿名对象，没有强转要求产生匿名内部类来重写方法
		//如果使用对象，只需要干一件事--直接匿名对象，简单又省事
		new Inner3().game();
		//如果使用对象，只需要干一件事--直接匿名对象，简单又省事。
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
