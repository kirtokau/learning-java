package finaldemo;
//这个类用来测试抽象类的入门案例
public class Test1_Abstract {

	public static void main(String[] args) {
		//创建多态对象测试
		Animal5 a=new Dog5();//父类引用 指向子类对象
		a.eat();//重写后，执行了子类的功能，运行看右边
	}
}
//创建父类
//如果一个类中包含抽象方法，这个类必须声明为是一个抽象类
abstract class Animal5{
	//如果子类继承父类后，需要把父类的功能进行重写，发生父类的功能被覆盖。--父类不提供方法体了
	abstract public void eat();//没有方法体的方法叫抽象方法，用abstract修饰
	//抽象类中可以有普通方法
	public void eat2() {
		
	}
	public void sleep() {
		
	}
}
//创建子类
//子类继承了抽象的父类后，子类需要把父类的所有抽象方法都重写
class Dog5 extends Animal5{
	//重写的过程，把abstract去掉，并提供方法体
	public void eat() {
		System.out.println("狗吃肉");
	}
	//子类继承了抽象父类后，子类如果没有把父类的所有抽象方法都重写调，子类仍然是一个抽象的子类
abstract class Cat extends Animal5{
		
	}
}