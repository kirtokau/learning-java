package cn.tedu.inter;

public class Test5_UseInter {

	public static void main(String[] args) {
		// 子类创建对象时，会自动调用父类的构造方法 父类是个接口，没有构造方法，这次子类构造方法中的super到底发生了什么
		//子类其实是默认继承了Object,super()会自动调用Object的无参构造
		Inter2 in=new Inter2Impl();
		System.out.println(in.age);
		//接口中的变量都是静态变量，可以通过接口名调用
		System.out.println(Inter2.age);
		//接口里的变量都是常量，不能被重新赋值！！
		//Inter2.age=20;		
	}
}
//创建接口
//用interface关键字定义接口
interface Inter2{
	//接口里有构造方法吗？？ --没有
	//public Inter2(){}
	//接口里可以有成员变量吗？ --看起来可以有，实际上没有，因为接口会为变量自动拼接Public stat
    int age=10;
//final static int age=10
    //接口里可以有抽象方法 --可以简写  --会自动拼接public abstract
    void eat();
    void add();
    //abstract public void eat();
}
//创建实现类
//实现类和接口之间是 实现关系implements
class Inter2Impl extends Object implements Inter2{
	public Inter2Impl() {
		super();//会自动访问Object的无参构造
		System.out.println("Inter2Impl...");
	}
	@Override
	public void eat() {
	}
	@Override
	public void add() {

	}
}


