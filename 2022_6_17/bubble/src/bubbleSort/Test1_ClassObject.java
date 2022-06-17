package bubbleSort;
//这个类用来测试类和对象的创建和使用
//一个java文件中，可以存在多个类
//但是只能有一个类被public修饰，并且这个类就是java的文件名
public class Test1_ClassObject {

	public static void main(String[] args) {
		// 通过new关键字创建手机对象，测试
		Phone p=new Phone();
		//通过完成调用对象的功能
		p.call();//正在打电话
		p.message();//正在发短信；
		p.music();//正在听音乐
		
		System.out.println(p.color);//null
		System.out.println(p.size);//null
		System.out.println(p.model);//null
		System.out.println(p.price);//0.0
		System.out.println();//空行
		
		//创建第二个对象
		Phone p2=new Phone();
		//调用模板里的功能
		p2.call();
		p2.message();
		p2.music();
		
		//给对象的属性设置值
		p2.color="red";
		p2.size="5.9";
		p2.model="HUAWEI";
		p2.price=8888;
		
		System.out.println(p2.color);
		System.out.println(p2.size);
		System.out.println(p2.model);
		System.out.println(p2.price);
		}
}
//通过class创建手机类--用来描述手机这一类事物--特征+行为
//类是一类事物的抽象，只抽象的规定一类事物的特点和行为
class Phone{
	//特征--类的成员变量/是最能够--位置是在类里方法外
	String color;
	String size;
	String model;
	int price;
	
	//行为--类的成员方法
	//修饰符 返回值 方法名（参数列表）{方法体}
	public void call() {
		System.out.println("正在打电话");
	}
	public void message() {
		System.out.println("正在发短信");
	}
	public void music() {
		System.out.println("正在听音乐");
	}
}
