package finaldemo;
//这个类用来测多态的使用
public class Test6_DuoTai2 {

	public static void main(String[] args) {
		// 创建子类对象测试
		Dog2 d=new Dog2();
		System.out.println(d.sum);//20
		//创建多态对象测试
		//父类引用指向子类对象
		Animal2 a=new Dog2();
		//编译看左边，能用的功能必须是父类提供的
		//多态中，成员变量用的是父类的
		System.out.println(a.sum);//10
		//多态中，成员方法使用的是父类提供的方法声明，子类提供的方法体
		a.eat();//狗吃肉
		//多态中，静态资源使用的是父类的
		a.game();//Animal2...game()
		}
}
//创建父类
class Animal2{
	int sum=10;
	static public void game() {
		System.out.println("Animal...game");
	}
	public void eat() {
		System.out.println("吃啥都行");
	}
}
//创建子类
//多态前提：继承+重写
class Dog2 extends Animal2{
	int sum=20;
	//重写
	public void eat() {
		System.out.println("狗吃肉");
	}
	//静态资源根本不存在重写现象...
	static public void game() {
		System.out.println("Dog2...game");
	}
}
