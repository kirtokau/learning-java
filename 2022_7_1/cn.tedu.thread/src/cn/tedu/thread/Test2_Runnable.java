package cn.tedu.thread;
//这个类用来测试多线程，编程方式2:implements Runnable
public class Test2_Runnable {

	public static void main(String[] args) {
		// 创建线程对象
		MyRunnable target=new MyRunnable();
		//问题：怎么把接口的实现类和Thread类绑定
		Thread thread=new Thread(target,"熊大");
		//启动线程
		thread.start();
		//模拟多线程编程，需要创建多个线程对象并启动
		Thread thread2=new Thread(target,"熊二");
		thread2.start();
		//自己测试start()和run()的区别，run()只是一个普通方法执行的效果也就是单线程顺序
		//自己修改线程名称--使用Thread类的含参构造
	}
}
//自定义多线程类，方式2：implements Runnable
class MyRunnable implements Runnable{
	//把业务放入run(),重写了Runnable接口里的
	@Override
	public void run() {
		// 写业务，打印10次线程名称
		for(int i=0;i<10;i++) {
			//问题：Runnable接口中，没有提供多余的方法唯独只有一个run()
//			Thread.currentThread()获取当前正在执行业务的线程对象.getName()名称
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
		
	}
}
