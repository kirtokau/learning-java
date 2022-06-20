package thisdemo;

public class Test8_Design {

	public static void main(String[] args) {
		// 创建对象测试
		BMW b=new BMW();
		b.run();
		b.stop();
		System.out.println(b.color);
		System.out.println(b.model);
		//由于子类发生了重写，所以方法体怎么执行要看子类怎么实现
		Audi a=new Audi();
		a.run();
		a.stop();
		System.out.println(a.color);
		System.out.println(a.model);
	}	
}
//把共性内容向上提取，放入新类中，新的类父类
class Car{
	//颜色，型号，启动行为，停止行为
	String color;
	int model;
	public void run() {
		System.out.println("run()");
	}
	public void stop() {
		System.out.println("stop()");
	}
}
//宝马汽车-java类
//子类可以继承父类的功能
class BMW extends Car{
	//如果想要想要修改父类原有的功能，--方法重写
	public void run() {
		//测试父类原有功能真的被修改了吗？ --父类的功能并没有发生改变，改的是子类自己的功能
		//super应用在子类中，表示父类对象的一个引用
		super.run();
		System.out.println("BMW..run()");
	}
}
//奥迪汽车
class Audi extends Car{
	public void stop() {
		System.out.println("Audi..stop()");
	}
}
