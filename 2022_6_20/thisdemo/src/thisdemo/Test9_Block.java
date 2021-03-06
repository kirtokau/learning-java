package thisdemo;
//代码块间的执行顺序：静态代码块，构造代码块，局部代码块
//静态代码块优先于对象加载，是随着类的加载就会第一时间加载进入内存，并一直存在，专门用来完成一些需要第一时间加载并且只需要加载一次
//构造代码块是在创建对象时才会触发，专门用来提取构造方法的共性
//局部代码块是方法调用时才会触发，专门用来控制变量的作用范围
public class Test9_Block {

	public static void main(String[] args) {
		// 在创建对象前，会去自动执行静态代码块
		//在创建对象时，会自动调用构造代码块和构造方法
		Person p=new Person();
		//当调用show()时，才会触发局部代码块
		p.show();
		Person p2=new Person();
		//当调用show()时，才会触发局部代码块
		p2.show();
	}
}
//创建Person类
class Person{
	//静态代码块，位置：在类里方法外+特点：随着类的加载而加载，而且只会加载一次
	static {
		System.out.println("静态代码块...");
	}
	//构造代码，位置在类里方法外+触发节点：创建对象时
	{
		System.out.println("构造代码块...");
	}
	public Person(){
		System.out.println("构造方法");
	}
	//局部代码，位置在方法里
	public void show() {
		{
			System.out.println("局部代码块...");
		}
	}
}
