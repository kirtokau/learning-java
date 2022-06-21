package finaldemo;
//这个类用来测试抽象类的成员变量
public class Test3_Animal3 {

	public static void main(String[] args) {
		//创建多态对象测试
		Animal4 a=new Dog4();
		System.out.println(a.sum);//10
		System.out.println(a.name);//jack
		a.game();
	}
}
//创建父类
abstract class Animal4{
	//抽象类中可以有成员变量
	int sum=10;
	//抽象类中也可以有成员变量
	final String name="jack";
	//如果一个类中都是普通方法这个类，还是被声明一个抽象类的原因是？---如果不想让外界创建对象，可以把普通类声明成一个抽象类
	//抽象类中可以有普通方法吗?--可以
	public void eat() {
		System.out.println("吃啥都行");
	}
	public void eat2() {
		System.out.println("吃啥都行");		
	}
	//抽象类中有抽象方法吗？--可以
	abstract public void game();
}
//创建子类
//当子类继承了父类，父类是一个抽象类时，子类必须重写所有抽象方法，否则子类就是一个抽象子类
//abstract class Dogs extends  Animal3{
class Dog4 extends Animal4{
	public void game() {
		System.out.println("玩看家");
	}
}
