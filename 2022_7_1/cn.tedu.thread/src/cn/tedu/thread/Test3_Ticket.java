package cn.tedu.thread;
//这个类用来测试多线程售票
//设计4个售票窗口，总计售票100张
public class Test3_Ticket {

	public static void main(String[] args) {
		// 创建线程对象
		TicketThread t=new TicketThread();
		TicketThread t2=new TicketThread();
		TicketThread t3=new TicketThread();
		TicketThread t4=new TicketThread();
		//我们想让程序只卖100张票，但是目前卖了400张，为什么？
		t.start();
		t2.start();
		t3.start();
		t4.start();
 	}
}
//多线程编程：extends Thread
class TicketThread extends Thread{
	//int tickets=100;//定义变量，记录票的数据，成员变量-实例变量
	static int tickets=100;//可以被多个对象共享，只会加载一次
	//把业务写在run()里
	@Override
	public void run() {
		// 一直卖票
		while(true) {
			//!!!如果数据能够接收sleep的考研，才能说明数据没有了安全隐患
			try {
				//产生了重卖：同一张票卖给了多个人
				//产生了超卖：超出了票数，甚至卖出了0和-1和-2
				Thread.sleep(10);//让程序休眠10ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+"="+tickets--);
			if(tickets<=0) break;//死循环的出口
		}
	}
}
