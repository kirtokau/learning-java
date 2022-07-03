package cn.tedu.thread2;
//这个类用来测试单例设计模式--懒汉式
//延迟加载思想：是指不会第一时间就把对象创建好来占用内存，而是什么时候用什么创建
//线程安全问题：是指共享资源有线程并发的数据隐患，加同步锁，锁方法，也可以锁代码块
public class Test7_Single2 {

	public static void main(String[] args) {
		MySingleton my=MySingleton.getMy();
		MySingleton my2=MySingleton.getMy();
		System.out.println(my==my2);
	}
}
//创建类
class MySingleton{
	//私有化构造方法--控制外界new 的权利
	private MySingleton() {}
	//在类的内部创建好对象--延迟加载
	static private MySingleton my;
	//static Object obj=new Object();
	//提供全局访问点
	//问题：程序中有共享资源my.并且有多条语句操作了共享资源，此时，my共享资源一定会存在多线程编程的数据安全隐患
	//解决方案就是加同步锁
	//如果同步代码块需要锁的确定位置，锁的对象由于方法中的所有代码都被同步了，可以直接变成同步方法
	synchronized static public MySingleton getMy() {
		//synchronized(obj)//同步代码块，不能使用this关键字，因为加载的先后顺序问题
		if(my==null) {//说明没new过，保存的默认值是null
			my=new  MySingleton();//需要时才会创建对象，不需要也不会提前就开始占用内存
		}
		return my;
	}
	
	}

