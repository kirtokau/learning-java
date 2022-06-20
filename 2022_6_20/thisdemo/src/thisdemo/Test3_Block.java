package thisdemo;

public class Test3_Block {

	public static void main(String[] args) {
		// 创建Teacher对象
		//1、在创建对象时，如果有构造代码块，就先执行构造代码块再执行构造方法
		Teacher t=new Teacher();
		//2、每次new都会执行一次构造代码块
		Teacher t2=new Teacher();
		Teacher t3=new Teacher("jack");
		t.eat();
	}
}
//创建Teacher类
class Teacher{
	//创建成员变量：作用范围是整个类中有效
	String country;
	//构造代码块：位置是类里方法外
	{
		//常用于抽取构造方法的共性功能
		country="中国人";
		System.out.println("构造代码块");
	}
	//构造方法
	public Teacher() {
		System.out.println("无参构造方法"+country);
	}
	public Teacher(String n) {
		System.out.println("含参构造方法"+n+country);
	}
	public void eat() {
		//局部代码块：位置是在方法里+主要用来控制变量的作用范围（范围越小越安全）
		{
			int i=10;
			System.out.println("局部代码块"+i);
		}
//		System.out.println(i);//超出了i的作用范围
	}
	
	
}
