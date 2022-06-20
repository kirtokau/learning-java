package thisdemo;

public class Test5_UseExtends {

	public static void main(String[] args) {
		// 创建子类对象测试
		Zi z=new Zi();
		z.eat();
	}
}
//创建父类
class Fu{
	int count=0;
	int sum=30;
}
//创建子类
class Zi extends Fu{
	int sum=20;
	public void eat(){
		int sum =10;
		System.out.println(sum);//10,就近原则
		System.out.println(this.sum);//this.调用了成员变量sum
		System.out.println(count);//使用了父类的资源	
		//在子类中使用父类的sum紫爱云，super可以调用父类的功能
		//super是父类对象的一个引用Fu super=new Fu();
		System.out.println(super.sum);//30,super.可以调用父类的功能
	}
}
