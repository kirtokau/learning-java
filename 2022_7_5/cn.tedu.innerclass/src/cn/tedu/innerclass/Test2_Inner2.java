package cn.tedu.innerclass;
//这个类用来测试成员内部类被private修饰
public class Test2_Inner2 {

	public static void main(String[] args) {
		// 怎么使用内部类Inner2的资源--如果Inner2被private了就没法直接创建对象了
		//Outer2.Inner2 oi=new Outer2().new Inner2();
		//oi.eat();
		//创建内部类的对象，间接访问内部类的资源
		new Outer2().show();
	}
}
    //创建类
     class Outer2{
    	 //提供公共的show(),创建内部类对象，调整内部类的eat()
    	 public void show() {
    		 Inner2 in=new Inner2();
    		 in.eat();
    	 }
    	 //成员位置的内部类-成员内部类，被private修饰后，无法被外界使用
    	 private class Inner2{
    		 public void eat() {
    			 System.out.println("Inner2...eat()");
    		 }
    	 }
     }
