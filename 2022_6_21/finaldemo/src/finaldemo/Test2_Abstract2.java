package finaldemo;
//这个类用来测试抽象类的用法
public class Test2_Abstract2 {

	public static void main(String[] args) {
		//创建多态对象测试
		Animal3 a=new Dog3();
		//抽象类能不能创建对象 --不能!!
		//Animal2 a2=new Animal2();
		}
}
//创建父类
abstract class Animal3{
	//抽象类中的构造方法？ --可以存在，目的不是为了创建抽象类对象本身，而是为了创建子类对象使用的
	public Animal3() {
    	System.out.println("Animal2...构造方法");
    }
}
//创建子类
class Dog3 extends Animal3{
	//无参构造默认存在
	public Dog3() {
		super();//隐藏着super();//先访问父类的构造方法，再执行自己的功能
	    System.out.println("Dog2..构造方法");
	}
}
