package cn.tedu.innerclass;
//这个类用来测试局部内部类
public class Test4_Inner4 {

	public static void main(String[] args) {
		//如何使用内部类的资源呢？--
		new Outer4().show();
	}
}
    class Outer4{
    	public void show() {
    	//内部类的位置如果在方法里--叫局部内部类
    	class Inner4{
    		String name;
    		int age;
    		public void eat() {
    			System.out.println("Inner4...eat()");
    		}
    	}
    	//使用局部内部类的资源？--创建内部类对象
    	Inner4 in=new Inner4();
    	in.eat();
    	System.out.println(in.name);
    	System.out.println(in.age);
    	}
    }
