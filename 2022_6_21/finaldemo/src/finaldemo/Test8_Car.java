package finaldemo;
//设计汽车的程序
public class Test8_Car {

	public static void main(String[] args) {
		// 创建子类对象，进行子类的功能测试
		BMW bm=new BMW();
		bm.start();
		bm.end();
		bm.run();
		/*
		 * 创建多态对象，进行功能测试
		 * 子类只要重写了父类方法，父类实现就会被覆盖
		 * 多态的两大前提：继承+重写
		 *多态的过程是从小变大，是向上转型的过程
		 *多态中，只能调用父类功能（如果发生重写就是用子类的），初衷是统一调用标准
		 */
		Car c=new BMW();
		c.start();
		c.end();
		c.run();
		}
}
//创建汽车类，提供启动、停止、运行功能
class Car{
	public void start() {
		System.out.println("Fu..start()");
	}
	public void end() {
		System.out.println("Fu..end()");
	}
	public void run() {
		System.out.println("Fu..run()");
	}
}
//创建子类，继承汽车类，覆盖/重写 启动和停止功能
class BMW extends Car{
	public void start() {
		System.out.println("Zi..start");
	}
	public void end() {
		System.out.println("Zi..end()");
	}
}
