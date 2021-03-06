package cn.tedu.thread;

public class Test6_TicketThread extends Thread{
	//总票数，多个线程共享这个变量，能修改ticket--
	private int ticket=10;
	//执行业务，重写父类run方法
	@Override
	public void run() {
		// 业务处理，卖票：票-
		while(true) {
			//线程非常多，我想尽量给资源
			synchronized(this) {
				//对象锁
				//判断一个条件，出去条件
				if(ticket<=0) {
					//多线程可能ticket=-1
					break;//退出死循环
				}
			   //不出现，线程run方法执行太快，不会发生线程冲突
				try {//不能抛出异常，抛出就不是重写run方法
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("窗口："+Thread.currentThread().getName()+",剩余票数："+ticket--);
				}
		}
	}

	public static void main(String[] args) {
		//目标
		Thread target=new TicketThread();
		for(int i=0;i<3;i++) {
			new Thread(target).start();//3个线程共同作用一个target
		}
	}
}
