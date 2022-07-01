package cn.tedu.thread;
//这个类用来測試多线程编程的同步锁
public class Test5_Synchrionized {

	public static void main(String[] args) {
		TicketSync target=new TicketSync();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		Thread t4=new Thread(target);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//改造多线程售票案例
class TicketSync implements Runnable{
	int tickets=100;
	Object O=new Object();
	//如果方法里的代码被同步了，直接把方法用同步修饰，称之为同步方法，用的锁对象This
	@Override
	//synchronized public void run()
	public void run() {
		while(true) {
			//同步代码块：是指，同一时间资源会被独占没人抢
			//多线程中数据安全隐患的前提：多线程程序+有共享数据（成员变量）+多条语句操作共享数据
			//同步锁的位置：太大也不行，程序的效率太低，太小也不行，就相等于给自己加了一把锁，从问题发生的位置开始，截止到结束位置
			//锁对象：多线程间使用的必须是同一把锁对象，同步代码锁的锁对象可以是任意对象
			//synchronized(new Object()){
			//不对，相当于每个线程用了自己的锁，多个线程间并不是用的同一个锁
			//synchronized(o)//让线程间使用了同一个O对象
			synchronized(this) {
				//让线程间使用了同一个O对象
				if(tickets>0) {
					try {
						Thread.sleep(10);//延迟访问
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"="+tickets--);
				}
				if(tickets<=0) break;
			}
		}
		
	}
}
