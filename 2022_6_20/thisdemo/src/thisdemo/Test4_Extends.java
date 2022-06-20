package thisdemo;
//继承的入门案例
public class Test4_Extends {

	public static void main(String[] args) {
		// 创建Cat对象测试
		Cat c=new Cat();
		c.eat();
		//创建Huahua对象测
		Huahua h=new Huahua();
		h.eat();
//		System.out.println(h.sum);
	}
}
//创建父类
class Animal{
	public void eat() {
		System.out.println("吃啥都行");
	}
}
//创建子类
//1、子类和父类之间是继承关系，用extends关键字
//3、java只支持单继承，子类只能有一个父类
class Cat extends Animal{
	private int sum=10;//父类的私有资源，子类无法继承复制
	//子类继承父类后，相当于把父类的功能进行了复制
}
//继承是is a的关系，要求子类必须是父类的一种继承结构，依赖性非常强-耦合性强
class Huahua extends Cat{
	//继承是可以传递的，爷爷的功能会传递给爸爸，爸爸的功能会传递给儿子
}